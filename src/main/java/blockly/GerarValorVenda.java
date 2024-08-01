package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class GerarValorVenda {

public static final int TIMEOUT = 300;

/**
 *
 * @param quantidade
 * @param valor
 *
 * @author Gabriel Bernardino De Oliveira
 * @since 01/08/2024, 08:19:49
 *
 */
public static Var gerarValor(@ParamMetaData(description = "quantidade", id = "9c99735a") Var quantidade, @ParamMetaData(description = "valor", id = "816fc32e") Var valor) throws Exception {
 return new Callable<Var>() {

   private Var valor_total = Var.VAR_NULL;

   public Var call() throws Exception {
    valor_total =
    cronapi.math.Operations.multiply(quantidade,valor);
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("vars.valor"), valor_total);
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param comprovante
 * @param produto
 * @param quantidade
 * @param valor_total
 *
 * @author Gabriel Bernardino De Oliveira
 * @since 01/08/2024, 08:19:49
 *
 */
public static Var salvarVenda(@ParamMetaData(description = "comprovante", id = "2b4afbbc") Var comprovante, @ParamMetaData(description = "produto", id = "3f05e1f8") Var produto, @ParamMetaData(description = "quantidade", id = "556e108c") Var quantidade, @ParamMetaData(description = "valor_total", id = "5064f3a4") Var valor_total) throws Exception {
 return new Callable<Var>() {

   private Var inserirVenda = Var.VAR_NULL;

   public Var call() throws Exception {
    if (
    Var.valueOf(comprovante.equals(
    Var.VAR_NULL)).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("Selecione o comprovante!"));
    } else if (
    Var.valueOf(produto.equals(
    Var.VAR_NULL)).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("Selecione o produto!"));
    } else if (
    Var.valueOf(quantidade.equals(
    Var.VAR_NULL)).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("Selecione a quantidade!"));
    } else {
        inserirVenda =
        cronapi.database.Operations.insert(Var.valueOf("app.entity.VENDAS"),Var.valueOf("comprovante_pagamento",comprovante),Var.valueOf("data_venda",
        cronapi.dateTime.Operations.getNow()),Var.valueOf("prODUTO",produto),Var.valueOf("quantidade",quantidade),Var.valueOf("usuario_venda",
        cronapi.util.Operations.getCurrentUserName()),Var.valueOf("valor_total",valor_total));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("vars.categoria"),
        Var.valueOf(""));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("vars.comprovante"),
        Var.valueOf(""));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("vars.produto"),
        Var.valueOf(""));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("vars.quantidade"),
        Var.valueOf(""));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("vars.valor"),
        Var.valueOf(""));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
        Var.valueOf("modalVendas"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
        Var.valueOf("queryCadastroVendas"),
        Var.valueOf("true"));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}


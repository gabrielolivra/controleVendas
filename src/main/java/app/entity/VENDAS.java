
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela VENDAS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"VENDAS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.VENDAS")
@CronappTable(role=CronappTableRole.CLASS)
public class VENDAS implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Data Venda")
    @Column(name = "data_venda", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_venda;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Usuario Venda")
    @Column(name = "usuario_venda", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String usuario_venda;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Quantidade")
    @Column(name = "quantidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer quantidade;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Valor Total", mask="#.#00,00")
    @Column(name = "valor_total", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valor_total;


    /**
    * @generated
    */
    @CronappColumn(attributeType="IMAGE_DATABASE", label="Comprovante Pagamento")
    @Column(name = "comprovante_pagamento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private byte[] comprovante_pagamento;


    /**
    * @generated
    */
    @OneToOne
    @JoinColumn(name="fk_PRODUTO", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private PRODUTO prODUTO;


    /**
    * Construtor
    * @generated
    */
    public VENDAS(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public VENDAS setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém data_venda
    * return data_venda
    * @generated
    */
    public java.util.Date getData_venda() {
        return this.data_venda;
    }

    /**
    * Define data_venda
    * @param data_venda data_venda
    * @generated
    */
    public VENDAS setData_venda(java.util.Date data_venda) {
        this.data_venda = data_venda;
        return this;
    }
    /**
    * Obtém usuario_venda
    * return usuario_venda
    * @generated
    */
    public java.lang.String getUsuario_venda() {
        return this.usuario_venda;
    }

    /**
    * Define usuario_venda
    * @param usuario_venda usuario_venda
    * @generated
    */
    public VENDAS setUsuario_venda(java.lang.String usuario_venda) {
        this.usuario_venda = usuario_venda;
        return this;
    }
    /**
    * Obtém quantidade
    * return quantidade
    * @generated
    */
    public java.lang.Integer getQuantidade() {
        return this.quantidade;
    }

    /**
    * Define quantidade
    * @param quantidade quantidade
    * @generated
    */
    public VENDAS setQuantidade(java.lang.Integer quantidade) {
        this.quantidade = quantidade;
        return this;
    }
    /**
    * Obtém valor_total
    * return valor_total
    * @generated
    */
    public java.lang.Double getValor_total() {
        return this.valor_total;
    }

    /**
    * Define valor_total
    * @param valor_total valor_total
    * @generated
    */
    public VENDAS setValor_total(java.lang.Double valor_total) {
        this.valor_total = valor_total;
        return this;
    }
    /**
    * Obtém comprovante_pagamento
    * return comprovante_pagamento
    * @generated
    */
    public byte[] getComprovante_pagamento() {
        return this.comprovante_pagamento;
    }

    /**
    * Define comprovante_pagamento
    * @param comprovante_pagamento comprovante_pagamento
    * @generated
    */
    public VENDAS setComprovante_pagamento(byte[] comprovante_pagamento) {
        this.comprovante_pagamento = comprovante_pagamento;
        return this;
    }
    /**
    * Obtém prODUTO
    * return prODUTO
    * @generated
    */
    public PRODUTO getPrODUTO() {
        return this.prODUTO;
    }

    /**
    * Define prODUTO
    * @param prODUTO prODUTO
    * @generated
    */
    public VENDAS setPrODUTO(PRODUTO prODUTO) {
        this.prODUTO = prODUTO;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
VENDAS object = (VENDAS)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}
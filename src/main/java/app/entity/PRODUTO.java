
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
* Classe que representa a tabela PRODUTO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"PRODUTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PRODUTO")
@CronappTable(role=CronappTableRole.CLASS)
public class PRODUTO implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Nome Produto")
    @Column(name = "nome_produto", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_produto;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Preco", mask="#.#00,00")
    @Column(name = "preco", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double preco;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_CATEGORIA", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private CATEGORIA caTEGORIA;


    /**
    * Construtor
    * @generated
    */
    public PRODUTO(){
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
    public PRODUTO setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_produto
    * return nome_produto
    * @generated
    */
    public java.lang.String getNome_produto() {
        return this.nome_produto;
    }

    /**
    * Define nome_produto
    * @param nome_produto nome_produto
    * @generated
    */
    public PRODUTO setNome_produto(java.lang.String nome_produto) {
        this.nome_produto = nome_produto;
        return this;
    }
    /**
    * Obtém preco
    * return preco
    * @generated
    */
    public java.lang.Double getPreco() {
        return this.preco;
    }

    /**
    * Define preco
    * @param preco preco
    * @generated
    */
    public PRODUTO setPreco(java.lang.Double preco) {
        this.preco = preco;
        return this;
    }
    /**
    * Obtém caTEGORIA
    * return caTEGORIA
    * @generated
    */
    public CATEGORIA getCaTEGORIA() {
        return this.caTEGORIA;
    }

    /**
    * Define caTEGORIA
    * @param caTEGORIA caTEGORIA
    * @generated
    */
    public PRODUTO setCaTEGORIA(CATEGORIA caTEGORIA) {
        this.caTEGORIA = caTEGORIA;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PRODUTO object = (PRODUTO)obj;
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
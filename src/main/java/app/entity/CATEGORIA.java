
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
* Classe que representa a tabela CATEGORIA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CATEGORIA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.CATEGORIA")
@CronappTable(role=CronappTableRole.CLASS)
public class CATEGORIA implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Categoria")
    @Column(name = "categoria", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String categoria;


    /**
    * Construtor
    * @generated
    */
    public CATEGORIA(){
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
    public CATEGORIA setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém categoria
    * return categoria
    * @generated
    */
    public java.lang.String getCategoria() {
        return this.categoria;
    }

    /**
    * Define categoria
    * @param categoria categoria
    * @generated
    */
    public CATEGORIA setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
CATEGORIA object = (CATEGORIA)obj;
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
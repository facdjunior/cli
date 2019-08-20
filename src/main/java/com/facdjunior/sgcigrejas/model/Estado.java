package com.facdjunior.sgcigrejas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Francisco
 */
@SuppressWarnings("serial")
@Entity
public class Estado extends GenericDomain {

    @ManyToOne
    @JoinColumn(nullable = false)
    @Cascade(CascadeType.MERGE)
    private Entidade entidade;
    
    @Column(length = 2, nullable = false)
    private String sigla;

    @Column(length = 50, nullable = false)
    private String nome;
    
    private String CodigoIBGE;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

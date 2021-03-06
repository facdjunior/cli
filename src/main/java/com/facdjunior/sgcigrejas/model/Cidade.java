package com.facdjunior.sgcigrejas.model;

/**
 *
 * @author Francisco
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Cidade extends GenericDomain {

    @ManyToOne
    @JoinColumn(nullable = false)
    private Entidade entidade;
    
    @Column(length = 50, nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Estado estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}

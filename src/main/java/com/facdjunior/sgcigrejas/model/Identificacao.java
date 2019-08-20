package com.facdjunior.sgcigrejas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Francisco Junior
 */
@SuppressWarnings("serial")
@Entity
public class Identificacao extends GenericDomain {

    @ManyToOne
    @JoinColumn(nullable = false)
    private Entidade entidade;
    
    @Column(length = 50, nullable = false)
    private String nome;
}

package com.facdjunior.sgcigrejas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Francisco
 */
@SuppressWarnings("serial")
@Entity
public class Endereco extends GenericDomain{

    @ManyToOne
    @JoinColumn(nullable = false)
    private Entidade entidade;
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer Sequencia;
    
    @Column(nullable = false, length = 150)
    private String rua;

    @Column(length = 10)
    private String numero;

    @Column(length = 120)
    private String Complemento;

    @Column(length = 10)
    private String CEP;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Bairro bairro;
    
    private Boolean Ativo;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Pessoa pessoa;

    
}

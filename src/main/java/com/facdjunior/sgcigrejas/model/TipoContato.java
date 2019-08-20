package com.facdjunior.sgcigrejas.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Francisco
 */
@SuppressWarnings("serial")
@Entity
public class TipoContato extends GenericDomain{
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer Sequencia;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Entidade entidade;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date DataCadastro;
    
    @Column(length = 80)
    private String TipoDado;
    
}

package com.facdjunior.sgcigrejas.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Francisco Junior
 */
public class PessoaJuridica extends GenericDomain{
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Entidade entidade;
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer Sequencia;
    
    @Column(nullable = false, length = 120)
    private String Razao;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date DataCadastro;
    
    @Temporal(TemporalType.DATE)
    private Date DataFundacao;

    public String getRazao() {
        return Razao;
    }

    public void setRazao(String Razao) {
        this.Razao = Razao;
    }

    public Date getDataCadastro() {
        return DataCadastro;
    }

    public void setDataCadastro(Date DataCadastro) {
        this.DataCadastro = DataCadastro;
    }

    public Date getDataFundacao() {
        return DataFundacao;
    }

    public void setDataFundacao(Date DataFundacao) {
        this.DataFundacao = DataFundacao;
    }
}

package com.facdjunior.sgcigrejas.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Francisco
 */
public class PessoaFisica {

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date DataNascimento;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date DataCadastro;

    @Column(nullable = false)
    private Character Sexo;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Identificacao identificacao;
    
    @Column(length = 90)
    private String Naturalidade;
    
    @Column(length = 60)
    private String GrauEscolaridade;

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public Date getDataCadastro() {
        return DataCadastro;
    }

    public void setDataCadastro(Date DataCadastro) {
        this.DataCadastro = DataCadastro;
    }

    public Character getSexo() {
        return Sexo;
    }

    public void setSexo(Character Sexo) {
        this.Sexo = Sexo;
    }

    public Identificacao getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(Identificacao identificacao) {
        this.identificacao = identificacao;
    }

    public String getNaturalidade() {
        return Naturalidade;
    }

    public void setNaturalidade(String Naturalidade) {
        this.Naturalidade = Naturalidade;
    }

    public String getGrauEscolaridade() {
        return GrauEscolaridade;
    }

    public void setGrauEscolaridade(String GrauEscolaridade) {
        this.GrauEscolaridade = GrauEscolaridade;
    }
}

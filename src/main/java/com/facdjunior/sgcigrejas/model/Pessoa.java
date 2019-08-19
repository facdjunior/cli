package com.facdjunior.sgcigrejas.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Francisco Junior
 */
public class Pessoa extends GenericDomain {

    @Column(length = 80, nullable = false)
    private String Nome;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date DataCadastro;

    @OneToOne
    @JoinColumn(nullable = false)
    private PessoaFisica pessoaFisica;

    @Column(length = 90)
    private String imagem;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Date getDataCadastro() {
        return DataCadastro;
    }

    public void setDataCadastro(Date DataCadastro) {
        this.DataCadastro = DataCadastro;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

}

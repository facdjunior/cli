package com.facdjunior.sgcigrejas.model;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Francisco
 */
public class Endereco {

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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

}

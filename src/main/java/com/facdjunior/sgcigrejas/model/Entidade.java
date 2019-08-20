package com.facdjunior.sgcigrejas.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Francisco
 */
@SuppressWarnings("serial")
@Entity
public class Entidade extends GenericDomain {

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date DataCadastro;

    @Transient
    private String imagem;

    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer Sequencia;

    private Boolean OptanteSimplesNacional;

    private Integer CodigoCnes;

    private Integer InscricaoEstadual;

    private Integer InscricaoMuninipal;

    private Boolean PossuiIncentivoFiscal;

    private Integer CodigoRegimeEspecial;

    @Column(nullable = false, precision = 6, scale = 2)
    private BigDecimal AliquotaSimples;

    @Column(nullable = false, precision = 6, scale = 2)
    private BigDecimal IssRetido;

    @Column(nullable = false, precision = 6, scale = 2)
    private BigDecimal PISS;

    @Column(nullable = false, precision = 6, scale = 2)
    private BigDecimal Confins;

    @Column(nullable = false, precision = 6, scale = 2)
    private BigDecimal IRRF;
    @Column(nullable = false, precision = 6, scale = 2)
    private BigDecimal CSLL;
    @Column(nullable = false, precision = 6, scale = 2)
    private BigDecimal INSS;

    private Boolean EmitirNFSe;

    public Date getDataCadastro() {
        return DataCadastro;
    }

    public void setDataCadastro(Date DataCadastro) {
        this.DataCadastro = DataCadastro;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Integer getSequencia() {
        return Sequencia;
    }

    public void setSequencia(Integer Sequencia) {
        this.Sequencia = Sequencia;
    }

    public Boolean getOptanteSimplesNacional() {
        return OptanteSimplesNacional;
    }

    public void setOptanteSimplesNacional(Boolean OptanteSimplesNacional) {
        this.OptanteSimplesNacional = OptanteSimplesNacional;
    }

    public Integer getCodigoCnes() {
        return CodigoCnes;
    }

    public void setCodigoCnes(Integer CodigoCnes) {
        this.CodigoCnes = CodigoCnes;
    }

    public Integer getInscricaoEstadual() {
        return InscricaoEstadual;
    }

    public void setInscricaoEstadual(Integer InscricaoEstadual) {
        this.InscricaoEstadual = InscricaoEstadual;
    }

    public Integer getInscricaoMuninipal() {
        return InscricaoMuninipal;
    }

    public void setInscricaoMuninipal(Integer InscricaoMuninipal) {
        this.InscricaoMuninipal = InscricaoMuninipal;
    }

    public Boolean getPossuiIncentivoFiscal() {
        return PossuiIncentivoFiscal;
    }

    public void setPossuiIncentivoFiscal(Boolean PossuiIncentivoFiscal) {
        this.PossuiIncentivoFiscal = PossuiIncentivoFiscal;
    }

    public Integer getCodigoRegimeEspecial() {
        return CodigoRegimeEspecial;
    }

    public void setCodigoRegimeEspecial(Integer CodigoRegimeEspecial) {
        this.CodigoRegimeEspecial = CodigoRegimeEspecial;
    }

    public BigDecimal getAliquotaSimples() {
        return AliquotaSimples;
    }

    public void setAliquotaSimples(BigDecimal AliquotaSimples) {
        this.AliquotaSimples = AliquotaSimples;
    }

    public BigDecimal getIssRetido() {
        return IssRetido;
    }

    public void setIssRetido(BigDecimal IssRetido) {
        this.IssRetido = IssRetido;
    }

    public BigDecimal getPISS() {
        return PISS;
    }

    public void setPISS(BigDecimal PISS) {
        this.PISS = PISS;
    }

    public BigDecimal getConfins() {
        return Confins;
    }

    public void setConfins(BigDecimal Confins) {
        this.Confins = Confins;
    }

    public BigDecimal getIRRF() {
        return IRRF;
    }

    public void setIRRF(BigDecimal IRRF) {
        this.IRRF = IRRF;
    }

    public BigDecimal getCSLL() {
        return CSLL;
    }

    public void setCSLL(BigDecimal CSLL) {
        this.CSLL = CSLL;
    }

    public BigDecimal getINSS() {
        return INSS;
    }

    public void setINSS(BigDecimal INSS) {
        this.INSS = INSS;
    }

    public Boolean getEmitirNFSe() {
        return EmitirNFSe;
    }

    public void setEmitirNFSe(Boolean EmitirNFSe) {
        this.EmitirNFSe = EmitirNFSe;
    }

}

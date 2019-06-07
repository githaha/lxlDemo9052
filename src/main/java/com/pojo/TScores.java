package com.pojo;

import java.math.BigDecimal;

public class TScores {
    private Long id;

    private String sno;

    private String cno;

    private BigDecimal degree;

    public TScores(Long id, String sno, String cno, BigDecimal degree) {
        this.id = id;
        this.sno = sno;
        this.cno = cno;
        this.degree = degree;
    }

    public TScores() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }

    public BigDecimal getDegree() {
        return degree;
    }

    public void setDegree(BigDecimal degree) {
        this.degree = degree;
    }
}
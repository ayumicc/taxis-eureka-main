package com.cc.taxis.model;

import javax.persistence.*;

public class Depart {
    @Id
    @Column(name = "depNo")
    private Integer depno;

    @Column(name = "depName")
    private String depname;

    @Column(name = "depMan")
    private String depman;

    public Depart(Integer depno, String depname, String depman) {
        this.depno = depno;
        this.depname = depname;
        this.depman = depman;
    }

    /**
     * @return depNo
     */
    public Integer getDepno() {
        return depno;
    }

    /**
     * @param depno
     */
    public void setDepno(Integer depno) {
        this.depno = depno;
    }

    /**
     * @return depName
     */
    public String getDepname() {
        return depname;
    }

    /**
     * @param depname
     */
    public void setDepname(String depname) {
        this.depname = depname;
    }

    /**
     * @return depMan
     */
    public String getDepman() {
        return depman;
    }

    /**
     * @param depman
     */
    public void setDepman(String depman) {
        this.depman = depman;
    }
}
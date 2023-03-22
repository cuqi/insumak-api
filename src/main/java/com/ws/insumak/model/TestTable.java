package com.ws.insumak.model;

import jakarta.persistence.*;

@Entity
@Table(name="testapex_tb1")
public class TestTable {
    @Id
    @Column(name="ID")
    private String ID;
    
    @Column(name="opis")
    private String opis;

    public TestTable() {}

    public TestTable(String iD, String opis) {
        ID = iD;
        this.opis = opis;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    
}

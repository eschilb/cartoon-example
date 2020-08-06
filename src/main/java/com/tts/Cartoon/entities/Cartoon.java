package com.tts.Cartoon.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartoon {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(length=1000000)
    private final String svg;
    
    public Cartoon() {
        this.svg = "";
    }
    
    public Cartoon(String svg) {
        this.svg = svg;
    }

    public long getId() {
        return id;
    }
    
    public String getSvg() {
        return svg;
    }

    
    @Override
    public String toString() {
        return "Cartoon{" + "id=" + id + ", svg=" + svg + '}';
    }


}

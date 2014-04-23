/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lolsto.findme.db.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mixa
 */
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "address")
public class Address implements Serializable {
    
    private static final long serialVersionUID = -8248161531491173164L;
    
    @XmlElement
    private Long id;
    
    @XmlElement
    private String country;
    @XmlElement
    private String city;
    
    @XmlTransient
    private User breeder;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "COUNTRY", nullable = false, length = 64)     
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "CITY", nullable = false, length = 64)     
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BREEDER_ID", nullable = false)    
    public User getBreeder() {
        return breeder;
    }

    public void setBreeder(User breeder) {
        this.breeder = breeder;
    }
    
}

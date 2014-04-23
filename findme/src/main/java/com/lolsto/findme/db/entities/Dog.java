/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lolsto.findme.db.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.Type;

/**
 *
 * @author mixa
 */
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "dogs")
public class Dog implements Serializable {
    
    private static final long serialVersionUID = 944243338679365729L;

    @XmlElement
    private Long id;
    
    @XmlElement
    private String status;
    @XmlElement
    private String breed;
    
    @XmlElement
    private String name;
    @XmlElement
    private String gender; 
    @XmlElement
    private Date dob;
    @XmlElement
    private Boolean forSale;
    @XmlElement
    private String description;
    
    @XmlTransient
    private Dog father;
    @XmlTransient
    private Dog mohter;
    
    @XmlElement
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

    @Column(name = "STATUS", nullable = false, length = 16)    
    public String getStatus() {
        return status;
    }    

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Column(name = "BREAD", nullable = false, length = 128)    
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Column(name = "NAME", nullable = false, length = 128)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "GENDER", nullable = false, length = 8)    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DOB", nullable = false)      
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Column(name = "FOR_SALE", nullable = false, columnDefinition = "BIT", length = 1)     
    public Boolean isForSale() {
        return forSale;
    }

    public void setForSale(Boolean forSale) {
        this.forSale = forSale;
    }

    @Type(type="text")
    @Column(name = "DESCRIPTION", length = 256)      
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }    
    
    @OneToOne
    @JoinColumn(name="FATHER_ID")
    public Dog getFather() {
        return father;
    }

    public void setFather(Dog father) {
        this.father = father;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="MOTHER_ID")    
    public Dog getMohter() {
        return mohter;
    }

    public void setMohter(Dog mohter) {
        this.mohter = mohter;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "BREEDER_ID", nullable = false) 
    public User getBreeder() {
        return breeder;
    }

    public void setBreeder(User breeder) {
        this.breeder = breeder;
    }
        
}

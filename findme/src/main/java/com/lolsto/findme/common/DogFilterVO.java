/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lolsto.findme.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author mixa
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DogFilterVO implements Serializable {
    
    private static final long serialVersionUID = -133590928181546540L;
    
    @XmlElement
    private String breed;    
    @XmlElement
    private String gender;
    @XmlElement(name = "for_sale")
    private Boolean forSale;
    @XmlElement(name = "breeder_id")
    private Integer breederId;
    @XmlElement
    private String country;

    public DogFilterVO() {
    }
    
    public DogFilterVO(String breed, String gender, Boolean forSale, Integer breederId, String country) {
        this.breed = breed;
        this.gender = gender;
        this.forSale = forSale;
        this.breederId = breederId;
        this.country = country;
    }
    
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean isForSale() {
        return forSale;
    }

    public void setForSale(Boolean forSale) {
        this.forSale = forSale;
    }

    public Integer getBreederId() {
        return breederId;
    }

    public void setBreederId(Integer breederId) {
        this.breederId = breederId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
}

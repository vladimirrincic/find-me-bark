/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lolsto.findme.db.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
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
@Table(name = "users")
public class User implements Serializable {
    
    private static final long serialVersionUID = -4889798125243086696L;
    
    @XmlElement
    private Integer id;
    @XmlElement
    private String status;
    @XmlElement
    private String type;
    @XmlElement
    private String username;
    @XmlTransient
    private String password;
    @XmlElement
    private String email;    
    @XmlElement
    private String name;
    @XmlElement
    private String kennelName;
    @XmlElement
    private String description;
    @XmlElement
    private Address address;
    @XmlTransient
    private Set<Dog> dogs = new HashSet<>();
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)      
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "STATUS", nullable = false, length = 8)    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "TYPE", nullable = false, length = 8)    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }    
    
    @Column(name = "USERNAME", unique = true, nullable = false, length = 64)     
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "PASSWORD", nullable = false, length = 128)    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "KENNEL_NAME", length = 128)    
    public String getKennelName() {
        return kennelName;
    }

    public void setKennelName(String kennelName) {
        this.kennelName = kennelName;
    }

    @Column(name = "EMAIL", nullable = false, length = 64)     
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "NAME", nullable = false, length = 128)    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Type(type="text")
    @Column(name = "DESCRIPTION", length = 256)       
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "breeder")
    public Set<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(Set<Dog> dogs) {
        this.dogs = dogs;
    }

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "breeder")    
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    
    
}

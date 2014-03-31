/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lolsto.findme.db.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author mixa
 */
@Entity
@Table(name = "connection")
public class Connection implements Serializable {
    
    private Long id;
    
    private String status;
    
    private Dog dog;
    private Breeder breeder;
    private Guest user;

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

    @OneToOne
    @JoinColumn(name="DOG_ID", nullable = false)    
    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @ManyToOne
    @JoinColumn(name = "BREEDER_ID", nullable = false) 
    public Breeder getBreeder() {
        return breeder;
    }

    public void setBreeder(Breeder breeder) {
        this.breeder = breeder;
    }

    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)    
    public Guest getUser() {
        return user;
    }

    public void setUser(Guest user) {
        this.user = user;
    }
    
    
}

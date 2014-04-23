/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lolsto.findme.enums;

/**
 *
 * @author mixa
 */
public enum BreedEnum {
    
    GOLDEN_RETRIVER("Golden Retriever"),
    BULLDOG("Bulldog"),
    BULL_TERRIER("Bull Terrier"),
    STAFFORD("Stafford"),
    ;
    
    private String breed;
    
    private BreedEnum(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    
    
}

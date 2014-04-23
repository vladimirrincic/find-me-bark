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
public enum UserTypeEnum {
    
    BREEDER("BREEDER"),
    BUYER("BUYER"),
    ;
    
    private String type;
    
    private UserTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}

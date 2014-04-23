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
public enum DogStatusEnum {
    
    PRIVATE("PRIVATE"),
    FOR_SALE("FOR_SALE"),
    SOLD("SOLD"),
    REMOVED("REMOVED"),
    ;
    
    private String status;
    
    private DogStatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    
}

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
public enum UserStatusEnum {
   
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    DELETED("DELETED"),
    ;
    
    private String status;
    
    private UserStatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }


}

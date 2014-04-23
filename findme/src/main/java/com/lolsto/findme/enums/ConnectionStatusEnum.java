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
public enum ConnectionStatusEnum {
    
    ACTIVE("ACTIVE"),
    SUCCESSFUL("SUCCESSFUL"),
    UNSUCCESSFUL("UNSUCCESSFUL"),
    ;
    
    private String status;
    
    private ConnectionStatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}

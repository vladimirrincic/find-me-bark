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
public class PaginationVO implements Serializable {
    
    private static final long serialVersionUID = -6349985233793176101L;
 
    /** No of results required per page */
    @XmlElement
    private Integer resultsPerPage;
    /** Page number */
    @XmlElement
    private Integer pageNo;
    /** Sort order (asc, desc) */
    @XmlElement
    private String sortOrder;
    /** DB column on which sort is needed */
    @XmlElement
    private String sortType;    

    public Integer getResultsPerPage() {
        return resultsPerPage;
    }

    public void setResultsPerPage(Integer resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lolsto.findme.db.dao;

import com.lolsto.findme.common.DogFilterVO;
import com.lolsto.findme.common.PaginationVO;
import com.lolsto.findme.db.entities.Dog;
import java.util.List;

/**
 *
 * @author mixa
 */
public interface DogDAO extends BaseDAO {
    
    
    List<Dog> getDogs(DogFilterVO dogFilterVO, PaginationVO paginationVO);
}

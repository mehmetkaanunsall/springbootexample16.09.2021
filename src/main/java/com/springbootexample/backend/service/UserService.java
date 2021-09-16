/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootexample.backend.service;

import com.springbootexample.backend.dto.UserCreateDTO;
import com.springbootexample.backend.dto.UserViewDTO;
import java.util.List;


/**
 *
 * @author kaan.unsal
 */
public interface UserService {
    
    UserViewDTO getUserById( Long id);
    
    UserViewDTO createUser( UserCreateDTO userCreateDTO);

    List<UserViewDTO> getUsers();
    
}

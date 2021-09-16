/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootexample.backend.dto;

import com.springbootexample.backend.model.User;
import java.io.Serializable;
import lombok.Getter;


@Getter
public final class UserViewDTO implements Serializable{
    private final String firstName;
    
    private final String lastName;

    private UserViewDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public static UserViewDTO of(User user)
    {
        return new UserViewDTO(user.getFirstName(), user.getLastName());
    }
    
}

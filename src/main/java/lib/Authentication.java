/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import entity.User;
/**
 *
 * @author daudau
 */
public class Authentication {
    
    public boolean authenticateUser(User user) {
        System.out.println("authenticating user fuck: "+user.getUsername() + " | "+user.getPassword());
        return false;
    }
}

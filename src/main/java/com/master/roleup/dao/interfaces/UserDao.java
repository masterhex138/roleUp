/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.master.roleup.dao.interfaces;

import com.master.roleup.model.TUsers;




public interface UserDao {
    TUsers findByUserName(String username);
}

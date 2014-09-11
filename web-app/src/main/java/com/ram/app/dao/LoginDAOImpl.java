package com.ram.app.dao;

import com.ram.app.data.UserValue;

import org.springframework.stereotype.Repository;


/**
 * @author ramdangi
 */
@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {

    @Override
    public UserValue getUserDetails(String userName) {
        UserValue user = new UserValue();
        user.setFirstName("Ram");
        user.setLastName("Dangi");
        user.setPassword("password");
        return user;
    }
}

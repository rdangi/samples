package com.ram.app.dao;

import com.ram.app.data.UserValue;

/**
 * @author ramdangi
 */
public interface LoginDAO {
    public UserValue getUserDetails(String userName);
}
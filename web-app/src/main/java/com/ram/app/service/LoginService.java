package com.ram.app.service;

import com.ram.app.data.UserValue;
import com.ram.app.model.LoginModel;

/**
 * @author ramdangi
 */
public interface LoginService {
	
    public boolean authenticateUser(LoginModel loginModel);
        
    public UserValue getUserDetails(String loginId, String password);
}

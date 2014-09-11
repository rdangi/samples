package com.ram.app.service;

import com.ram.app.dao.LoginDAO;
import com.ram.app.data.UserValue;
import com.ram.app.model.LoginModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ramdangi
 */
@Service("loginService")
public class LoginServiceImpl  implements LoginService {
	@Autowired
	LoginDAO loginDAO;

    @Override
    public boolean authenticateUser(LoginModel loginModel) {
        return (loginModel.getPassword().equals("password"));
    }
    
    @Override
    public UserValue getUserDetails(String loginId,String password){
        UserValue userValue = loginDAO.getUserDetails(loginId);
        return userValue;
    }

}

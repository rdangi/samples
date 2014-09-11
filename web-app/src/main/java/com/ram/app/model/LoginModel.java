package com.ram.app.model;

/**
 * This model class contains the properties for the filed on the login.jsp page.
 *
 * @author ramdangi
 *
 */
public class LoginModel {
    
    private String loginName;

    /* This is the attribute name (path) of Password field in login.jsp page */
    private String password;
    
     /* This is the attribute name (path) of username field in login.jsp page */
    private String userName;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    
    /* Getters and setters for the private fields. */
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

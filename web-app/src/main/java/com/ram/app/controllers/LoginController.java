package com.ram.app.controllers;

import com.ram.app.data.UserValue;
import com.ram.app.model.LoginModel;
import com.ram.app.service.LoginService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ramdangi
 */

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    //Creating the loginmodel object.
    private LoginModel loginModel;

    @Autowired
    private LoginService loginService;

    /**
     * This method will load the login.jsp page when the application starts
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView init() {
        loginModel = new LoginModel();
        return new ModelAndView("login", "loginDetails", loginModel);
    }

    /**
     * This method will be called when the user submits the login details from
     *
     * @param loginModel
     * @param bindingResult
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("loginDetails") LoginModel loginModel, BindingResult bindingResult,
            HttpServletRequest request, HttpServletResponse response) {
        try {
            
            if((loginService.authenticateUser(loginModel))){
                UserValue useValue = loginService.getUserDetails(loginModel.getLoginName(),loginModel.getPassword());
                loginModel.setUserName(useValue.getFirstName()+" "+useValue.getLastName());
                return new ModelAndView("success", "loginDetails", loginModel);
            } 
            
            return new ModelAndView("login", "loginDetails", loginModel);
            
        } catch (Exception e) {
            System.out.println("Exception in LoginController " + e.getMessage());
            return new ModelAndView("login", "loginDetails", loginModel);
        }
    }
}

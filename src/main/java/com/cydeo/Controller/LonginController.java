package com.cydeo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LonginController {
@RequestMapping("login/{email}/{phoneNumber}")
    public String longininfo(@PathVariable String email,@PathVariable int phoneNumber, Model model){
       String loginMessage ="Login Successful";
      model.addAttribute("email",email);
      model.addAttribute("phoneNumber",phoneNumber);
       model.addAttribute("loginMessage",loginMessage);
//    System.out.println(email);
//    System.out.println(phoneNumber);
//    System.out.println(loginMessage);

        return "login/login-info";
    }
}

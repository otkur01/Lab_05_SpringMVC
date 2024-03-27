package com.cydeo.Controller;

import com.cydeo.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class ProfileController {

    @RequestMapping("profile")
    public String profile(Model model){
        Profile profile = new Profile();
        profile.setName("Hekim");
        profile.setSurname("otkur");
        profile.setEmail("hekem@gmail.com");
        profile.setPhoneNumber("0123456789");
        profile.setCreatedDate(LocalDateTime.now());

      model.addAttribute("profile",profile);


        return "profile/profile-info";
    }

}

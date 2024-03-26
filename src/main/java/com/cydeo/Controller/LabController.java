package com.cydeo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LabController {
    @RequestMapping("/lab")
    public String labInfo(Model model){
        String firstLab = "Lab-01-Coupling";
        String secondLab = "Lab-02-IoC";
        String thirdLab = "Lab-03-DI";
        String fourthLab = "Lab-04-Spring Boot";
        String fifthLab = "Lab-05-Spring MVC";
       model.addAttribute("firstLab",firstLab);
       model.addAttribute("secondLab",secondLab);
       model.addAttribute("thirdLab",thirdLab);
       model.addAttribute("fourthLab",fourthLab);
       model.addAttribute("fifthLab",fifthLab);

        return "lab/lab-list";
    }


}

package com.thiagomuller.BasicFormProject.Controller;

import com.thiagomuller.BasicFormProject.Model.Player;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, trimmer);
    }

    @RequestMapping("/")
    public String showForm(Model model){
        model.addAttribute("player", new Player());
        return "basic-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("player") Player player,
                              BindingResult result){
        if(result.hasErrors()){
            System.out.println(result.getFieldError());
            return "basic-form";
        } else{
            return "confirmation-page";
        }
    }
}

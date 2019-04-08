package com.thiagomuller.SpringMvcDemo.Controller;

import com.thiagomuller.SpringMvcDemo.Model.Customer;
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
@RequestMapping("/customer")
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, trimmer);
    }

    @RequestMapping("/showForm")
    public String showCustomerForm(Model model){
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processCustomerForm(@Valid @ModelAttribute("customer")
                                      Customer customer, BindingResult result){
        if (result.hasErrors()){
            return "customer-form";
        } else{
            return "customer-confirmation";
        }
    }
}

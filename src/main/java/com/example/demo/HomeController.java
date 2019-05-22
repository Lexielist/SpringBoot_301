package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/doginputform")
    public String loadDogInputForm(Model model) {
        model.addAttribute("dog", new Dog());
        return "doginputform";
    }

    @PostMapping("/doginputform")
    public String processDogInputForm(@Valid Dog dog,
                BindingResult result){
                if (result.hasErrors()) {
                    return "doginputform";
                }
                return "dogconfirm";

    }

}

package com.example.bookshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";

    /*    public String greeting (@RequestParam(name = "name", defaultValue = "Amanda", required = false) String name, Model model) {
            model.addAttribute("name", name);
            return "greeting"; */
    }

    @PostMapping("/greeting")
    public String greetingSubmit (@ModelAttribute("greeting") Greeting greeting) {
        return "result";
    }



}
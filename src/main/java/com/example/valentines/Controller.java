package com.example.valentines;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/namecontroller")
public class Controller {
    private String inputName;
   // @Autowired
    //private DBService dbService;
    @GetMapping("/acquirename")
    public RedirectView getName(@RequestParam String namess){
        System.out.println(namess);
        this.inputName = namess;
        //dbService.addData(namess);
        if(namess.toLowerCase().equals("fahima") || namess.toLowerCase().equals("fahima noufal")){
            return new RedirectView("bemyvalentine1.html");
        }
        else{
            return new RedirectView("whoru.html");
        }
        
        

    }
    
}

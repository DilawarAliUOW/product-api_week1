package uk.ac.westminster.product_api_week1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class InfoController {

    @GetMapping("/info")
    public String infor(){
        return "Products API — 5COSC019W Tutorial 1 build.";
    }
}

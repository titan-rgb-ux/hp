package com.example.pcm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class tank { // Renamed class for clarity (optional but recommended)

    @GetMapping("/project")
    public String redirectToProject() {
        return "forward:/index.html";
    }

    @GetMapping("/aboutus")
    public String redirectToAboutUs() {
        return "forward:/ind.html";
    }

    @GetMapping("/game")
    public String redirectToGame() {
        return "forward:/inde.html";
    }

}
package me.anna.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    // Display the Home page
    @GetMapping("/")
    public String showFavouriteRecipes()
    {
        return "index";
    }

    // Display the Crab Cakes recipe page
    @GetMapping("/crabcakes")
    public String showCrabbyWebPage()
    {
        return "crabcakes";
    }

    // Display the Ginger Ale recipe page
    @GetMapping("/gingerale")
    public String showGingerAle()
    {
        return "gingerale";
    }

    // Display the Corn Bread recipe page
    @GetMapping("/cornbread")
    public String showCornBread()
    {
        return "cornbread";
    }
}

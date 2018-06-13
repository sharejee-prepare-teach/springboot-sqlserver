package guru.springframework.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rith on 6/13/2018.
 */
@Controller
public class HomeController {
    @RequestMapping(value = {"/","/home"})
    private String getHome(){
        return "home";
    }
}

package pl.edu.vistula.MyFirst_Java_Spring_Project.controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello VISTULA university and welcome to my first Spring Boot project";
    }
    @GetMapping("/greeting")
    public String greeting(@RequestParam( name="name", required=false, defaultValue="World")  String name,  Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}

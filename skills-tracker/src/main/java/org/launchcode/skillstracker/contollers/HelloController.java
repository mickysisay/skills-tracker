package org.launchcode.skillstracker.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping(value = "hello")
    @ResponseBody
    public static String greet(){
        return "hello Mr. no name";
    }
    @RequestMapping(value = "hello/{name}")
    @ResponseBody
    public static String greetings(@PathVariable String name){

        return "Hello "+name;

    }

}

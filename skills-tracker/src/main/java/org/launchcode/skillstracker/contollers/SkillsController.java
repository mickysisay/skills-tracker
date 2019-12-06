package org.launchcode.skillstracker.contollers;

import org.launchcode.skillstracker.Model.Programming;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class SkillsController {
   private static Programming programming = new Programming();
   @GetMapping(value="")
   public static String home(){
      return "index";
   }
   @GetMapping(value="form")
    public static String formHandler(Model model){
       model.addAttribute("languages",programming.getLanguages());
       model.addAttribute("numbers",programming.getNumbers());
       return "Skillform.html";
   }
   @PostMapping(value="form")
   public static String addController(@RequestParam String newlanguage){
      if(!newlanguage.isEmpty()) {
         programming.addLanguages(newlanguage);
      }
      return "redirect:/form";
   }
   @PostMapping(value="info")
    public static String formPostHandler(Model model, @RequestParam ArrayList<String> names,@RequestParam String usernames){
       System.out.println(usernames);
       model.addAttribute("usernames",usernames);
       model.addAttribute("names",names);
       return "myskills.html";
   }

}

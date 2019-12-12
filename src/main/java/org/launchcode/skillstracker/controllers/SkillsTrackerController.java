package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsTrackerController {

    @GetMapping("/")
    public String root(){
        String htmlString = "" +
                "<h1>Skills Tracker</h1>" +
                "<br>" +
                "<h2>We have a few skills that we would like to learn.  Here is the list! </h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Angular</li>" +
                "</ol>";
        return htmlString;
    }

    @GetMapping("/form")
    public String form(){
        String form = "" +
                "<form action='/' method='post'>" +
                    "<label>Name: </label><br>" +
                    "<input type='text' name='name'/><br>" +

                    "<label>My favorite language:</label><br>" +
                    "<select name='fChoice'>" +
                        "<option>Java</option>" +
                        "<option>JavaScript</option>" +
                        "<option>Angular</option>" +
                    "</select><br>" +

                    "<label>My second favorite language:</label><br>" +
                    "<select name='sChoice'>" +
                        "<option>Java</option>" +
                        "<option>JavaScript</option>" +
                        "<option>Angular</option>" +
                    "</select><br>" +

                    "<label>My third favorite language:</label><br>" +
                    "<select name='tChoice'>" +
                        "<option>Java</option>" +
                        "<option>JavaScript</option>" +
                        "<option>Angular</option>" +
                    "</select><br>" +
                    "<input type='submit' value='submit' />" +
                "</form>";
        return form;
    }

//    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST})
    @PostMapping(path = "/")
    public String displayChoice(@RequestParam String name, @RequestParam String fChoice, @RequestParam String sChoice, @RequestParam String tChoice){
        String displayUserChoice = "" +
                "<h2>"+name+"</h2>" +
                "<ol>" +
                "<li>"+fChoice+"</li>"+
                "<li>"+sChoice+"</li>"+
                "<li>"+tChoice+"</li>" +
                "</ol>";
        return displayUserChoice;
    }
}

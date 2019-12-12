package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsTrackerController {

    @GetMapping
    public String root(){
        String htmlString = "" +
                "<h1>Skills Tracker</h1>" +
                "<br>" +
                "<h2>We have a few skills that we would like to learn.  Her is the list! </h2>" +
                "<ol>Java</ol>" +
                "<ol>JavaScript</ol>" +
                "<ol>Angular</ol>";
        return htmlString;
    }

    @GetMapping("/form")
    public String form(){
        String form = "" +
                "<form>" +
                    "<label>Name: </label><br>" +
                    "<input type='text'/><br>" +

                    "<label>My favorite language:</label><br>" +
                    "<select>" +
                        "<option>Java</option>" +
                        "<option>JavaScript</option>" +
                        "<option>Angular</option>" +
                    "</select><br>" +

                    "<label>My second favorite language:</label><br>" +
                    "<select>" +
                        "<option>Java</option>" +
                        "<option>JavaScript</option>" +
                        "<option>Angular</option>" +
                    "</select><br>" +

                    "<label>My third favorite language:</label><br>" +
                    "<select>" +
                        "<option>Java</option>" +
                        "<option>JavaScript</option>" +
                        "<option>Angular</option>" +
                    "</select>" +
                "</form>";
        return form;
    }
}

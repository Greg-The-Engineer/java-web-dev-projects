package org.launchcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping(value = "")
    @ResponseBody
    public String startSkills() {
        String html = "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";

        return html;
    }

    @GetMapping(value = "display")
    @ResponseBody
    public String displaySkills(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        String html = "<h1>Hello, " + name + "!</h1>" +
                "<h2>Your favorite programming languages are:</h2>" +
                "<table>" +
                "<tr><th>Rank</th><th>Language</th></tr>" +
                "<tr><td>1st</td><td>" + firstChoice + "</td></tr>" +
                "<tr><td>2nd</td><td>" + secondChoice + "</td></tr>" +
                "<tr><td>3rd</td><td>" + thirdChoice + "</td></tr>" +
                "</table>";

        return html;
    }

    @GetMapping(value = "form")
    @ResponseBody
    public String formSkills() {
        String html = "<form method='post' action='/form'>" +
                "Name:<br>" +
                "<input type='text' name='name' /><br>" +
                "<table>" +
                "<tr><th>Rank</th><th>Programming Language</th></tr>" +
                "<tr><td>1st</td><td><select name='firstChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select></td></tr>" +
                "<tr><td>2nd</td><td><select name='secondChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select></td></tr>" +
                "<tr><td>3rd</td><td><select name='thirdChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select></td></tr>" +
                "</table>" +
                "<br><input type='submit' value='Submit' />" +
                "</form>";

        return html;
    }

    @PostMapping(value = "form")
    @ResponseBody
    public String namePage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        String html = "<h1>Hello, " + name + "!</h1>" +
                "<h2>Your favorite programming languages are:</h2>" +
                "<table>" +
                "<tr><th>Rank</th><th>Language</th></tr>" +
                "<tr><td>1st</td><td>" + firstChoice + "</td></tr>" +
                "<tr><td>2nd</td><td>" + secondChoice + "</td></tr>" +
                "<tr><td>3rd</td><td>" + thirdChoice + "</td></tr>" +
                "</table>";

        return html;
    }
}
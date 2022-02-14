package org.launchcode.codingevents.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;



@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayEvents(Model model){
        List<String> events = new ArrayList<>();
        events.add("can You code this?");
        events.add("I think, therefore I code ");
        events.add("The happiness of your life depends on the quality of your code");
        events.add("Believe you can code and you're halfway there");
        model.addAttribute("events", events);
        return"events/index";
    }

    //lives at/events/create
    @GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
    }

}

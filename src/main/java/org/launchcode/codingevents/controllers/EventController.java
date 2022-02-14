package org.launchcode.codingevents.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



@Controller
@RequestMapping("events")
public class EventController {

//    private static List<String> events = new ArrayList<>();
private static HashMap<String, String> events = new HashMap<>();
    @GetMapping
    public String displayAllEvents(Model model){
        events.put("CodeConfuzled", "we write outdated code, you fix it!");
        events.put("Tacos and Textboxes", "eat as many tacos as you can while coding as fast as you can!");
        events.put("Implementation Instrumentation", "can you code using a piano? lets find out...");
        model.addAttribute("events", events);
        return "events/index";
    }

    //lives at/events/create
    @GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
    }

    //lives at /events/create
    @PostMapping("create")
    public String createEvent(@RequestParam String eventName) {
//        events.add(eventName);
        return "redirect:";
    }

}

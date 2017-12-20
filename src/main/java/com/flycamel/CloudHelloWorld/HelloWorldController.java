package com.flycamel.CloudHelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/config", produces = MediaType.TEXT_HTML_VALUE)
public class HelloWorldController {

    @Autowired
    private HelloWorldStaticService helloWorldStaticService;

    @Autowired
    private HelloWorldDynamicService helloWorldDynamicService;

    @GetMapping(value = "/static")
    public String getStatic(Model model) {
        model.addAllAttributes(helloWorldStaticService.getTestKeywords());
        return "checkKeyword";
    }

    @GetMapping(value = "/dynamic")
    public String getDynamic(Model model) {
        model.addAllAttributes(helloWorldDynamicService.getTestKeywords());
        return "checkKeyword";
    }
}

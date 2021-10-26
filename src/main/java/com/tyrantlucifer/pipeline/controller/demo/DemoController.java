package com.tyrantlucifer.pipeline.controller.demo;

import com.tyrantlucifer.pipeline.service.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "demo")
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String helloWorld() {
        return demoService.helloWorld();
    }
}

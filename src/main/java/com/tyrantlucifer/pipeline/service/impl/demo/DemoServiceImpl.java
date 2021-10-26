package com.tyrantlucifer.pipeline.service.impl.demo;

import com.tyrantlucifer.pipeline.service.demo.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String helloWorld() {
        return "hello world";
    }
}

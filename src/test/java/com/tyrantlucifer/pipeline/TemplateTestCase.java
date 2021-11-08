package com.tyrantlucifer.pipeline;

import com.alibaba.fastjson.JSON;
import com.tyrantlucifer.pipeline.entity.template.output.TerminalOutputTemplate;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class TemplateTestCase {
    @Test
    public void terminalTemplateTest() {
        TerminalOutputTemplate terminalOutputTemplate = new TerminalOutputTemplate();
        terminalOutputTemplate.template = null;
        terminalOutputTemplate.name = "test";
        terminalOutputTemplate.category = "terminalOutput";
        String s = JSON.toJSONString(terminalOutputTemplate);
        TerminalOutputTemplate template = JSON.parseObject("{\"category\":\"terminalOutput\",\"name\":\"test\",\"sink\":true,\"source\":false}",
                TerminalOutputTemplate.class);
        System.out.println(template.template);
        System.out.println(s);
    }
}

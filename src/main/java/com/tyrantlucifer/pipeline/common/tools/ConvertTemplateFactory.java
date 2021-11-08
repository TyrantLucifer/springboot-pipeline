package com.tyrantlucifer.pipeline.common.tools;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tyrantlucifer.pipeline.entity.template.AbstractTemplate;
import com.tyrantlucifer.pipeline.entity.template.output.TerminalOutputTemplate;

public class ConvertTemplateFactory {

    public static AbstractTemplate convertTemplate(JSONObject template) {
        String category = template.getString("category");
        switch (category) {
            case "terminalOutput":
                return JSON.parseObject(template.toJSONString(), TerminalOutputTemplate.class);
            default:
                return null;
        }
    }
}

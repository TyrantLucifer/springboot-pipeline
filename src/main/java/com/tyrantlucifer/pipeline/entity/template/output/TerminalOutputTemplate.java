package com.tyrantlucifer.pipeline.entity.template.output;

import com.alibaba.fastjson.JSONObject;
import com.tyrantlucifer.pipeline.entity.template.AbstractTemplate;


public class TerminalOutputTemplate extends AbstractTemplate {

    /**
     * freemarker模板配置
     */
    public JSONObject template;

    @Override
    public String toString() {
        return "TerminalOutputTemplate{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", template=" + template +
                '}';
    }
}

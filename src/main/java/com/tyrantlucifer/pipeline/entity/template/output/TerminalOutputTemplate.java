package com.tyrantlucifer.pipeline.entity.template.output;

import com.alibaba.fastjson.JSONObject;
import com.tyrantlucifer.pipeline.entity.template.AbstractTemplate;

import java.util.Optional;

public class TerminalOutputTemplate extends AbstractTemplate {

    /**
     * freemarker模板配置
     */
    public Optional<JSONObject> template;

}

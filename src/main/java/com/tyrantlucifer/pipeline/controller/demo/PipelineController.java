package com.tyrantlucifer.pipeline.controller.demo;

import com.tyrantlucifer.pipeline.common.api.CommonResult;
import com.tyrantlucifer.pipeline.entity.template.PipelineTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api")
public class PipelineController {

    @RequestMapping(value = "pipeline", method = RequestMethod.POST)
    public CommonResult<Object> startPipeline(@RequestBody PipelineTemplate pipelineTemplate) {
        return CommonResult.success(pipelineTemplate);
    }
}

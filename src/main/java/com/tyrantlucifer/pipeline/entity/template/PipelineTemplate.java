package com.tyrantlucifer.pipeline.entity.template;

import com.alibaba.fastjson.JSONObject;
import com.tyrantlucifer.pipeline.common.tools.ConvertTemplateFactory;
import com.tyrantlucifer.pipeline.entity.template.runtime.StageTemplate;
import lombok.Data;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class PipelineTemplate {
    /**
     * 任务id
     */
    public String id;
    /**
     * 任务名称
     */
    public String name;
    /**
     * 任务分类
     */
    public String category;
    /**
     * 任务模板列表
     */
    public List<JSONObject> templates;
    /**
     * 任务阶段列表
     */
    public List<JSONObject> stages;

    /**
     * 将任务中的模板json转换为对应的实体类
     * @return 任务模板实体类列表
     */
    private List<AbstractTemplate> taskTemplateList() {
        return templates.stream()
                .map(ConvertTemplateFactory::convertTemplate)
                .collect(Collectors.toList());
    }

    /**
     * 将任务中的阶段json转换为阶段实体类
     * @return 阶段实体类列表
     */
    public List<StageTemplate> stageList() {
        return stages.stream()
                .map(stage -> new StageTemplate(stage.getString("start"), stage.getString("end")))
                .distinct()
                .collect(Collectors.toList());
    }

    /**
     * 过滤模板中没有在stage中配置的模板
     * @return 过滤后的模板列表
     */
    public List<AbstractTemplate> usedTemplate() {
        List<String> list = this.stageList()
                .stream()
                .map(stageTemplate -> Arrays.asList(stageTemplate.start, stageTemplate.end))
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
        return this.taskTemplateList()
                .stream()
                .filter(task -> list.contains(task.name))
                .collect(Collectors.toList());
    }

}

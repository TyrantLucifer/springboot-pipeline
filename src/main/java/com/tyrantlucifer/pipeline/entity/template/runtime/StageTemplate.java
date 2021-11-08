package com.tyrantlucifer.pipeline.entity.template.runtime;

import com.tyrantlucifer.pipeline.entity.template.AbstractTemplate;

public class StageTemplate extends AbstractTemplate {

    /**
     * 当前阶段的起始模板名称
     */
    public String start;
    /**
     * 当前阶段的终止模板名称
     */
    public String end;

    /**
     * 构造方法
     * @param start 起始模板名称
     * @param end 终止模板名称
     */
    public StageTemplate(String start, String end) {
        this.start = start;
        this.end = end;
        this.name = start + "->" + end;
        this.category = "stage";
    }

    @Override
    public String toString() {
        return "StageTemplate{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                '}';
    }
}

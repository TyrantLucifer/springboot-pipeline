package com.tyrantlucifer.pipeline.entity.template;

public abstract class AbstractTemplate {

    /**
     * 模板名称
     */
    public String name;
    /**
     * 模板类型
     */
    public String category;

    /**
     * 是否是Source模板
     * @return boolean
     */
    public Boolean isSource() {
        return category.contains("Input");
    }

    /**
     * 是否是Sink模板
     * @return boolean
     */
    public Boolean isSink() {
        return category.contains("Output");
    }
}

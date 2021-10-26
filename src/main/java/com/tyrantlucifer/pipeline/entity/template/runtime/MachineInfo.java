package com.tyrantlucifer.pipeline.entity.template.runtime;

import org.springframework.beans.factory.annotation.Value;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MachineInfo {

    /**
     * 执行任务机器ip
     */
    public String ip;

    /**
     * 执行任务机器端口
     */
    @Value("${server.port}")
    public String port;

    /**
     * 执行任务机器主机名
     */
    public String name;

    /**
     * 执行任务机器java版本
     */
    public String javaVersion;

    /**
     * 构造方法
     * @throws UnknownHostException 主机名未知异常
     */
    public MachineInfo() throws UnknownHostException {
        this.ip = InetAddress.getLocalHost().getHostAddress();
        this.name = InetAddress.getLocalHost().getHostName();
        this.javaVersion = System.getProperty("java.version");
    }

    @Override
    public String toString() {
        return "MachineInfo{" +
                "ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", name='" + name + '\'' +
                ", javaVersion='" + javaVersion + '\'' +
                '}';
    }
}

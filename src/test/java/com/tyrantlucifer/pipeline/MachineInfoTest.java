package com.tyrantlucifer.pipeline;

import com.tyrantlucifer.pipeline.entity.template.runtime.MachineInfo;
import org.junit.jupiter.api.Test;

import java.net.UnknownHostException;

public class MachineInfoTest {
    @Test
    public void getMachineInfo() throws UnknownHostException {
        MachineInfo machineInfo = new MachineInfo();
        System.out.println(machineInfo.toString());
    }
}

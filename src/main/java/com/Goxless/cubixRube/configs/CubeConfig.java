package com.Goxless.cubixRube.configs;

import com.Goxless.cubixRube.cubeStructure.specificCubes.SixSideCube;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.Goxless.cubibRube.cubeStructure")
@Slf4j
public class CubeConfig {


    public SixSideCube getSixSideCube(){
        return new SixSideCube();
    }

}

package com.Goxless.cubixRube.services;


import com.Goxless.cubixRube.cubeStructure.DTO.CubeDTO;
import com.Goxless.cubixRube.cubeStructure.specificCubes.SixSideCube;
import com.Goxless.cubixRube.repositories.CubeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "cube-app")
public class CubeService {


    private final CubeRepository repository;

    public ResponseEntity postCubeToSolve(CubeDTO DTOcube){

        SixSideCube cube = (SixSideCube)DTOcube.convertToEntity(new SixSideCube());

        if(!cube.isConfiguredRight())
            return ResponseEntity.status(406).body("Not acceptable 3x3x3 cube configuration");
            //change 2 throwing exception later


        return ResponseEntity.ok().build();
    }




}

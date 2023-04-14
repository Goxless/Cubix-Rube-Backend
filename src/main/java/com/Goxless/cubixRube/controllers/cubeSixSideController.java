package com.Goxless.cubixRube.controllers;


import com.Goxless.cubixRube.cubeStructure.DTO.CubeDTO;
import com.Goxless.cubixRube.cubeStructure.abstractClasses.Cube;
import com.Goxless.cubixRube.cubeStructure.specificCubes.SixSideCube;
import com.Goxless.cubixRube.services.CubeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Slf4j
@RestController
@RequestMapping("/sixside")
@RequiredArgsConstructor
public class cubeController {

    @Autowired
    private final CubeService service;

    @GetMapping("/test")
    public String getTest(){
        //log.info("added cube to solve");
        return "lerer";
    }

    @PostMapping
    public ResponseEntity postCubeToSolve(@RequestBody CubeDTO cube){
        //service.
        return ResponseEntity.ok().build();
    }


}

package com.Goxless.cubixRube.controllers;


import com.Goxless.cubixRube.cubeStructure.DTO.CubeDTO;
import com.Goxless.cubixRube.services.CubeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/sixside")
public class cubeSixSideController {

    // добавить валидацюи через @Validated
    @Autowired
    private CubeService service;

    @GetMapping("/test")
    public String getTest(){
        return "test";
    }

    @PostMapping
    public ResponseEntity postCubeToSolve(@RequestBody CubeDTO DTOcube){
        try{
           return service.postCubeToSolve(DTOcube);
        }
        catch(Exception e){
            log.info(e.getMessage());
            return ResponseEntity.status(501).build();
        }
    }


}

package com.Goxless.cubixRube.services;


import com.Goxless.cubixRube.cubeStructure.DTO.CubeDTO;
import com.Goxless.cubixRube.cubeStructure.specificCubes.SixSideCube;
import com.Goxless.cubixRube.repositories.DAOClasses.CubeDAO;
import com.Goxless.cubixRube.solvers.SixSideCubeSolver;
import com.Goxless.cubixRube.solvers.SolutionStrategyContext;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
//@ConfigurationProperties(prefix = "cube-app")
public class CubeService {

    private final CubeDAO cubeDAO;

    public ResponseEntity postCubeToSolve(CubeDTO DTOcube){
        //поменять response на мапу

        SixSideCube cube = (SixSideCube)DTOcube.convertToEntity(new SixSideCube());

        if(!cube.isConfiguredRight())
            return ResponseEntity.status(406).body("Not acceptable 3x3x3 cube configuration");
            //change 2 throwing exception later

        HashMap<Integer,String> solutionSequence =  new SolutionStrategyContext(new SixSideCubeSolver(this.cubeDAO)).solveCube(cube);

        return ResponseEntity.ok().build();
    }



}

package com.Goxless.cubixRube.solvers;

import com.Goxless.cubixRube.cubeStructure.interfaces.ICube;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

@RequiredArgsConstructor
public class SolutionStrategyContext {

    private final SolutionStrategy strategy;

    public HashMap<Integer,String> solveCube(ICube cube){
        return this.strategy.solveCube(cube);
    }
}

package com.Goxless.cubixRube.solvers;

import com.Goxless.cubixRube.cubeStructure.interfaces.ICube;

import java.util.HashMap;

public class SolutionStrategyContext {

    private SolutionStrategy strategy;
    public SolutionStrategyContext(SolutionStrategy strategy) {
        this.strategy = strategy;
    }

    public HashMap<Integer,String> solveCube(ICube cube){
        return this.strategy.solveCube(cube);
    }
}

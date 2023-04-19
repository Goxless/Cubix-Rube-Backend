package com.Goxless.solvers;

import com.Goxless.cubixRube.cubeStructure.interfaces.ICube;

import java.util.HashMap;

public interface SolutionStrategy {

    public HashMap<Integer,String> solveCube(ICube cube);
}

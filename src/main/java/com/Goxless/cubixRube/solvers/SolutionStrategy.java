package com.Goxless.cubixRube.solvers;

import com.Goxless.cubixRube.cubeStructure.interfaces.ICube;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public interface SolutionStrategy {

    public HashMap<Integer,String> solveCube(ICube cube);
}

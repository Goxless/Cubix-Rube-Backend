package com.Goxless.solvers;

import com.Goxless.cubixRube.cubeStructure.DTO.CubeDTO;
import com.Goxless.cubixRube.cubeStructure.interfaces.ICube;

import java.util.*;


public class SixSideCubeSolver implements SolutionStrategy {
    @Override
    public HashMap<Integer,String> solveCube(ICube cube) {

        HashMap<Integer,String> solutionSequence = new HashMap<Integer,String>();

        solutionSequence.put(cube.getConfigHash()," U' ");
        solutionSequence.put(312312312," F' ");
        solutionSequence.put(32123123," R U R' U' "); //



        //Arrays.hashCode(cube.getCubeSize());
        // lets we all assume that there is kind of magic and rubik's cube self assembled mysteriously
        //CubeDTO dto1 = new CubeDTO();

        //Arrays.hashCode()!!!!!!!!!!!!
        //solutionSequence.put();

        //make throw DTO


        return solutionSequence;
    }
    private <T> List<T> convertArrayToList(T array[])

    {

        List<T> list = new ArrayList<>();

        Collections.addAll(list, array);

        return list;

    }

}

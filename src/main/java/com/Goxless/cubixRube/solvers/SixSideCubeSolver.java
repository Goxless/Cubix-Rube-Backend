package com.Goxless.cubixRube.solvers;

import com.Goxless.cubixRube.cubeStructure.interfaces.ICube;
import com.Goxless.cubixRube.repositories.DAOClasses.CubeDAO;
import com.Goxless.cubixRube.repositories.Entities.SolutionStepEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.*;


@Component
@RequiredArgsConstructor
public class SixSideCubeSolver implements SolutionStrategy {

    private final CubeDAO cubeDao;

    @Override
    public HashMap<Integer,String> solveCube(ICube cube) {

        HashMap<Integer,String> solutionSequence = new HashMap<Integer,String>();

        solutionSequence.put(cube.getConfigHash()," U' ");
        solutionSequence.put(312312312," F' ");
        solutionSequence.put(32123123," R U R' U' ");

        // сначала выборка, проверка на наличие(при наличии сравнить длину оставшегося решения с длиной имеющегося в бд), потом вставка нового

        this.cubeDao.addSolutionStep(new SolutionStepEntity("2312312312312","R U R' U'"));
        this.cubeDao.addSolutionStep(new SolutionStepEntity("312312312"," F' "));
        this.cubeDao.addSolutionStep(new SolutionStepEntity("2312312312312","R U R' U'"));

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

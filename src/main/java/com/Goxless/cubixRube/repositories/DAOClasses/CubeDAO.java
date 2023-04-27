package com.Goxless.cubixRube.repositories.DAOClasses;

import com.Goxless.cubixRube.repositories.Entities.SolutionStepEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class CubeDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public void addSolutionStep(SolutionStepEntity solutionStepEntity){
        entityManager.persist(solutionStepEntity);
        entityManager.flush();
    }

    public SolutionStepEntity getSolutionStep(int id){
        return null;
    }


}

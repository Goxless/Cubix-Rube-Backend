package com.Goxless.cubixRube.cubeStructure.DTO;

import com.Goxless.cubixRube.cubeStructure.interfaces.ICube;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CubeDTO {
    private List<List<List<String>>> sides;
    //colors enum


    public ICube convertToEntity(ICube cube){
        cube.setSideConfigurationByDTO(this);
        return cube;
    }
}

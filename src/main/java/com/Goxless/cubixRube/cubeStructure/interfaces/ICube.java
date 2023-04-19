package com.Goxless.cubixRube.cubeStructure.interfaces;

import com.Goxless.cubixRube.cubeStructure.DTO.CubeDTO;

import java.util.HashMap;
import java.util.List;

public interface ICube {
    public String getStringStructure();
    public List<List<List<String>>> getNestedArraySidesConfig();
    public int[] getCubeSize();
    public void setSideConfigurationByDTO(CubeDTO cubeDTO);
    public boolean isConfiguredRight();
    public int getConfigHash();
    public HashMap<Integer, String> getSideColorConfiguration();

}

package com.Goxless.cubixRube.cubeStructure.interfaces;

import com.Goxless.cubixRube.cubeStructure.DTO.CubeDTO;

import java.util.List;

public interface ICube {
    public String getStringStructure();

    public boolean isConfiguredRight();

    public void setSideConfigurationByDTO(CubeDTO cubeDTO);

    public int[] getCubeSize();

}

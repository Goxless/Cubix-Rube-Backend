package com.Goxless.cubixRube.cubeStructure.basicCubeStructure;

import com.Goxless.cubixRube.cubeStructure.interfaces.ICube;

import java.util.ArrayList;
import java.util.List;

public abstract class Cube implements ICube {

    protected List<CubeSide> sides = new ArrayList<>();

    @Override
    public String getStringStructure() {
        return null;
    }


    public abstract boolean isConfiguredRight();
}

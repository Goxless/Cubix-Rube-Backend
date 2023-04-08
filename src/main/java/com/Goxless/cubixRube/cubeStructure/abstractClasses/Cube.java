package com.Goxless.cubixRube.cubeStructure.abstractClasses;

import com.Goxless.cubixRube.cubeStructure.interfaces.ICube;
import com.Goxless.cubixRube.cubeStructure.interfaces.ICubeSide;

import java.util.ArrayList;
import java.util.List;

public abstract class Cube implements ICube {

    private List<ICubeSide> sides = new ArrayList<>();

    @Override
    public String getStringStructure() {
        return null;
    }

}

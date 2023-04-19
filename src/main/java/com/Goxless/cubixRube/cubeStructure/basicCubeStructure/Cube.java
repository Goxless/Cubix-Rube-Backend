package com.Goxless.cubixRube.cubeStructure.basicCubeStructure;

import com.Goxless.cubixRube.cubeStructure.interfaces.ICube;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Cube implements ICube {

    protected List<CubeSide> sides = new ArrayList<>();
    protected List<List<List<String>>> arraySideConfig;

    @Override
    public String getStringStructure() {
        return null;
    }

    @Override
    public List<List<List<String>>> getNestedArraySidesConfig() {
        return this.arraySideConfig;
    }

    public abstract boolean isConfiguredRight();

    public String[] getArrayConfig(){
        return Arrays.deepToString(this.getNestedArraySidesConfig().toArray())
                .replace("[","").replace("]","")
                .split(", ");
    }


    public int getConfigHash(){
        return Arrays.hashCode(this.getArrayConfig());
    }
}

package com.Goxless.cubixRube.cubeStructure.abstractClasses;

import com.Goxless.cubixRube.cubeStructure.enums.COLOR;
import com.Goxless.cubixRube.cubeStructure.interfaces.ISidePoint;

public abstract class SidePoint implements ISidePoint {
    private COLOR color;
    private int[] location;

    public SidePoint(COLOR color) {
        this.color = color;
    }


}

package com.Goxless.cubixRube.cubeStructure.abstractClasses;

import com.Goxless.cubixRube.cubeStructure.enums.COLOR;
import com.Goxless.cubixRube.cubeStructure.interfaces.ISidePoint;

public class SidePoint implements ISidePoint {
    private COLOR color;
    private int[] location; // maybe delete later, not sure 4 profit

    public SidePoint(COLOR color) {
        this.color = color;
    }


}

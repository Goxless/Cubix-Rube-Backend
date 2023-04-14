package com.Goxless.cubixRube.cubeStructure.basicCubeStructure;

import com.Goxless.cubixRube.cubeStructure.interfaces.ISidePoint;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SidePoint implements ISidePoint {

    @NonNull private String color;
    private int[] location; // maybe delete later, not sure 4 profit

}

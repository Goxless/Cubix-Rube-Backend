package com.Goxless.cubixRube.cubeStructure.basicCubeStructure;

import com.Goxless.cubixRube.cubeStructure.interfaces.ICubeSide;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class CubeSide implements ICubeSide {

    protected List<SideLine> lines = new ArrayList<>();

}

package com.Goxless.cubixRube.cubeStructure.abstractClasses;

import com.Goxless.cubixRube.cubeStructure.interfaces.ICubeSide;
import com.Goxless.cubixRube.cubeStructure.interfaces.ISideLine;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class CubeSide implements ICubeSide {

    protected List<SideLine> lines = new ArrayList<>();

}

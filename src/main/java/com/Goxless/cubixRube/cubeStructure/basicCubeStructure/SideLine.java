package com.Goxless.cubixRube.cubeStructure.abstractClasses;

import com.Goxless.cubixRube.cubeStructure.interfaces.ICubeSide;
import com.Goxless.cubixRube.cubeStructure.interfaces.ISideLine;
import com.Goxless.cubixRube.cubeStructure.interfaces.ISidePoint;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class SideLine implements ISideLine {

    private List<SidePoint> points = new ArrayList<>();

}

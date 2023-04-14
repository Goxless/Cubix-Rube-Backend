package com.Goxless.cubixRube.cubeStructure.basicCubeStructure;

import com.Goxless.cubixRube.cubeStructure.interfaces.ISideLine;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class SideLine implements ISideLine {

    private List<SidePoint> points = new ArrayList<>();

}

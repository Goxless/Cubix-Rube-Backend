package com.Goxless.cubixRube.cubeStructure.specificCubes;

import com.Goxless.cubixRube.cubeStructure.DTO.CubeDTO;
import com.Goxless.cubixRube.cubeStructure.basicCubeStructure.Cube;
import com.Goxless.cubixRube.cubeStructure.basicCubeStructure.CubeSide;
import com.Goxless.cubixRube.cubeStructure.basicCubeStructure.SideLine;
import com.Goxless.cubixRube.cubeStructure.basicCubeStructure.SidePoint;
import com.Goxless.cubixRube.cubeStructure.interfaces.ICube;
import com.Goxless.cubixRube.cubeStructure.interfaces.ICubeSide;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Slf4j
@Data
@Component
public class SixSideCube extends Cube {

    public int lol(){return 0;}

    @Override
    public int[] getCubeSize() {
        return new int[]{3,3,3,6}; // { X, Y, Z, sides }
    }

    @Override
    public boolean isConfiguredRight() {

        Predicate<CubeSide> isVerticalThreePoint = x -> x.getLines().size() == this.getCubeSize()[0];
        Predicate<CubeSide> isGorizontalThreePoint = side -> side.getLines().stream()
                                                            .allMatch(sideLine-> sideLine.getPoints().size() == this.getCubeSize()[1]);

        Predicate<CubeSide> sizeOfXYConditions = isVerticalThreePoint.and(isGorizontalThreePoint);

        boolean result = (sides.size() == this.getCubeSize()[3]) &&
                         sides.stream().allMatch(sizeOfXYConditions);
        return result;
    }

    @Override
    public void setSideConfigurationByDTO(CubeDTO cubeDTO) {

        this.sides = cubeDTO.getSides().stream()
                .map(DTOside ->{return new CubeSide(DTOside.stream()
                        .map(DTOLine -> {return new SideLine(DTOLine.stream()
                                .map(DTOPoint -> {return new SidePoint(DTOPoint);})
                                .collect(Collectors.toList()));})
                        .collect(Collectors.toList()));})
                .toList();
    }

}

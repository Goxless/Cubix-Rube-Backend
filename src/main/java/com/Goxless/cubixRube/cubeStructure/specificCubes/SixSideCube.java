package com.Goxless.cubixRube.cubeStructure.specificCubes;

import com.Goxless.cubixRube.cubeStructure.DTO.CubeDTO;
import com.Goxless.cubixRube.cubeStructure.basicCubeStructure.Cube;
import com.Goxless.cubixRube.cubeStructure.basicCubeStructure.CubeSide;
import com.Goxless.cubixRube.cubeStructure.basicCubeStructure.SideLine;
import com.Goxless.cubixRube.cubeStructure.basicCubeStructure.SidePoint;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Slf4j
@Data
@Component
public class SixSideCube extends Cube {

    @Override
    public int[] getCubeSize() {
        return new int[]{3,3,3,6}; // { X, Y, Z, sides count }
    }

    @Override
    public HashMap<Integer, String> getSideColorConfiguration() {
        return new
                HashMap<Integer, String>(){{
                    put(1,"White");
                    put(2,"Orange");
                    put(3,"Blue");
                    put(4,"Green");
                    put(5,"Red");
                    put(6,"Yellow");
                }};
    }

    @Override
    public boolean isConfiguredRight() {

        Predicate<CubeSide> isVerticalThreePoint = x -> x.getLines().size() == this.getCubeSize()[0];
        Predicate<CubeSide> isHorizontalThreePoint = side -> side.getLines().stream()
                                                            .allMatch(sideLine-> sideLine.getPoints().size() == this.getCubeSize()[1]);

        Predicate<CubeSide> sizeOfXYConditions = isVerticalThreePoint.and(isHorizontalThreePoint);

        HashMap<String, Integer> colorsCount = distinctColors(Arrays.deepToString(arraySideConfig.toArray())
                                                                .replace("[","").replace("]","")
                                                                .split(", "));


        boolean result = (sides.size() == this.getCubeSize()[3]) && isSixColors(colorsCount) &&
                         sides.stream().allMatch(sizeOfXYConditions) && isSideColorConfigurated();
        return result;
    }

    private HashMap<String, Integer> distinctColors(String arr[]){

        HashSet<String> distinctKeySet = new HashSet<>();
        HashMap<String, Integer> keyCountMap = new HashMap<String, Integer>();

        for(String color: arr){
            if(distinctKeySet.add(color))
                keyCountMap.put(color, 1);
            else
                keyCountMap.put(color, (Integer)(keyCountMap.get(color) + 1));
        }
        return keyCountMap;
    }

    private boolean isSixColors(Map<String, Integer> colorsCount){

        if(colorsCount.size() != 6)
            return false;

        for (Integer c : colorsCount.values()) {
            if(c != getCubeSize()[0] * getCubeSize()[1])
                return false;
        }
        return true;
    }

    private boolean isSideColorConfigurated(){

        HashMap<Integer, String> sideColorConfiguration = this.getSideColorConfiguration();

        int iter = 1;
        for(List<List<String>> side: arraySideConfig){
            if(!side.get(1).get(1).equals(sideColorConfiguration.get(iter)))
                return false;
            iter++;
        }
        return true;
    }

    @Override
    public void setSideConfigurationByDTO(CubeDTO cubeDTO) {

        this.arraySideConfig = cubeDTO.getSides();

        this.sides = cubeDTO.getSides().stream()
                .map(DTOside ->{return new CubeSide(DTOside.stream()
                        .map(DTOLine -> {return new SideLine(DTOLine.stream()
                                .map(DTOPoint -> {return new SidePoint(DTOPoint);})
                                .collect(Collectors.toList()));})
                        .collect(Collectors.toList()));})
                .toList();
    }

}

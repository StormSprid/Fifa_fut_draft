package main.Entities;

import lombok.Getter;

@Getter
public enum Position {
    GK(1),
    LB(2), CB(3), RB(5),
    CDM(6), CM(7), CAM(8),
    LW(9),        RW(10),
    ST(11);


    private final int value;

    Position(int value){
        this.value = value;
    }

    public static Position getPositionByValue(int value){
        for (Position pos :Position.values()){
            if (pos.getValue() == value){
                return pos;
            }
        }
        throw new IllegalArgumentException("No position with value " + value);
    }

}

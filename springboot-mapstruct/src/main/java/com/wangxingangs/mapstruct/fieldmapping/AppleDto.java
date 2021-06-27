package com.wangxingangs.mapstruct.fieldmapping;

/**
 * @author wangxingangs
 */
public class AppleDto {

    private String color;

    public AppleDto(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "AppleDto{" +
                "color='" + color + '\'' +
                '}';
    }
}

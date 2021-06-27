package com.wangxingangs.mapstruct.fieldmapping;

/**
 * @author wangxingangs
 */
public class PersonDto {

    private String name;
    private AppleDto appleDto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppleDto getAppleDto() {
        return appleDto;
    }

    public void setAppleDto(AppleDto appleDto) {
        this.appleDto = appleDto;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "name='" + name + '\'' +
                ", appleDto=" + appleDto +
                '}';
    }
}

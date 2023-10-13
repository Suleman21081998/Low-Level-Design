package com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.builderpattern;

// builder
public interface UserDtoBuilder {

    UserDtoBuilder withFirstName(String firstName);
    UserDtoBuilder withLastName(String lastName);

    UserDtoBuilder withAddress(String address);

    UserDto build();
    UserDto getUserDto();
}

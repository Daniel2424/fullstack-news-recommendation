package com.ruzhkov.backend.mappers;

import com.ruzhkov.backend.dtos.SignUpDto;
import com.ruzhkov.backend.dtos.UserDto;
import com.ruzhkov.backend.entites.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}

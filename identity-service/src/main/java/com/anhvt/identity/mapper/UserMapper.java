package com.anhvt.identity.mapper;

import com.anhvt.identity.dto.request.UserCreationRequest;
import com.anhvt.identity.dto.request.UserUpdateRequest;
import com.anhvt.identity.dto.response.UserResponse;
import com.anhvt.identity.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}

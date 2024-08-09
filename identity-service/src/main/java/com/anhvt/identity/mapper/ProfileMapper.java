package com.anhvt.identity.mapper;

import com.anhvt.identity.dto.request.ProfileCreationRequest;
import com.anhvt.identity.dto.request.UserCreationRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
    ProfileCreationRequest toProfileCreationRequest(UserCreationRequest request);

}

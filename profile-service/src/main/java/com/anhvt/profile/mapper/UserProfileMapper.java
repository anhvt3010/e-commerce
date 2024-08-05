package com.anhvt.profile.mapper;

import com.anhvt.profile.dto.request.ProfileCreationRequest;
import com.anhvt.profile.dto.response.UserProfileResponse;
import com.anhvt.profile.entity.UserProfile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(ProfileCreationRequest request);
    UserProfileResponse toUserProfileResponse(UserProfile entity);
}

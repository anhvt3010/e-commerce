package com.anhvt.profile.controller;

import com.anhvt.profile.dto.ApiResponse;
import com.anhvt.profile.dto.request.ProfileCreationRequest;
import com.anhvt.profile.dto.response.UserProfileResponse;
import com.anhvt.profile.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("/users")
public class UserProfileController {
    UserProfileService userProfileService;

    @GetMapping()
    ApiResponse<List<UserProfileResponse>> getAllProfiles(){
        return ApiResponse.<List<UserProfileResponse>>builder()
                .result(userProfileService.getAllProfiles())
                .build();
    }

    @GetMapping("/by-id/{profileId}")
    UserProfileResponse getProfile(@PathVariable String profileId){
        return userProfileService.getProfile(profileId);
    }

    @GetMapping("/by-userid/{userId}")
    UserProfileResponse getProfileByUserId(@PathVariable String userId){
        return userProfileService.getProfileByUserId(userId);
    }
    @DeleteMapping("/{profileId}")
    void deleteProfile(@PathVariable String profileId){
        userProfileService.deleteById(profileId);
    }


}

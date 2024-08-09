package com.anhvt.profile.controller;

import com.anhvt.profile.dto.request.ProfileCreationRequest;
import com.anhvt.profile.dto.response.UserProfileResponse;
import com.anhvt.profile.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("/internal/users")
public class InternalUserProfileController {
    UserProfileService userProfileService;

    @PostMapping("")
    UserProfileResponse createProfile(@RequestBody ProfileCreationRequest request){
        return userProfileService.createProfile(request);
    }
}

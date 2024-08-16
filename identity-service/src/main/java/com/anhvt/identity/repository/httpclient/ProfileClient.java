package com.anhvt.identity.repository.httpclient;

import com.anhvt.identity.configuration.AuthRequestInterceptor;
import com.anhvt.identity.dto.request.ProfileCreationRequest;
import com.anhvt.identity.dto.response.UserProfileResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "profile-service", url = "${app.service.profile}",
//        khai bao config interceptor (khong tao bean)
        configuration = {AuthRequestInterceptor.class})
public interface ProfileClient {
    @PostMapping(value = "/internal/users", produces = MediaType.APPLICATION_JSON_VALUE)
    UserProfileResponse createProfile(@RequestBody ProfileCreationRequest profileCreationRequest);

}

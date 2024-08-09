package com.anhvt.identity.mapper;

import com.anhvt.identity.dto.request.PermissionRequest;
import com.anhvt.identity.dto.response.PermissionResponse;
import org.mapstruct.Mapper;

import com.anhvt.identity.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}

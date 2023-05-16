package com.example.redis.config.jwt;

import lombok.*;

@Getter @AllArgsConstructor
public enum JwtHeaderUtilEnums {

    GRANT_TYPE("JWT 타입 / Bearer ", "Bearer ");

    private String description;
    private String value;
}

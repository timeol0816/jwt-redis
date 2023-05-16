package com.example.redis.domain;

import org.springframework.data.repository.*;

public interface LogoutAccessTokenRedisRepository extends CrudRepository<LogoutAccessToken, String> {
}
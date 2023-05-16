package com.example.redis.domain;

import org.springframework.data.repository.*;

public interface RefreshTokenRedisRepository extends CrudRepository<RefreshToken, String> {
}

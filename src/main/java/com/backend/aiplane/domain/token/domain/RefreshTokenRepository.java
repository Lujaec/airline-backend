package com.backend.aiplane.domain.token.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    @Query("SELECT u FROM RefreshToken u WHERE u.userId = :userId")
    RefreshToken findByUserId(UUID userId);

    @Transactional
    @Modifying
    @Query("DELETE FROM RefreshToken u WHERE u.userId = :userId")
    void deleteByUserId(UUID userId);

}

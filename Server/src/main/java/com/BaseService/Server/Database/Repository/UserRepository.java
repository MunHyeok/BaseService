package com.BaseService.Server.Database.Repository;
import com.BaseService.Server.Database.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query("SELECT u FROM UserEntity u WHERE u.userID = ?1")
    UserEntity findByUsername(String userID);

    @Query("SELECT u FROM UserEntity u WHERE u.email = ?1")
    UserEntity findByEmail(String email);

    @Query("SELECT u FROM UserEntity u WHERE u.enabled = ?1")
    List<UserEntity> findAllByEnabled(boolean enabled);

    @Query("SELECT u FROM UserEntity u WHERE u.username = ?1 AND u.email = ?2")
    UserEntity findByUsernameAndEmail(String username, String email);
}
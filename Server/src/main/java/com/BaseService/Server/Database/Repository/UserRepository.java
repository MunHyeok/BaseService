package com.BaseService.Server.Database.Repository;
import com.BaseService.Server.Database.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query("SELECT u FROM UserEntity u WHERE u.userID = :userID")
    List<UserEntity> findByUsername(String userID);

    @Query("SELECT u FROM UserEntity u WHERE u.email = :email")
    List<UserEntity> findByEmail(String email);

    @Query("SELECT u FROM UserEntity u WHERE u.enabled = :enabled")
    List<UserEntity> findAllByEnabled(boolean enabled);

    @Query("SELECT u FROM UserEntity u WHERE u.username = :username AND u.email = :email")
    List<UserEntity> findByUsernameAndEmail(String username, String email);
}
package com.BaseService.Server.Controllers;

import com.BaseService.Server.Database.Entities.UserEntity;
import com.BaseService.Server.Database.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Test")
public class UserServiceController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

    @PostMapping("/")
    public UserEntity createUser(@RequestBody UserEntity user) {
        user.setRegistrationDate(LocalDateTime.now());
        List<UserEntity> entity = userRepository.findAllByEnabled(true);
        return userRepository.save(user);
    }

    // 게시글 수정, 삭제 등의 기능 추가 가능
    @PutMapping("/{id}")
    public ResponseEntity<UserEntity> updatePost(@PathVariable Long id, @RequestBody UserEntity updatedUserInfo) {
        Optional<UserEntity> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            UserEntity user = optionalUser.get();
            user.CopyFrom(updatedUserInfo);
            userRepository.save(user);
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

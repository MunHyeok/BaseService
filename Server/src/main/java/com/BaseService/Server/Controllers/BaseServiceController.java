package com.BaseService.Server.Controllers;

import com.BaseService.Server.Database.Entities.UserEntity;
import com.BaseService.Server.Database.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BaseServiceController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public List<UserEntity> getAllPosts() {
        return userRepository.findAll();
    }

    @PostMapping("/")
    public UserEntity createPost(@RequestBody UserEntity post) {
        return userRepository.save(post);
    }

    // 게시글 수정, 삭제 등의 기능 추가 가능
    @PutMapping("/{id}")
    public ResponseEntity<UserEntity> updatePost(@PathVariable Long id, @RequestBody UserEntity updatedPost) {
        Optional<UserEntity> optionalPost = userRepository.findById(id);
//        if (optionalPost.isPresent()) {
////            Post post = optionalPost.get();
////            post.setTitle(updatedPost.getTitle());
////            post.setContent(updatedPost.getContent());
////            postRepository.save(post);
////            return ResponseEntity.ok(post);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
//        if (postRepository.existsById(id)) {
//            postRepository.deleteById(id);
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
        return null;
    }
}

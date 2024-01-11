package com.BaseService.Server.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class BaseServiceController {
//    @Autowired
//    private PostRepository postRepository;
//
//    @GetMapping("/")
//    public List<Post> getAllPosts() {
//        return postRepository.findAll();
//    }
//
//    @PostMapping("/")
//    public Post createPost(@RequestBody Post post) {
//        String test = post.getTitle();
//        return postRepository.save(post);
//    }
//
//    // 게시글 수정, 삭제 등의 기능 추가 가능
//    @PutMapping("/{id}")
//    public ResponseEntity<Post> updatePost(@PathVariable Long id, @RequestBody Post updatedPost) {
//        Optional<Post> optionalPost = postRepository.findById(id);
//        if (optionalPost.isPresent()) {
//            Post post = optionalPost.get();
//            post.setTitle(updatedPost.getTitle());
//            post.setContent(updatedPost.getContent());
//            postRepository.save(post);
//            return ResponseEntity.ok(post);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
//        if (postRepository.existsById(id)) {
//            postRepository.deleteById(id);
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
}

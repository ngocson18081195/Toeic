package toeic.App.Rest;

import toeic.App.Entity.QuestionPartOneEntity;
import toeic.App.Service.QuestionPartOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by chien on 17/11/2017.
 */
@RestController
@RequestMapping("/api")
public class QuestionPartOneRest {

    private QuestionPartOneService questionPartOneService;

    @Autowired
    public QuestionPartOneRest(QuestionPartOneService questionPartOneService) {
        this.questionPartOneService = questionPartOneService;
    }

    @GetMapping("/questions")
    public ResponseEntity<QuestionPartOneEntity> get() {
        return ResponseEntity.ok(this.questionPartOneService.findOne(1L));
    }

    @PostMapping("/questions")
    public ResponseEntity<QuestionPartOneEntity> create(@RequestParam(name = "image") MultipartFile image,
                                                        @RequestParam(name = "mp3") MultipartFile mp3) {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/questions/image")
    public byte[] image() throws IOException {
        return Files.readAllBytes(new File("/home/chien/Pictures/image_5.png").toPath());
    }

    @GetMapping("/questions/mp3")
    public byte[] mp3() throws IOException {
        return Files.readAllBytes(new File("/home/chien/Pictures/mp3_5.mp3").toPath());
    }

}

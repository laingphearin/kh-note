package com.khnote.note;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/notes")
public record NoteController(NoteService noteService) {

    @PostMapping
    public void createNote(@RequestBody NoteCreationRequest noteCreationRequest) {
        log.info("new note registration {}", noteCreationRequest);
        noteService.createNote(noteCreationRequest);
    }
}

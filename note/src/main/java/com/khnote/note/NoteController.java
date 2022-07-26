package com.khnote.note;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/notes")
public record NoteController(NoteService noteService) {

    @Operation(summary = "Create Note endpoint")
    @PostMapping(consumes = {"application/json"})
    @ResponseStatus
    public ResponseEntity<Note> createNote(@RequestBody NoteCreationRequest noteCreationRequest) {
        log.info("new note registration {}", noteCreationRequest);
        Note note = noteService.createNote(noteCreationRequest);
        return ResponseEntity.ok(note);
    }
}

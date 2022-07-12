package com.khnote.note;

import org.springframework.stereotype.Service;

@Service
public record NoteService(NoteRepository noteRepository) {
    public void createNote(NoteCreationRequest request) {
        Note note = Note.builder()
                .title(request.title())
                .item(request.item())
                .build();
        noteRepository.save(note);
    }
}

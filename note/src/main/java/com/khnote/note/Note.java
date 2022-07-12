package com.khnote.note;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Note {
    @Id
    @SequenceGenerator(
            name = "note_id_sequence",
            sequenceName = "note_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "note_id_sequence"
    )
    private Integer id;
    private String title;
    private String item;
}

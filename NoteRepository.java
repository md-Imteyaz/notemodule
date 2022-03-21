package com.Notes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.Notes.Entity.Note;

@Repository
@Component
public interface NoteRepository extends JpaRepository<Note, Integer> {

}

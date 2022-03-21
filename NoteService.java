package com.Notes.Service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Notes.Entity.Note;
@Service
@Component
public interface NoteService {
	public List<Note> getAllNote();

	public Note getNoteById(int id);

	public Note addorUpdateNote(Note note);

	public Note deleteid(int id) throws Exception;

}

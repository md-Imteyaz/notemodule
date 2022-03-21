package com.Notes.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Notes.Entity.Note;
import com.Notes.Repository.NoteRepository;
import com.Notes.Service.NoteService;
@Component
public class NoteServiceImpl implements NoteService {

	@Autowired
	private NoteRepository noteRepository;

	@Override
	public List<Note> getAllNote() {
		return (List<Note>) noteRepository.findAll();

	}

	@Override
	public Note getNoteById(int id) {
		return noteRepository.findById(id).orElse(null);

	}

	@Override
	public Note addorUpdateNote(Note note) {
		return noteRepository.save(note);
	}

	@Override
	public Note deleteid(int id) throws Exception {
		Note deletedUser = null;
		try {
			deletedUser = noteRepository.findById(id).orElse(null);
			if (deletedUser == null) {
				throw new Exception("user not availaible");
			} else {
				noteRepository.deleteById(id);
			}

		} catch (Exception ex) {
			throw ex;
		}
		return deletedUser;
	}

}

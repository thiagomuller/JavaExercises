package com.thiagomuller.SpringHibernateMySql.Repository;

import com.thiagomuller.SpringHibernateMySql.Model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}

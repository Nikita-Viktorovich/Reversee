package com.politech.game.repository;

import com.politech.game.model.Session;
import org.springframework.data.repository.CrudRepository;

public interface SessionRepository extends CrudRepository<Session, Long> {
    Session findSessionsById (long id);
}

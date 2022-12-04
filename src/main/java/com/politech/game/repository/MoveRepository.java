package com.politech.game.repository;

import com.politech.game.model.Move;
import org.springframework.data.repository.CrudRepository;

public interface MoveRepository extends CrudRepository<Move, Long> {

    Move findById(long id);
}

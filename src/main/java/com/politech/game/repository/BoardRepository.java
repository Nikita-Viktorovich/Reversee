package com.politech.game.repository;

import com.politech.game.model.Board;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<Board, Long> {
    Board findById(long id);

}

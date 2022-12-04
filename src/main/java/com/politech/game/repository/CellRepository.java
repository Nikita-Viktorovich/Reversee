package com.politech.game.repository;

import com.politech.game.model.Cell;
import org.springframework.data.repository.CrudRepository;

public interface CellRepository extends CrudRepository<Cell, Long> {
    Cell findById(long id);
}

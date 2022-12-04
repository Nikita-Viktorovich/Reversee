package com.politech.game.repository;

import com.politech.game.model.Rule;
import org.springframework.data.repository.CrudRepository;

public interface RuleRepository extends CrudRepository<Rule, Long> {
    Rule findById(long id);
}

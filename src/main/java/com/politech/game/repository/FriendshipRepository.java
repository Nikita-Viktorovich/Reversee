package com.politech.game.repository;

import com.politech.game.model.Friendship;
import org.springframework.data.repository.CrudRepository;

public interface FriendshipRepository extends CrudRepository<Friendship, Long> {
    Friendship findById(long id);
}

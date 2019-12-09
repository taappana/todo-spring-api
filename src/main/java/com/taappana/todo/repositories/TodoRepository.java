package com.taappana.todo.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.taappana.todo.models.Todo; 
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends ReactiveMongoRepository<Todo, String> {

}

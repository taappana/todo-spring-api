package com.taappana.todo.controllers;

import javax.validation.Valid;
import com.taappana.todo.models.Todo;
import com.taappana.todo.repositories.TodoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TodoController {
	@Autowired
    TodoRepository todoRepository;
	
	@GetMapping("/todos")
    public Flux<Todo> getAllTodos() {
        return todoRepository.findAll(Sort.by(Sort.Direction.DESC, "createdAt"));
    }
	
	@PostMapping("/todos")
    public Mono<Todo> createTodo(@Valid @RequestBody Todo todo) {
       return todoRepository.save(todo);
    }
}

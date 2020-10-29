package com.kristiania.TodoList.repo;

import com.kristiania.TodoList.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {

}

package com.dyer.frameworks.service;

import com.dyer.frameworks.model.Task;

public interface TaskService {

    Iterable<Task> findAll();

    Task findOne(Long id);

    void toggleComplete(Long id);

    void save(Task task);

}

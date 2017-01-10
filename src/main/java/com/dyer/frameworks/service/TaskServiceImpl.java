package com.dyer.frameworks.service;

import com.dyer.frameworks.model.Task;
import com.dyer.frameworks.repository.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskDao taskDao;

    @Override
    public Iterable<Task> findAll() {
        return taskDao.findAll();
    }

    @Override
    public Task findOne(Long id) {
        return taskDao.findOne(id);
    }

    @Override
    public void toggleComplete(Long id) {
        Task task = taskDao.findOne(id);
        task.setComplete(!task.isComplete());
        taskDao.save(task);
    }

    @Override
    public void save(Task task) {
        taskDao.saveForCurrentUser(task);
    }
}

package com.dyer.frameworks.repository;

import com.dyer.frameworks.model.Task;
import com.dyer.frameworks.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskDao extends CrudRepository<Task, Long> {

    @Query("select t from Task t where t.user.id=:#{principal.id}")
    List<Task> findAll();

}

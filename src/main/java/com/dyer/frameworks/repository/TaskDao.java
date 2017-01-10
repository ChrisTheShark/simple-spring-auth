package com.dyer.frameworks.repository;

import com.dyer.frameworks.model.Task;
import com.dyer.frameworks.model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TaskDao extends CrudRepository<Task, Long> {

    @Query("select t from Task t where t.user.id=:#{principal.id}")
    List<Task> findAll();

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "insert into task (user_id,description,complete) values (:#{principal.id},:#{#task.description},:#{#task.complete})")
    void saveForCurrentUser(@Param("task") Task task);

}

package com.dyer.frameworks.repository;

import com.dyer.frameworks.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * {@link CrudRepository} extension class for accessing {@link User}
 * details from an underlying data store.
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {

    /**
     * Find a {@link User} by a provided {@link String} username.
     * @param username the provided {@link String} username
     * @return a located {@link User} object
     */
    User findByUsername(String username);

}

package com.developers.perspective.repositories;

import com.developers.perspective.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Dheeraj Mmummareddy on 11/11/15.
 */
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    List<User> findByLastName(@Param("lastName") String lastName);

}

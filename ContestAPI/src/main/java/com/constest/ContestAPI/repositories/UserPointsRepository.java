package com.constest.ContestAPI.repositories;

import com.constest.ContestAPI.entities.UserPointsEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserPointsRepository extends CrudRepository<UserPointsEntity,String> {


}

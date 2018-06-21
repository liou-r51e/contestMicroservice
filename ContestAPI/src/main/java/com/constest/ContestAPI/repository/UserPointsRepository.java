package com.constest.ContestAPI.repository;

import com.constest.ContestAPI.entity.UserPointsEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserPointsRepository extends CrudRepository<UserPointsEntity,String> {


}

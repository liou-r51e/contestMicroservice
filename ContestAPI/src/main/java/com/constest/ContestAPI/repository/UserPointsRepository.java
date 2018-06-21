package com.constest.ContestAPI.repository;

import com.constest.ContestAPI.entity.UserPointsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPointsRepository extends CrudRepository<UserPointsEntity,String> {


}

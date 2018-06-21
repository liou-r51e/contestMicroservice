package com.constest.ContestAPI.Repository;

import com.constest.ContestAPI.Entity.ContestEntity;
import com.constest.ContestAPI.Entity.ContestUserEntity;
import org.springframework.data.repository.CrudRepository;

public interface ContestRepositoryInterface extends CrudRepository<ContestUserEntity,String> {



}

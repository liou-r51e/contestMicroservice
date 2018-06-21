package com.constest.ContestAPI.repository;

import com.constest.ContestAPI.entity.ContestUserEntity;
import org.springframework.data.repository.CrudRepository;

public interface ContestRepositoryInterface extends CrudRepository<ContestUserEntity,String> {



}

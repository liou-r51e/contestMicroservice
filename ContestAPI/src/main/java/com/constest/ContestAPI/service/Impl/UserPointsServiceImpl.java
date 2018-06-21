package com.constest.ContestAPI.service.Impl;

import com.constest.ContestAPI.repository.UserPointsRepository;
import com.constest.ContestAPI.service.UserPointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserPointsServiceImpl implements UserPointsService {

@Autowired
    UserPointsRepository userPointsRepository;

}

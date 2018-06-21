package com.constest.ContestAPI.service;


import com.constest.ContestAPI.entity.ContestUserEntity;
import com.constest.ContestAPI.repository.ContestRepositoryInterface;
import com.constest.ContestAPI.dto.ContestUserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContestServiceImplementation implements ContestServiceInterface{

    @Autowired
    ContestRepositoryInterface contestRepositoryInterface;

    @Override
    public boolean save(ContestUserDTO contestUserDTO) {
        ContestUserEntity contestUserEntity= new ContestUserEntity();
        BeanUtils.copyProperties(contestUserDTO,contestUserEntity);
        ContestUserEntity contestUserEntity1 = contestRepositoryInterface.save(contestUserEntity);
        return true;
    }
}

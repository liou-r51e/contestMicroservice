package com.constest.ContestAPI.Service;


import com.constest.ContestAPI.Entity.ContestUserEntity;
import com.constest.ContestAPI.Repository.ContestRepositoryInterface;
import com.constest.ContestAPI.dto.ContestDTO;
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

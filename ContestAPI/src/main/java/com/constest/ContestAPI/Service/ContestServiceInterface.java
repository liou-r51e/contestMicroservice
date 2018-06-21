package com.constest.ContestAPI.Service;

import com.constest.ContestAPI.dto.ContestDTO;
import com.constest.ContestAPI.dto.ContestUserDTO;

public interface ContestServiceInterface {

    boolean save(ContestUserDTO contestUserDTO);
}

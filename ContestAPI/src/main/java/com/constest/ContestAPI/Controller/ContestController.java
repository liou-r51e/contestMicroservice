package com.constest.ContestAPI.Controller;


import com.constest.ContestAPI.Service.ContestServiceInterface;
import com.constest.ContestAPI.dto.ContestUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContestController {

    @Autowired
    ContestServiceInterface contestServiceInterface;

    @RequestMapping(method = RequestMethod.POST,value = "/contest/subscribe")
    public boolean subscribe(@RequestBody ContestUserDTO contestUserDTO)
    {
        try {
            contestServiceInterface.save(contestUserDTO);
            return true;
        }
        catch (Exception exception)
        {
            System.out.println(exception.toString());
            return false;
        }

    }
}

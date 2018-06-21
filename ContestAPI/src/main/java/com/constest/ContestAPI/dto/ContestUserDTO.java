package com.constest.ContestAPI.dto;

import com.constest.ContestAPI.entity.ContestDTO;

public class ContestUserDTO {
    private String userId;
    private ContestDTO contestDTO;
    private String UserContestId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ContestDTO getContestDTO() {
        return contestDTO;
    }

    public void setContestDTO(ContestDTO contestDTO) {
        this.contestDTO = contestDTO;
    }

    public String getUserContestId() {
        return UserContestId;
    }

    public void setUserContestId(String userContestId) {
        UserContestId = userContestId;
    }

    @Override
    public String toString() {
        return "ContestUserDTO{" +
                "userId='" + userId + '\'' +
                ", contestDTO=" + contestDTO +
                ", UserContestId='" + UserContestId + '\'' +
                '}';
    }
}

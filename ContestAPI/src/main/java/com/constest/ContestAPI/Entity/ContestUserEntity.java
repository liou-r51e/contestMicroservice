package com.constest.ContestAPI.Entity;


import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.*;


@Entity
@Table(name = "ContestUser",schema = "public")
public class ContestUserEntity {

    private static final String ID_COLUMN = "UserContestId";

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = ContestUserEntity.ID_COLUMN)
    private String UserContestId;
    private String userId;

    @OneToOne
    private ContestEntity contestEntity;

    @Override
    public String toString() {
        return "ContestUserEntity{" +
                "UserContestId='" + UserContestId + '\'' +
                ", userId='" + userId + '\'' +
                ", contestEntity=" + contestEntity +
                '}';
    }

    public String getUserContestId() {
        return UserContestId;
    }

    public void setUserContestId(String userContestId) {
        UserContestId = userContestId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ContestEntity getContestEntity() {
        return contestEntity;
    }

    public void setContestEntity(ContestEntity contestEntity) {
        this.contestEntity = contestEntity;
    }
}

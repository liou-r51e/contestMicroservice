package com.constest.ContestAPI.entity;


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
    private String userContestId;
    private String userId;

    @OneToOne
    @JoinColumn(name = "contest_id",nullable = false)
    private ContestEntity contestEntity;

    @Override
    public String toString() {
        return "ContestUserEntity{" +
                "UserContestId='" + userContestId + '\'' +
                ", userId='" + userId + '\'' +
                ", contestEntity=" + contestEntity +
                '}';
    }

    public String getUserContestId() {
        return userContestId;
    }

    public void setUserContestId(String userContestId) {
        userContestId = userContestId;
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

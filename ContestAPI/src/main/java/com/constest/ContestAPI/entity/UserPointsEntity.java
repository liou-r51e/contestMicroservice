package com.constest.ContestAPI.entity;

import com.constest.ContestAPI.dto.ContestDTO;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = UserPointsEntity.TABLE_NAME)
public class UserPointsEntity {

    public static final String TABLE_NAME = "userPoints";
    public static final String ID_COLUMN = "userPointsId";


    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name=UserPointsEntity.ID_COLUMN)
    private String userPointstId;
    private String userId;

    @OneToOne
    @JoinColumn(name = "contest_id")
    private ContestEntity contestEntity;






    private int finalPoints;
    private int easyCorrectlyAnswered;
    private int mediumCorrectlyAnswered ;
    private Integer hardCorrectlyAnswered;

    public ContestEntity getContestEntity() {
        return contestEntity;
    }

    public void setContestEntity(ContestEntity contestEntity) {
        this.contestEntity = contestEntity;
    }

    @Override
    public String toString() {
        return "UserPointsEntity{" +
                "userPointstId='" + userPointstId + '\'' +
                ", userId='" + userId + '\'' +
                ", contestEntity=" + contestEntity +
                ", finalPoints=" + finalPoints +
                ", easyCorrectlyAnswered=" + easyCorrectlyAnswered +
                ", mediumCorrectlyAnswered=" + mediumCorrectlyAnswered +
                ", hardCorrectlyAnswered=" + hardCorrectlyAnswered +
                '}';
    }

    public String getUserPointstId() {
        return userPointstId;
    }

    public void setUserPointstId(String userPointstId) {
        this.userPointstId = userPointstId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public int getFinalPoints() {
        return finalPoints;
    }

    public void setFinalPoints(int finalPoints) {
        this.finalPoints = finalPoints;
    }

    public int getEasyCorrectlyAnswered() {
        return easyCorrectlyAnswered;
    }

    public void setEasyCorrectlyAnswered(int easyCorrectlyAnswered) {
        this.easyCorrectlyAnswered = easyCorrectlyAnswered;
    }

    public int getMediumCorrectlyAnswered() {
        return mediumCorrectlyAnswered;
    }

    public void setMediumCorrectlyAnswered(int mediumCorrectlyAnswered) {
        this.mediumCorrectlyAnswered = mediumCorrectlyAnswered;
    }

    public int getHardCorrectlyAnswered() {
        return hardCorrectlyAnswered;
    }

    public void setHardCorrectlyAnswered(int hardCorrectlyAnswered) {
        this.hardCorrectlyAnswered = hardCorrectlyAnswered;
    }
}

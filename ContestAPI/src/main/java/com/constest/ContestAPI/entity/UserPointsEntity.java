package com.constest.ContestAPI.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = UserPointsEntity.TABLE_NAME)
public class UserPointsEntity {

    public static final String TABLE_NAME = "userAnswer";
    private static final String ID_COLUMN = "contestQuestionId";

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = UserPointsEntity.ID_COLUMN)
    private String contestQuestionId;
    String userContestId;
    String answer;
    int points;
    Boolean isSkipped;
    Timestamp timeOfAnswer;


    @ManyToOne
    ContestUserEntity contestUserEntityEntity;

    public String getContestQuestionId() {
        return contestQuestionId;
    }

    public void setContestQuestionId(String contestQuestionId) {
        this.contestQuestionId = contestQuestionId;
    }

    public String getUserContestId() {
        return userContestId;
    }

    public void setUserContestId(String userContestId) {
        this.userContestId = userContestId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Boolean getSkipped() {
        return isSkipped;
    }

    public void setSkipped(Boolean skipped) {
        isSkipped = skipped;
    }

    public Timestamp getTimeOfAnswer() {
        return timeOfAnswer;
    }

    public void setTimeOfAnswer(Timestamp timeOfAnswer) {
        this.timeOfAnswer = timeOfAnswer;
    }


    public ContestUserEntity getContestUserEntityEntity() {
        return contestUserEntityEntity;
    }

    public void setContestUserEntityEntity(ContestUserEntity contestUserEntityEntity) {
        this.contestUserEntityEntity = contestUserEntityEntity;
    }

    @Override
    public String toString() {
        return "UserPointsEntity{" +
                "contestQuestionId='" + contestQuestionId + '\'' +
                ", userContestId='" + userContestId + '\'' +
                ", answer='" + answer + '\'' +
                ", points=" + points +
                ", isSkipped=" + isSkipped +
                ", timeOfAnswer=" + timeOfAnswer +
                ", contestUserEntityEntity=" + contestUserEntityEntity +
                '}';
    }
}

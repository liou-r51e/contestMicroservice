package com.constest.ContestAPI.dto;

import java.sql.Timestamp;

public class UserPointsDTO {
    private String contestQuestionId;
    private String userContestId;
    private String answer;
    private int points;
    private Boolean isSkipped;
    private Timestamp timeOfAnswer;

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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
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

    @Override
    public String toString() {
        return "UserPointsDTO{" +
                "contestQuestionId='" + contestQuestionId + '\'' +
                ", userContestId='" + userContestId + '\'' +
                ", answer='" + answer + '\'' +
                ", points=" + points +
                ", isSkipped=" + isSkipped +
                ", timeOfAnswer=" + timeOfAnswer +
                '}';
    }
}

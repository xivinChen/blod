package com.blod.entity;

public class User {
    private String usUsername;

    private String usPassword;

    private String usNickname;

    private String usQuestion;

    private String usAnswer;

    private Integer usGender;

    private String usGrade;

    private String usEmail;

    private String usTime;

    public String getUsUsername() {
        return usUsername;
    }

    public void setUsUsername(String usUsername) {
        this.usUsername = usUsername == null ? null : usUsername.trim();
    }

    public String getUsPassword() {
        return usPassword;
    }

    public void setUsPassword(String usPassword) {
        this.usPassword = usPassword == null ? null : usPassword.trim();
    }

    public String getUsNickname() {
        return usNickname;
    }

    public void setUsNickname(String usNickname) {
        this.usNickname = usNickname == null ? null : usNickname.trim();
    }

    public String getUsQuestion() {
        return usQuestion;
    }

    public void setUsQuestion(String usQuestion) {
        this.usQuestion = usQuestion == null ? null : usQuestion.trim();
    }

    public String getUsAnswer() {
        return usAnswer;
    }

    public void setUsAnswer(String usAnswer) {
        this.usAnswer = usAnswer == null ? null : usAnswer.trim();
    }

    public Integer getUsGender() {
        return usGender;
    }

    public void setUsGender(Integer usGender) {
        this.usGender = usGender;
    }

    public String getUsGrade() {
        return usGrade;
    }

    public void setUsGrade(String usGrade) {
        this.usGrade = usGrade == null ? null : usGrade.trim();
    }

    public String getUsEmail() {
        return usEmail;
    }

    public void setUsEmail(String usEmail) {
        this.usEmail = usEmail == null ? null : usEmail.trim();
    }

    public String getUsTime() {
        return usTime;
    }

    public void setUsTime(String usTime) {
        this.usTime = usTime == null ? null : usTime.trim();
    }
}
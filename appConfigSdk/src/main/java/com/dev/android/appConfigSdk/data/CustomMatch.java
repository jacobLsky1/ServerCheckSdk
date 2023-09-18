package com.dev.android.appConfigSdk.data;

public class CustomMatch {

    private int id;
    private String localTeamName;
    private String visitorTeamName;
    private String localTeamLogo;
    private String visitorTeamLogo;
    private String leagueName;
    private String leagueLogo;
    private String score;
    private String startTime;
    private String prediction;

    public CustomMatch(int id, String localTeamName, String visitorTeamName, String localTeamLogo,
                       String visitorTeamLogo, String leagueName, String leagueLogo, String score,
                       String startTime, String prediction) {
        this.id = id;
        this.localTeamName = localTeamName;
        this.visitorTeamName = visitorTeamName;
        this.localTeamLogo = localTeamLogo;
        this.visitorTeamLogo = visitorTeamLogo;
        this.leagueName = leagueName;
        this.leagueLogo = leagueLogo;
        this.score = score;
        this.startTime = startTime;
        this.prediction = prediction;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalTeamName() {
        return localTeamName;
    }

    public void setLocalTeamName(String localTeamName) {
        this.localTeamName = localTeamName;
    }

    public String getVisitorTeamName() {
        return visitorTeamName;
    }

    public void setVisitorTeamName(String visitorTeamName) {
        this.visitorTeamName = visitorTeamName;
    }

    public String getLocalTeamLogo() {
        return localTeamLogo;
    }

    public void setLocalTeamLogo(String localTeamLogo) {
        this.localTeamLogo = localTeamLogo;
    }

    public String getVisitorTeamLogo() {
        return visitorTeamLogo;
    }

    public void setVisitorTeamLogo(String visitorTeamLogo) {
        this.visitorTeamLogo = visitorTeamLogo;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueLogo() {
        return leagueLogo;
    }

    public void setLeagueLogo(String leagueLogo) {
        this.leagueLogo = leagueLogo;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getPrediction() {
        return prediction;
    }

    public void setPrediction(String prediction) {
        this.prediction = prediction;
    }
}

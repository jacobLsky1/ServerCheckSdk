package com.dev.android.appConfigSdk.data.perdictions;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.List;

@Keep
public class PredictionsResponse implements Serializable {
  private List<Match> today;

  private List<Match> tomorrow;

  public List<Match> getTodayMatches() {
    return this.today;
  }

  public void setToday(List<Match> today) {
    this.today = today;
  }

  public List<Match> getTomorrowMatches() {
    return this.tomorrow;
  }

  public void setTomorrow(List<Match> tomorrow) {
    this.tomorrow = tomorrow;
  }

  @Keep
  public static class Match implements Serializable, Parcelable {
    private String away_team_logo;

    private String flag_country;

    private String home_team_logo;

    private String advice;

    private String league_name;

    private String league_logo;

    private String league_country;

    private String home_team;

    private String away_team;

    protected Match(Parcel in) {
      away_team_logo = in.readString();
      flag_country = in.readString();
      home_team_logo = in.readString();
      advice = in.readString();
      league_name = in.readString();
      league_logo = in.readString();
      league_country = in.readString();
      home_team = in.readString();
      away_team = in.readString();
    }

    public static final Creator<Match> CREATOR = new Creator<Match>() {
      @Override
      public Match createFromParcel(Parcel in) {
        return new Match(in);
      }

      @Override
      public Match[] newArray(int size) {
        return new Match[size];
      }
    };

    public String getAway_team_logo() {
      return this.away_team_logo;
    }

    public void setAway_team_logo(String away_team_logo) {
      this.away_team_logo = away_team_logo;
    }

    public String getFlag_country() {
      return this.flag_country;
    }

    public void setFlag_country(String flag_country) {
      this.flag_country = flag_country;
    }

    public String getHome_team_logo() {
      return this.home_team_logo;
    }

    public void setHome_team_logo(String home_team_logo) {
      this.home_team_logo = home_team_logo;
    }

    public String getAdvice() {
      return this.advice;
    }

    public void setAdvice(String advice) {
      this.advice = advice;
    }

    public String getLeague_name() {
      return this.league_name;
    }

    public void setLeague_name(String league_name) {
      this.league_name = league_name;
    }

    public String getLeague_logo() {
      return this.league_logo;
    }

    public void setLeague_logo(String league_logo) {
      this.league_logo = league_logo;
    }

    public String getLeague_country() {
      return this.league_country;
    }

    public void setLeague_country(String league_country) {
      this.league_country = league_country;
    }

    public String getHome_team() {
      return this.home_team;
    }

    public void setHome_team(String home_team) {
      this.home_team = home_team;
    }

    public String getAway_team() {
      return this.away_team;
    }

    public void setAway_team(String away_team) {
      this.away_team = away_team;
    }

    @Override
    public int describeContents() {
      return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
      parcel.writeString(away_team_logo);
      parcel.writeString(flag_country);
      parcel.writeString(home_team_logo);
      parcel.writeString(advice);
      parcel.writeString(league_name);
      parcel.writeString(league_logo);
      parcel.writeString(league_country);
      parcel.writeString(home_team);
      parcel.writeString(away_team);
    }
  }
}

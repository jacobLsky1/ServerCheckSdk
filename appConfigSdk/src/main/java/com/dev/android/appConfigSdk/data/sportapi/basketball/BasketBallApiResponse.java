package com.dev.android.appConfigSdk.data.sportapi.basketball;

import androidx.annotation.Keep;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

@Keep
public class BasketBallApiResponse implements Serializable {
  private List<BasketBallGame> response;

  private String get;

  private Parameters parameters;

  private Integer results;

  public List<BasketBallGame> getResponse() {
    return this.response;
  }

  public void setResponse(List<BasketBallGame> response) {
    this.response = response;
  }

  public String getGet() {
    return this.get;
  }

  public void setGet(String get) {
    this.get = get;
  }

  public Parameters getParameters() {
    return this.parameters;
  }

  public void setParameters(Parameters parameters) {
    this.parameters = parameters;
  }

  public Integer getResults() {
    return this.results;
  }

  public void setResults(Integer results) {
    this.results = results;
  }

  @Keep
  public static class BasketBallGame implements Serializable {
    private String date;

    private Country country;

    private Object week;

    private Object stage;

    private Teams teams;

    private Scores scores;

    private String timezone;

    private League league;

    private Integer id;

    private String time;

    private Integer timestamp;

    private Status status;

    public String getDate() {
      return this.date;
    }

    public void setDate(String date) {
      this.date = date;
    }

    public Country getCountry() {
      return this.country;
    }

    public void setCountry(Country country) {
      this.country = country;
    }

    public Object getWeek() {
      return this.week;
    }

    public void setWeek(Object week) {
      this.week = week;
    }

    public Object getStage() {
      return this.stage;
    }

    public void setStage(Object stage) {
      this.stage = stage;
    }

    public Teams getTeams() {
      return this.teams;
    }

    public void setTeams(Teams teams) {
      this.teams = teams;
    }

    public Scores getScores() {
      return this.scores;
    }

    public void setScores(Scores scores) {
      this.scores = scores;
    }

    public String getTimezone() {
      return this.timezone;
    }

    public void setTimezone(String timezone) {
      this.timezone = timezone;
    }

    public League getLeague() {
      return this.league;
    }

    public void setLeague(League league) {
      this.league = league;
    }

    public Integer getId() {
      return this.id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public String getTime() {
      return this.time;
    }

    public void setTime(String time) {
      this.time = time;
    }

    public Integer getTimestamp() {
      return this.timestamp;
    }

    public void setTimestamp(Integer timestamp) {
      this.timestamp = timestamp;
    }

    public Status getStatus() {
      return this.status;
    }

    public void setStatus(Status status) {
      this.status = status;
    }

    @Keep
    public static class Country implements Serializable {
      private String code;

      private String flag;

      private String name;

      private Integer id;

      public String getCode() {
        return this.code;
      }

      public void setCode(String code) {
        this.code = code;
      }

      public String getFlag() {
        return this.flag;
      }

      public void setFlag(String flag) {
        this.flag = flag;
      }

      public String getName() {
        return this.name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public Integer getId() {
        return this.id;
      }

      public void setId(Integer id) {
        this.id = id;
      }
    }

    @Keep
    public static class Teams implements Serializable {
      private Away away;

      private Away home;

      public Away getAway() {
        return this.away;
      }

      public void setAway(Away away) {
        this.away = away;
      }

      public Away getHome() {
        return this.home;
      }

      public void setHome(Away home) {
        this.home = home;
      }

      @Keep
      public static class Away implements Serializable {
        private String name;

        private String logo;

        private Integer id;

        public String getName() {
          return this.name;
        }

        public void setName(String name) {
          this.name = name;
        }

        public String getLogo() {
          return this.logo;
        }

        public void setLogo(String logo) {
          this.logo = logo;
        }

        public Integer getId() {
          return this.id;
        }

        public void setId(Integer id) {
          this.id = id;
        }
      }
    }

    @Keep
    public static class League implements Serializable {
      private String name;

      private String season;

      private String logo;

      private Integer id;

      private String type;

      public String getName() {
        return this.name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public String getSeason() {
        return this.season.toString();
      }

      public void setSeason(String season) {
        this.season = season.toString();
      }

      public String getLogo() {
        return this.logo;
      }

      public void setLogo(String logo) {
        this.logo = logo;
      }

      public Integer getId() {
        return this.id;
      }

      public void setId(Integer id) {
        this.id = id;
      }

      public String getType() {
        return this.type;
      }

      public void setType(String type) {
        this.type = type;
      }
    }

    @Keep
    public static class Status implements Serializable {
      private Object timer;

      @JsonProperty("long")
      private String longValue;

      @JsonProperty("short")
      private String shortValue;

      public Object getTimer() {
        return this.timer;
      }

      public void setTimer(Object timer) {
        this.timer = timer;
      }

      public String getLongValue() {
        return this.longValue;
      }

      public void setLongValue(String longValue) {
        this.longValue = longValue;
      }

      public String getShortValue() {
        return this.shortValue;
      }

      public void setShortValue(String shortValue) {
        this.shortValue = shortValue;
      }
    }
  }

  @Keep
  public static class Parameters implements Serializable {
    private String date;

    public String getDate() {
      return this.date;
    }

    public void setDate(String date) {
      this.date = date;
    }
  }

  @Keep
  public static class Scores implements Serializable {
    private Away away;

    private Away home;

    public Away getAway() {
      return this.away;
    }

    public void setAway(Away away) {
      this.away = away;
    }

    public Away getHome() {
      return this.home;
    }

    public void setHome(Away home) {
      this.home = home;
    }

    @Keep
    public static class Away implements Serializable {
      private Integer total;

      private Integer quarter_4;

      private Integer quarter_3;

      private Integer quarter_2;

      private Integer quarter_1;

      private Object over_time;

      public Integer getTotal() {
        return this.total;
      }

      public void setTotal(Integer total) {
        this.total = total;
      }

      public Integer getQuarter_4() {
        return this.quarter_4;
      }

      public void setQuarter_4(Integer quarter_4) {
        this.quarter_4 = quarter_4;
      }

      public Integer getQuarter_3() {
        return this.quarter_3;
      }

      public void setQuarter_3(Integer quarter_3) {
        this.quarter_3 = quarter_3;
      }

      public Integer getQuarter_2() {
        return this.quarter_2;
      }

      public void setQuarter_2(Integer quarter_2) {
        this.quarter_2 = quarter_2;
      }

      public Integer getQuarter_1() {
        return this.quarter_1;
      }

      public void setQuarter_1(Integer quarter_1) {
        this.quarter_1 = quarter_1;
      }

      public Object getOver_time() {
        return this.over_time;
      }

      public void setOver_time(Object over_time) {
        this.over_time = over_time;
      }
    }
  }
}

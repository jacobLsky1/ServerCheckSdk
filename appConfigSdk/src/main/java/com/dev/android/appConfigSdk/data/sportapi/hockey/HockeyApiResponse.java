package com.dev.android.appConfigSdk.data.sportapi.hockey;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class HockeyApiResponse implements Serializable {
  private List<HockeyGame> response;

  private String get;

  private Parameters parameters;

  private Integer results;

  public List<HockeyGame> getResponse() {
    return this.response;
  }

  public void setResponse(List<HockeyGame> response) {
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

  public static class HockeyGame implements Serializable {
    private String date;

    private Country country;

    private Object week;

    private Teams teams;

    private Scores scores;

    private String timezone;

    private League league;

    private Object timer;

    private Periods periods;

    private Integer id;

    private String time;

    private Boolean events;

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

    public Object getTimer() {
      return this.timer;
    }

    public void setTimer(Object timer) {
      this.timer = timer;
    }

    public Periods getPeriods() {
      return this.periods;
    }

    public void setPeriods(Periods periods) {
      this.periods = periods;
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

    public Boolean getEvents() {
      return this.events;
    }

    public void setEvents(Boolean events) {
      this.events = events;
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

    public static class League implements Serializable {
      private String name;

      private String logo;

      private Integer season;

      private Integer id;

      private String type;

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

      public Integer getSeason() {
        return this.season;
      }

      public void setSeason(Integer season) {
        this.season = season;
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

    public static class Periods implements Serializable {
      private String third;

      private Object penalties;

      private Object overtime;

      private String first;

      private String second;

      public String getThird() {
        return this.third;
      }

      public void setThird(String third) {
        this.third = third;
      }

      public Object getPenalties() {
        return this.penalties;
      }

      public void setPenalties(Object penalties) {
        this.penalties = penalties;
      }

      public Object getOvertime() {
        return this.overtime;
      }

      public void setOvertime(Object overtime) {
        this.overtime = overtime;
      }

      public String getFirst() {
        return this.first;
      }

      public void setFirst(String first) {
        this.first = first;
      }

      public String getSecond() {
        return this.second;
      }

      public void setSecond(String second) {
        this.second = second;
      }
    }

    public static class Scores implements Serializable {
      private Integer away;

      private Integer home;

      public Integer getAway() {
        return this.away;
      }

      public void setAway(Integer away) {
        this.away = away;
      }

      public Integer getHome() {
        return this.home;
      }

      public void setHome(Integer home) {
        this.home = home;
      }
    }

    public static class Status implements Serializable {
      @JsonProperty("long")
      private String longValue;

      @JsonProperty("short")
      private String shortValue;

      public String getLongValue() {
        return this.longValue;
      }

      public void setLongValue(String longValue) {
        this.longValue = longValue;
      }

      public String getShortValue() {
        return this.shortValue;
      }

      public void setShortValue(String shor) {
        this.shortValue = shor;
      }
    }
  }

  public static class Parameters implements Serializable {
    private String date;

    public String getDate() {
      return this.date;
    }

    public void setDate(String date) {
      this.date = date;
    }
  }
}

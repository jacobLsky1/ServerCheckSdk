package com.dev.android.appConfigSdk.data.sportapi.nfl;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class NFLapiResponse implements Serializable {
  private List<NFLGame> response;

  private String get;

  private Parameters parameters;

  private Integer results;

  public List<NFLGame> getResponse() {
    return this.response;
  }

  public void setResponse(List<NFLGame> response) {
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

  public static class NFLGame implements Serializable {
    private Game game;

    private Teams teams;

    private Scores scores;

    private League league;

    public Game getGame() {
      return this.game;
    }

    public void setGame(Game game) {
      this.game = game;
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

    public League getLeague() {
      return this.league;
    }

    public void setLeague(League league) {
      this.league = league;
    }

    public static class Game implements Serializable {
      private Date date;

      private Venue venue;

      private String week;

      private String stage;

      private Integer id;

      private Status status;

      public Date getDate() {
        return this.date;
      }

      public void setDate(Date date) {
        this.date = date;
      }

      public Venue getVenue() {
        return this.venue;
      }

      public void setVenue(Venue venue) {
        this.venue = venue;
      }

      public String getWeek() {
        return this.week;
      }

      public void setWeek(String week) {
        this.week = week;
      }

      public String getStage() {
        return this.stage;
      }

      public void setStage(String stage) {
        this.stage = stage;
      }

      public Integer getId() {
        return this.id;
      }

      public void setId(Integer id) {
        this.id = id;
      }

      public Status getStatus() {
        return this.status;
      }

      public void setStatus(Status status) {
        this.status = status;
      }

      public static class Date implements Serializable {
        private String date;

        private String timezone;

        private String time;

        private Integer timestamp;

        public String getDate() {
          return this.date;
        }

        public void setDate(String date) {
          this.date = date;
        }

        public String getTimezone() {
          return this.timezone;
        }

        public void setTimezone(String timezone) {
          this.timezone = timezone;
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
      }

      public static class Venue implements Serializable {
        private String city;

        private String name;

        public String getCity() {
          return this.city;
        }

        public void setCity(String city) {
          this.city = city;
        }

        public String getName() {
          return this.name;
        }

        public void setName(String name) {
          this.name = name;
        }
      }

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
      private Country country;

      private String name;

      private String season;

      private String logo;

      private Integer id;

      public Country getCountry() {
        return this.country;
      }

      public void setCountry(Country country) {
        this.country = country;
      }

      public String getName() {
        return this.name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public String getSeason() {
        return this.season;
      }

      public void setSeason(String season) {
        this.season = season;
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

      public static class Country implements Serializable {
        private String code;

        private String flag;

        private String name;

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
      }
    }
  }

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

    public static class Away implements Serializable {
      private Integer total;

      private Integer quarter_4;

      private Integer quarter_3;

      private Object overtime;

      private Integer quarter_2;

      private Integer quarter_1;

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

      public Object getOvertime() {
        return this.overtime;
      }

      public void setOvertime(Object overtime) {
        this.overtime = overtime;
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

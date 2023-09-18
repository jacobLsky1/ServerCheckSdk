package com.dev.android.appConfigSdk.data.sportapi.baseball;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class BaseBallApiResponse implements Serializable {
  private List<BaseBallGame> response;

  private String get;

  private Parameters parameters;

  private Integer results;

  public List<BaseBallGame> getResponse() {
    return this.response;
  }

  public void setResponse(List<BaseBallGame> response) {
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

  public static class BaseBallGame implements Serializable {
    private String date;

    private Country country;

    private String week;

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

    public String getWeek() {
      return this.week;
    }

    public void setWeek(String week) {
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
      private Integer hits;

      private Integer total;

      private Innings innings;

      private Integer errors;

      public Integer getHits() {
        return this.hits;
      }

      public void setHits(Integer hits) {
        this.hits = hits;
      }

      public Integer getTotal() {
        return this.total;
      }

      public void setTotal(Integer total) {
        this.total = total;
      }

      public Innings getInnings() {
        return this.innings;
      }

      public void setInnings(Innings innings) {
        this.innings = innings;
      }

      public Integer getErrors() {
        return this.errors;
      }

      public void setErrors(Integer errors) {
        this.errors = errors;
      }

      public static class Innings implements Serializable {
        @JsonProperty("9")
        private Integer i9;

        private Object extra;

        @JsonProperty("1")
        private Integer i1;

        @JsonProperty("2")
        private Integer i2;

        @JsonProperty("3")
        private Integer i3;

        @JsonProperty("4")
        private Integer i4;

        @JsonProperty("5")
        private Integer i5;

        @JsonProperty("6")
        private Integer i6;

        @JsonProperty("7")
        private Integer i7;

        @JsonProperty("8")
        private Integer i8;

        public Integer getI9() {
          return this.i9;
        }

        public void setI9(Integer i9) {
          this.i9 = i9;
        }

        public Object getExtra() {
          return this.extra;
        }

        public void setExtra(Object extra) {
          this.extra = extra;
        }

        public Integer getI1() {
          return this.i1;
        }

        public void setI1(Integer i1) {
          this.i1 = i1;
        }

        public Integer getI2() {
          return this.i2;
        }

        public void setI2(Integer i2) {
          this.i2 = i2;
        }

        public Integer getI3() {
          return this.i3;
        }

        public void setI3(Integer i3) {
          this.i3 = i3;
        }

        public Integer getI4() {
          return this.i4;
        }

        public void setI4(Integer i4) {
          this.i4 = i4;
        }

        public Integer getI5() {
          return this.i5;
        }

        public void setI5(Integer i5) {
          this.i5 = i5;
        }

        public Integer getI6() {
          return this.i6;
        }

        public void setI6(Integer i6) {
          this.i6 = i6;
        }

        public Integer getI7() {
          return this.i7;
        }

        public void setI7(Integer i7) {
          this.i7 = i7;
        }

        public Integer getI8() {
          return this.i8;
        }

        public void setI8(Integer i8) {
          this.i8 = i8;
        }
      }
    }
  }


}

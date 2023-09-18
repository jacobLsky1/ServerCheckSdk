package com.dev.android.appConfigSdk.data.sportmonks;

import java.io.Serializable;
import java.util.List;

public class SoccerApiResponse implements Serializable {
  private List<SoccerGame> data;

  public List<SoccerGame> getData() {
    return this.data;
  }

  public void setData(List<SoccerGame> data) {
    this.data = data;
  }

  public static class SoccerGame implements Serializable {
    private Boolean commentaries;

    private Team localTeam;

    private Scores scores;

    private Integer visitorteam_id;

    private Weather_report weather_report;

    private Standings standings;

    private Colors colors;

    private String leg;

    private Boolean neutral_venue;

    private Integer round_id;

    private Integer referee_id;

    private Object winner_team_id;

    private Integer localteam_id;

    private Object details;

    private Integer id;

    private String pitch;

    private Integer venue_id;

    private Assistants assistants;

    private Team visitorTeam;

    private Integer stage_id;

    private League league;

    private Integer season_id;

    private Coaches coaches;

    private Object aggregate_id;

    private Boolean winning_odds_calculated;

    private Boolean deleted;

    private Formations formations;

    private Object group_id;

    private Boolean is_placeholder;

    private Time time;

    private Integer league_id;

    private Object attendance;

    public Boolean getCommentaries() {
      return this.commentaries;
    }

    public void setCommentaries(Boolean commentaries) {
      this.commentaries = commentaries;
    }

    public Team getLocalTeam() {
      return this.localTeam;
    }

    public void setLocalTeam(Team localTeam) {
      this.localTeam = localTeam;
    }

    public Scores getScores() {
      return this.scores;
    }

    public void setScores(Scores scores) {
      this.scores = scores;
    }

    public Integer getVisitorteam_id() {
      return this.visitorteam_id;
    }

    public void setVisitorteam_id(Integer visitorteam_id) {
      this.visitorteam_id = visitorteam_id;
    }

    public Weather_report getWeather_report() {
      return this.weather_report;
    }

    public void setWeather_report(Weather_report weather_report) {
      this.weather_report = weather_report;
    }

    public Standings getStandings() {
      return this.standings;
    }

    public void setStandings(Standings standings) {
      this.standings = standings;
    }

    public Colors getColors() {
      return this.colors;
    }

    public void setColors(Colors colors) {
      this.colors = colors;
    }

    public String getLeg() {
      return this.leg;
    }

    public void setLeg(String leg) {
      this.leg = leg;
    }

    public Boolean getNeutral_venue() {
      return this.neutral_venue;
    }

    public void setNeutral_venue(Boolean neutral_venue) {
      this.neutral_venue = neutral_venue;
    }

    public Integer getRound_id() {
      return this.round_id;
    }

    public void setRound_id(Integer round_id) {
      this.round_id = round_id;
    }

    public Integer getReferee_id() {
      return this.referee_id;
    }

    public void setReferee_id(Integer referee_id) {
      this.referee_id = referee_id;
    }

    public Object getWinner_team_id() {
      return this.winner_team_id;
    }

    public void setWinner_team_id(Object winner_team_id) {
      this.winner_team_id = winner_team_id;
    }

    public Integer getLocalteam_id() {
      return this.localteam_id;
    }

    public void setLocalteam_id(Integer localteam_id) {
      this.localteam_id = localteam_id;
    }

    public Object getDetails() {
      return this.details;
    }

    public void setDetails(Object details) {
      this.details = details;
    }

    public Integer getId() {
      return this.id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public String getPitch() {
      return this.pitch;
    }

    public void setPitch(String pitch) {
      this.pitch = pitch;
    }

    public Integer getVenue_id() {
      return this.venue_id;
    }

    public void setVenue_id(Integer venue_id) {
      this.venue_id = venue_id;
    }

    public Assistants getAssistants() {
      return this.assistants;
    }

    public void setAssistants(Assistants assistants) {
      this.assistants = assistants;
    }

    public Team getVisitorTeam() {
      return this.visitorTeam;
    }

    public void setVisitorTeam(Team visitorTeam) {
      this.visitorTeam = visitorTeam;
    }

    public Integer getStage_id() {
      return this.stage_id;
    }

    public void setStage_id(Integer stage_id) {
      this.stage_id = stage_id;
    }

    public League getLeague() {
      return this.league;
    }

    public void setLeague(League league) {
      this.league = league;
    }

    public Integer getSeason_id() {
      return this.season_id;
    }

    public void setSeason_id(Integer season_id) {
      this.season_id = season_id;
    }

    public Coaches getCoaches() {
      return this.coaches;
    }

    public void setCoaches(Coaches coaches) {
      this.coaches = coaches;
    }

    public Object getAggregate_id() {
      return this.aggregate_id;
    }

    public void setAggregate_id(Object aggregate_id) {
      this.aggregate_id = aggregate_id;
    }

    public Boolean getWinning_odds_calculated() {
      return this.winning_odds_calculated;
    }

    public void setWinning_odds_calculated(Boolean winning_odds_calculated) {
      this.winning_odds_calculated = winning_odds_calculated;
    }

    public Boolean getDeleted() {
      return this.deleted;
    }

    public void setDeleted(Boolean deleted) {
      this.deleted = deleted;
    }

    public Formations getFormations() {
      return this.formations;
    }

    public void setFormations(Formations formations) {
      this.formations = formations;
    }

    public Object getGroup_id() {
      return this.group_id;
    }

    public void setGroup_id(Object group_id) {
      this.group_id = group_id;
    }

    public Boolean getIs_placeholder() {
      return this.is_placeholder;
    }

    public void setIs_placeholder(Boolean is_placeholder) {
      this.is_placeholder = is_placeholder;
    }

    public Time getTime() {
      return this.time;
    }

    public void setTime(Time time) {
      this.time = time;
    }

    public Integer getLeague_id() {
      return this.league_id;
    }

    public void setLeague_id(Integer league_id) {
      this.league_id = league_id;
    }

    public Object getAttendance() {
      return this.attendance;
    }

    public void setAttendance(Object attendance) {
      this.attendance = attendance;
    }

    public class SoccerResponse implements Serializable {
    }

    public static class Scores implements Serializable {
      private String ht_score;

      private Object ps_score;

      private Integer localteam_score;

      private Object localteam_pen_score;

      private Integer visitorteam_score;

      private String ft_score;

      private Object et_score;

      private Object visitorteam_pen_score;

      public String getHt_score() {
        return this.ht_score;
      }

      public void setHt_score(String ht_score) {
        this.ht_score = ht_score;
      }

      public Object getPs_score() {
        return this.ps_score;
      }

      public void setPs_score(Object ps_score) {
        this.ps_score = ps_score;
      }

      public Integer getLocalteam_score() {
        return this.localteam_score;
      }

      public void setLocalteam_score(Integer localteam_score) {
        this.localteam_score = localteam_score;
      }

      public Object getLocalteam_pen_score() {
        return this.localteam_pen_score;
      }

      public void setLocalteam_pen_score(Object localteam_pen_score) {
        this.localteam_pen_score = localteam_pen_score;
      }

      public Integer getVisitorteam_score() {
        return this.visitorteam_score;
      }

      public void setVisitorteam_score(Integer visitorteam_score) {
        this.visitorteam_score = visitorteam_score;
      }

      public String getFt_score() {
        return this.ft_score;
      }

      public void setFt_score(String ft_score) {
        this.ft_score = ft_score;
      }

      public Object getEt_score() {
        return this.et_score;
      }

      public void setEt_score(Object et_score) {
        this.et_score = et_score;
      }

      public Object getVisitorteam_pen_score() {
        return this.visitorteam_pen_score;
      }

      public void setVisitorteam_pen_score(Object visitorteam_pen_score) {
        this.visitorteam_pen_score = visitorteam_pen_score;
      }
    }

    public static class Weather_report implements Serializable {
      private String code;

      private String updated_at;

      private String icon;

      private Temperature temperature;

      private Coordinates coordinates;

      private String humidity;

      private String clouds;

      private Integer pressure;

      private String type;

      private Temperature temperature_celcius;

      private Wind wind;

      public String getCode() {
        return this.code;
      }

      public void setCode(String code) {
        this.code = code;
      }

      public String getUpdated_at() {
        return this.updated_at;
      }

      public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
      }

      public String getIcon() {
        return this.icon;
      }

      public void setIcon(String icon) {
        this.icon = icon;
      }

      public Temperature getTemperature() {
        return this.temperature;
      }

      public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
      }

      public Coordinates getCoordinates() {
        return this.coordinates;
      }

      public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
      }

      public String getHumidity() {
        return this.humidity;
      }

      public void setHumidity(String humidity) {
        this.humidity = humidity;
      }

      public String getClouds() {
        return this.clouds;
      }

      public void setClouds(String clouds) {
        this.clouds = clouds;
      }

      public Integer getPressure() {
        return this.pressure;
      }

      public void setPressure(Integer pressure) {
        this.pressure = pressure;
      }

      public String getType() {
        return this.type;
      }

      public void setType(String type) {
        this.type = type;
      }

      public Temperature getTemperature_celcius() {
        return this.temperature_celcius;
      }

      public void setTemperature_celcius(Temperature temperature_celcius) {
        this.temperature_celcius = temperature_celcius;
      }

      public Wind getWind() {
        return this.wind;
      }

      public void setWind(Wind wind) {
        this.wind = wind;
      }

      public static class Temperature implements Serializable {
        private Double temp;

        private String unit;

        public Double getTemp() {
          return this.temp;
        }

        public void setTemp(Double temp) {
          this.temp = temp;
        }

        public String getUnit() {
          return this.unit;
        }

        public void setUnit(String unit) {
          this.unit = unit;
        }
      }

      public static class Coordinates implements Serializable {
        private Double lon;

        private Double lat;

        public Double getLon() {
          return this.lon;
        }

        public void setLon(Double lon) {
          this.lon = lon;
        }

        public Double getLat() {
          return this.lat;
        }

        public void setLat(Double lat) {
          this.lat = lat;
        }
      }

      public static class Wind implements Serializable {
        private Integer degree;

        private String speed;

        public Integer getDegree() {
          return this.degree;
        }

        public void setDegree(Integer degree) {
          this.degree = degree;
        }

        public String getSpeed() {
          return this.speed;
        }

        public void setSpeed(String speed) {
          this.speed = speed;
        }
      }
    }

    public static class Standings implements Serializable {
      private Integer visitorteam_position;

      private Integer localteam_position;

      public Integer getVisitorteam_position() {
        return this.visitorteam_position;
      }

      public void setVisitorteam_position(Integer visitorteam_position) {
        this.visitorteam_position = visitorteam_position;
      }

      public Integer getLocalteam_position() {
        return this.localteam_position;
      }

      public void setLocalteam_position(Integer localteam_position) {
        this.localteam_position = localteam_position;
      }
    }

    public static class Colors implements Serializable {
      private TeamColor localteam;

      private TeamColor visitorteam;

      public TeamColor getLocalteam() {
        return this.localteam;
      }

      public void setLocalteam(TeamColor localteam) {
        this.localteam = localteam;
      }

      public TeamColor getVisitorteam() {
        return this.visitorteam;
      }

      public void setVisitorteam(TeamColor visitorteam) {
        this.visitorteam = visitorteam;
      }

      public static class TeamColor implements Serializable {
        private String kit_colors;

        private String color;

        public String getKit_colors() {
          return this.kit_colors;
        }

        public void setKit_colors(String kit_colors) {
          this.kit_colors = kit_colors;
        }

        public String getColor() {
          return this.color;
        }

        public void setColor(String color) {
          this.color = color;
        }
      }
    }

    public static class Assistants implements Serializable {
      private Integer fourth_official_id;

      private Integer second_assistant_id;

      private Integer first_assistant_id;

      public Integer getFourth_official_id() {
        return this.fourth_official_id;
      }

      public void setFourth_official_id(Integer fourth_official_id) {
        this.fourth_official_id = fourth_official_id;
      }

      public Integer getSecond_assistant_id() {
        return this.second_assistant_id;
      }

      public void setSecond_assistant_id(Integer second_assistant_id) {
        this.second_assistant_id = second_assistant_id;
      }

      public Integer getFirst_assistant_id() {
        return this.first_assistant_id;
      }

      public void setFirst_assistant_id(Integer first_assistant_id) {
        this.first_assistant_id = first_assistant_id;
      }
    }

    public static class Coaches implements Serializable {
      private Integer visitorteam_coach_id;

      private Integer localteam_coach_id;

      public Integer getVisitorteam_coach_id() {
        return this.visitorteam_coach_id;
      }

      public void setVisitorteam_coach_id(Integer visitorteam_coach_id) {
        this.visitorteam_coach_id = visitorteam_coach_id;
      }

      public Integer getLocalteam_coach_id() {
        return this.localteam_coach_id;
      }

      public void setLocalteam_coach_id(Integer localteam_coach_id) {
        this.localteam_coach_id = localteam_coach_id;
      }
    }

    public static class Formations implements Serializable {
      private String visitorteam_formation;

      private String localteam_formation;

      public String getVisitorteam_formation() {
        return this.visitorteam_formation;
      }

      public void setVisitorteam_formation(String visitorteam_formation) {
        this.visitorteam_formation = visitorteam_formation;
      }

      public String getLocalteam_formation() {
        return this.localteam_formation;
      }

      public void setLocalteam_formation(String localteam_formation) {
        this.localteam_formation = localteam_formation;
      }
    }

    public static class Time implements Serializable {
      private Integer added_time;

      private Starting_at starting_at;

      private Object injury_time;

      private Object extra_minute;

      private String status;

      private Integer minute;

      private Object second;

      public Integer getAdded_time() {
        return this.added_time;
      }

      public void setAdded_time(Integer added_time) {
        this.added_time = added_time;
      }

      public Starting_at getStarting_at() {
        return this.starting_at;
      }

      public void setStarting_at(Starting_at starting_at) {
        this.starting_at = starting_at;
      }

      public Object getInjury_time() {
        return this.injury_time;
      }

      public void setInjury_time(Object injury_time) {
        this.injury_time = injury_time;
      }

      public Object getExtra_minute() {
        return this.extra_minute;
      }

      public void setExtra_minute(Object extra_minute) {
        this.extra_minute = extra_minute;
      }

      public String getStatus() {
        return this.status;
      }

      public void setStatus(String status) {
        this.status = status;
      }

      public Integer getMinute() {
        return this.minute;
      }

      public void setMinute(Integer minute) {
        this.minute = minute;
      }

      public Object getSecond() {
        return this.second;
      }

      public void setSecond(Object second) {
        this.second = second;
      }

      public static class Starting_at implements Serializable {
        private String date;

        private String date_time;

        private String timezone;

        private String time;

        private Integer timestamp;

        public String getDate() {
          return this.date;
        }

        public void setDate(String date) {
          this.date = date;
        }

        public String getDate_time() {
          return this.date_time;
        }

        public void setDate_time(String date_time) {
          this.date_time = date_time;
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
    }
  }

  public static class Team implements Serializable {
    private Data data;

    public Data getData() {
      return this.data;
    }

    public void setData(Data data) {
      this.data = data;
    }

    public static class Data implements Serializable {
      private Object twitter;

      private String logo_path;

      private Boolean is_placeholder;

      private String name;

      private Integer founded;

      private Object legacy_id;

      private Boolean national_team;

      private Integer id;

      private Integer current_season_id;

      private Integer country_id;

      private Integer venue_id;

      private Object short_code;

      public Object getTwitter() {
        return this.twitter;
      }

      public void setTwitter(Object twitter) {
        this.twitter = twitter;
      }

      public String getLogo_path() {
        return this.logo_path;
      }

      public void setLogo_path(String logo_path) {
        this.logo_path = logo_path;
      }

      public Boolean getIs_placeholder() {
        return this.is_placeholder;
      }

      public void setIs_placeholder(Boolean is_placeholder) {
        this.is_placeholder = is_placeholder;
      }

      public String getName() {
        return this.name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public Integer getFounded() {
        return this.founded;
      }

      public void setFounded(Integer founded) {
        this.founded = founded;
      }

      public Object getLegacy_id() {
        return this.legacy_id;
      }

      public void setLegacy_id(Object legacy_id) {
        this.legacy_id = legacy_id;
      }

      public Boolean getNational_team() {
        return this.national_team;
      }

      public void setNational_team(Boolean national_team) {
        this.national_team = national_team;
      }

      public Integer getId() {
        return this.id;
      }

      public void setId(Integer id) {
        this.id = id;
      }

      public Integer getCurrent_season_id() {
        return this.current_season_id;
      }

      public void setCurrent_season_id(Integer current_season_id) {
        this.current_season_id = current_season_id;
      }

      public Integer getCountry_id() {
        return this.country_id;
      }

      public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
      }

      public Integer getVenue_id() {
        return this.venue_id;
      }

      public void setVenue_id(Integer venue_id) {
        this.venue_id = venue_id;
      }

      public Object getShort_code() {
        return this.short_code;
      }

      public void setShort_code(Object short_code) {
        this.short_code = short_code;
      }
    }
  }

  public static class League implements Serializable {
    private Data data;

    public Data getData() {
      return this.data;
    }

    public void setData(Data data) {
      this.data = data;
    }

    public static class Data implements Serializable {
      private Integer current_round_id;

      private Coverage coverage;

      private Boolean live_standings;

      private String logo_path;

      private Boolean is_cup;

      private Boolean active;

      private Integer current_season_id;

      private String type;

      private Integer current_stage_id;

      private String name;

      private Integer legacy_id;

      private Integer id;

      private Integer country_id;

      private Boolean is_friendly;

      public Integer getCurrent_round_id() {
        return this.current_round_id;
      }

      public void setCurrent_round_id(Integer current_round_id) {
        this.current_round_id = current_round_id;
      }

      public Coverage getCoverage() {
        return this.coverage;
      }

      public void setCoverage(Coverage coverage) {
        this.coverage = coverage;
      }

      public Boolean getLive_standings() {
        return this.live_standings;
      }

      public void setLive_standings(Boolean live_standings) {
        this.live_standings = live_standings;
      }

      public String getLogo_path() {
        return this.logo_path;
      }

      public void setLogo_path(String logo_path) {
        this.logo_path = logo_path;
      }

      public Boolean getIs_cup() {
        return this.is_cup;
      }

      public void setIs_cup(Boolean is_cup) {
        this.is_cup = is_cup;
      }

      public Boolean getActive() {
        return this.active;
      }

      public void setActive(Boolean active) {
        this.active = active;
      }

      public Integer getCurrent_season_id() {
        return this.current_season_id;
      }

      public void setCurrent_season_id(Integer current_season_id) {
        this.current_season_id = current_season_id;
      }

      public String getType() {
        return this.type;
      }

      public void setType(String type) {
        this.type = type;
      }

      public Integer getCurrent_stage_id() {
        return this.current_stage_id;
      }

      public void setCurrent_stage_id(Integer current_stage_id) {
        this.current_stage_id = current_stage_id;
      }

      public String getName() {
        return this.name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public Integer getLegacy_id() {
        return this.legacy_id;
      }

      public void setLegacy_id(Integer legacy_id) {
        this.legacy_id = legacy_id;
      }

      public Integer getId() {
        return this.id;
      }

      public void setId(Integer id) {
        this.id = id;
      }

      public Integer getCountry_id() {
        return this.country_id;
      }

      public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
      }

      public Boolean getIs_friendly() {
        return this.is_friendly;
      }

      public void setIs_friendly(Boolean is_friendly) {
        this.is_friendly = is_friendly;
      }

      public static class Coverage implements Serializable {
        private Boolean topscorer_goals;

        private Boolean topscorer_assists;

        private Boolean topscorer_cards;

        private Boolean predictions;

        public Boolean getTopscorer_goals() {
          return this.topscorer_goals;
        }

        public void setTopscorer_goals(Boolean topscorer_goals) {
          this.topscorer_goals = topscorer_goals;
        }

        public Boolean getTopscorer_assists() {
          return this.topscorer_assists;
        }

        public void setTopscorer_assists(Boolean topscorer_assists) {
          this.topscorer_assists = topscorer_assists;
        }

        public Boolean getTopscorer_cards() {
          return this.topscorer_cards;
        }

        public void setTopscorer_cards(Boolean topscorer_cards) {
          this.topscorer_cards = topscorer_cards;
        }

        public Boolean getPredictions() {
          return this.predictions;
        }

        public void setPredictions(Boolean predictions) {
          this.predictions = predictions;
        }
      }
    }
  }
}

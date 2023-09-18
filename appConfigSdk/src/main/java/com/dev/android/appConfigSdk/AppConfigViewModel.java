package com.dev.android.appConfigSdk;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.dev.android.appConfigSdk.data.CustomMatch;
import com.dev.android.appConfigSdk.data.perdictions.PredictionsResponse;
import com.dev.android.appConfigSdk.data.sportapi.baseball.BaseBallApiResponse;
import com.dev.android.appConfigSdk.data.sportapi.basketball.BasketBallApiResponse;
import com.dev.android.appConfigSdk.data.sportapi.handball.HandballApiResponse;
import com.dev.android.appConfigSdk.data.sportapi.hockey.HockeyApiResponse;
import com.dev.android.appConfigSdk.data.sportapi.nfl.NFLapiResponse;
import com.dev.android.appConfigSdk.data.sportapi.rugby.RugbyApiResponse;
import com.dev.android.appConfigSdk.data.sportapi.volleyball.VolleyBallApiResponse;
import com.dev.android.appConfigSdk.data.sportmonks.SoccerApiResponse;
import com.dev.android.appConfigSdk.services.retrofit.BaseBallRetrofitInstance;
import com.dev.android.appConfigSdk.services.retrofit.BasketBallRetrofitInstance;
import com.dev.android.appConfigSdk.services.retrofit.HandBallRetrofitInstance;
import com.dev.android.appConfigSdk.services.retrofit.HockeyRetrofitInstance;
import com.dev.android.appConfigSdk.services.retrofit.NFLRetrofitInstance;
import com.dev.android.appConfigSdk.services.retrofit.PredictionsRetrofitInstance;
import com.dev.android.appConfigSdk.services.retrofit.RugbyRetrofitInstance;
import com.dev.android.appConfigSdk.services.retrofit.SoccerRetrofitInstance;
import com.dev.android.appConfigSdk.services.retrofit.VolleyBallRetrofitInstance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AppConfigViewModel extends ViewModel {

    public MutableLiveData<List<CustomMatch>> _soccerMatches = new MutableLiveData<>();
    public LiveData<List<CustomMatch>> getSoccerMatches() {
        return _soccerMatches;
    }

    public MutableLiveData<List<CustomMatch>> _soccerPredictionsMatches = new MutableLiveData<>();
    public LiveData<List<CustomMatch>> getSoccerPredictionsMatches() {
        return _soccerPredictionsMatches;
    }

    public MutableLiveData<List<CustomMatch>> _basketballMatches = new MutableLiveData<>();
    public LiveData<List<CustomMatch>> getBasketBallMatches() {
        return _basketballMatches;
    }

    public MutableLiveData<List<CustomMatch>> _baseballMatches = new MutableLiveData<>();
    public LiveData<List<CustomMatch>> getBaseBallMatches() {
        return _baseballMatches;
    }

    public MutableLiveData<List<CustomMatch>> _rugbyMatches = new MutableLiveData<>();
    public LiveData<List<CustomMatch>> geRugbyMatches() {
        return _rugbyMatches;
    }

    public MutableLiveData<List<CustomMatch>> _hockeyMatches = new MutableLiveData<>();
    public LiveData<List<CustomMatch>> geHockeyMatches() {
        return _hockeyMatches;
    }

    public MutableLiveData<List<CustomMatch>> _volleyBallMatches = new MutableLiveData<>();
    public LiveData<List<CustomMatch>> getVolleyBallMatches() {
        return _volleyBallMatches;
    }

    public MutableLiveData<List<CustomMatch>> _handBallMatches = new MutableLiveData<>();
    public LiveData<List<CustomMatch>> getHandBallMatches() {
        return _handBallMatches;
    }

    public MutableLiveData<List<CustomMatch>> _nflMatches = new MutableLiveData<>();
    public LiveData<List<CustomMatch>> getNFLMatches() {
        return _nflMatches;
    }

    BaseBallRetrofitInstance baseBallRetrofitInstance = new BaseBallRetrofitInstance();
    BasketBallRetrofitInstance basketBallRetrofitInstance = new BasketBallRetrofitInstance();
    HockeyRetrofitInstance hockeyRetrofitInstance = new HockeyRetrofitInstance();
    RugbyRetrofitInstance rugbyRetrofitInstance = new RugbyRetrofitInstance();
    HandBallRetrofitInstance handBallRetrofitInstance = new HandBallRetrofitInstance();
    VolleyBallRetrofitInstance volleyBallRetrofitInstance = new VolleyBallRetrofitInstance();
    NFLRetrofitInstance nflRetrofitInstance = new NFLRetrofitInstance();
    SoccerRetrofitInstance soccerRetrofitInstance = new SoccerRetrofitInstance();
    PredictionsRetrofitInstance predictionsRetrofitInstance = new PredictionsRetrofitInstance();


    private Call<BaseBallApiResponse> baseballRequest = null;
    private Call<BasketBallApiResponse> basketBallRequest = null;
    private Call<SoccerApiResponse> soccerRequest = null;
    private Call<PredictionsResponse> predictionsRequest = null;
    private Call<RugbyApiResponse> rugbyRequest = null;
    private Call<HockeyApiResponse> hockeyRequest = null;
    private Call<VolleyBallApiResponse> volleyBallRequest = null;
    private Call<HandballApiResponse> handBallRequest = null;
    private Call<NFLapiResponse> nflRequest = null;

    private MutableLiveData<Boolean> _isFetchingData = new MutableLiveData<>(false);
    public LiveData<Boolean> getIsFetchingData(){
        return _isFetchingData;
    }

    private MutableLiveData<String> _selectedDate = new MutableLiveData<>("");
    public LiveData<String> getSelectedDate(){
        return _selectedDate;
    }

    private MutableLiveData<String> _querySearch = new MutableLiveData<>("");
    public LiveData<String> getQuerySearch(){
        return _querySearch;
    }

    public void setSelectedDate(String date){
        _selectedDate.setValue(date);
    }

    public void setQuerySearch(String query){
        _querySearch.setValue(query);
    }
    public void basketBall(String date){
        List<CustomMatch> list = new ArrayList<>();
        _isFetchingData.setValue(true);
        if (basketBallRequest != null) {
            basketBallRequest.cancel();
            basketBallRequest = null;
        }

        Call<BasketBallApiResponse> callback = basketBallRetrofitInstance.api.basketballGames(date);
        basketBallRequest = callback;
        callback.enqueue(new Callback<BasketBallApiResponse>() {
            @Override
            public void onResponse(Call<BasketBallApiResponse> call, Response<BasketBallApiResponse> response) {
                basketBallRequest = null;

                if (response.isSuccessful()) {
                    List<BasketBallApiResponse.BasketBallGame> matchList = response.body().getResponse();
                    matchList = matchList.stream().filter(item -> (
                                    (item.getTeams().getHome().getName() !=null &&
                                            item.getTeams().getAway().getName() !=null &&
                                            item.getTeams().getHome().getLogo() !=null &&
                                            item.getTeams().getAway().getLogo() !=null &&
                                            item.getLeague().getName() !=null &&
                                            item.getLeague().getLogo() !=null &&
                                            item.getTime() !=null
                                    )
                            )
                    ).collect(Collectors.toList());


                    Collections.sort(matchList, new Comparator<BasketBallApiResponse.BasketBallGame>() {
                        @Override
                        public int compare(BasketBallApiResponse.BasketBallGame match1, BasketBallApiResponse.BasketBallGame match2) {
                            return match1.getLeague().getName().compareTo(match2.getLeague().getName());
                        }
                    });

                   for(BasketBallApiResponse.BasketBallGame game: matchList){
                       int id =game.getId();
                       String localTeamName = game.getTeams().getHome().getName();
                       String visitorTeamName =game.getTeams().getAway().getName();
                       String localTeamLogo = game.getTeams().getHome().getLogo();
                       String visitorTeamLogo =game.getTeams().getAway().getLogo();
                       String leagueName = game.getLeague().getName();
                       String leagueLogo = game.getLeague().getLogo();
                       String score = "-  :  -";
                       if(game.getScores().getHome().getTotal()!=null && game.getScores().getAway().getTotal()!=null) {
                           score = game.getScores().getHome().getTotal() + " : " + game.getScores().getAway().getTotal();
                       }
                       String startTime = game.getTime();
                       String prediction = "";
                       CustomMatch match = new CustomMatch(id,localTeamName,visitorTeamName,localTeamLogo,visitorTeamLogo,leagueName,leagueLogo,score,startTime,prediction);
                       list.add(match);

                   }
                    _basketballMatches.postValue(list);
                    _isFetchingData.postValue(false);

                } else {
                    if (!call.isCanceled()) {
                        _isFetchingData.setValue(false);
                        Util.companion.requestError.setValue(1);
                        Log.e("", response.errorBody().toString());
                    }
                }
            }

            @Override
            public void onFailure(Call<BasketBallApiResponse> call, Throwable t) {
            basketBallRequest = null;
                _isFetchingData.setValue(false);

                if (!call.isCanceled()) {
                    Util.companion.requestError.setValue(1);
                    t.printStackTrace();
                }
            }
        });
    }

    public void baseball(String date){
        List<CustomMatch> list = new ArrayList<>();
        _isFetchingData.setValue(true);
        if (baseballRequest != null) {
            baseballRequest.cancel();
            baseballRequest = null;
        }

        Call<BaseBallApiResponse> callback = baseBallRetrofitInstance.api.baseballGames(date);
        baseballRequest = callback;
        callback.enqueue(new Callback<BaseBallApiResponse>() {
            @Override
            public void onResponse(Call<BaseBallApiResponse> call, Response<BaseBallApiResponse> response) {
                baseballRequest = null;

                if (response.isSuccessful()) {
                    List<BaseBallApiResponse.BaseBallGame> matchList = response.body().getResponse();
                    matchList = matchList.stream().filter(item -> (
                                    (item.getTeams().getHome().getName() !=null &&
                                            item.getTeams().getAway().getName() !=null &&
                                            item.getTeams().getHome().getLogo() !=null &&
                                            item.getTeams().getAway().getLogo() !=null &&
                                            item.getLeague().getName() !=null &&
                                            item.getLeague().getLogo() !=null &&
                                            item.getTime() !=null
                                    )
                            )
                    ).collect(Collectors.toList());


                    Collections.sort(matchList, new Comparator<BaseBallApiResponse.BaseBallGame>() {
                        @Override
                        public int compare(BaseBallApiResponse.BaseBallGame match1, BaseBallApiResponse.BaseBallGame match2) {
                            return match1.getLeague().getName().compareTo(match2.getLeague().getName());
                        }
                    });

                    for(BaseBallApiResponse.BaseBallGame game: matchList){
                        int id =game.getId();
                        String localTeamName = game.getTeams().getHome().getName();
                        String visitorTeamName =game.getTeams().getAway().getName();
                        String localTeamLogo = game.getTeams().getHome().getLogo();
                        String visitorTeamLogo =game.getTeams().getAway().getLogo();
                        String leagueName = game.getLeague().getName();
                        String leagueLogo = game.getLeague().getLogo();
                        String score = "-  :  -";
                        if(game.getScores().getHome().getTotal()!=null && game.getScores().getAway().getTotal()!=null) {
                            score = game.getScores().getHome().getTotal() + " : " + game.getScores().getAway().getTotal();
                        }
                        String startTime = game.getTime();
                        String prediction = "";
                        CustomMatch match = new CustomMatch(id,localTeamName,visitorTeamName,localTeamLogo,visitorTeamLogo,leagueName,leagueLogo,score,startTime,prediction);
                        list.add(match);

                    }
                    _baseballMatches.postValue(list);
                    _isFetchingData.postValue(false);

                } else {
                    if (!call.isCanceled()) {
                        _isFetchingData.setValue(false);
                        Util.companion.requestError.setValue(1);
                        Log.e("", response.errorBody().toString());
                    }
                }
            }

            @Override
            public void onFailure(Call<BaseBallApiResponse> call, Throwable t) {
                baseballRequest = null;
                _isFetchingData.setValue(false);

                if (!call.isCanceled()) {
                    Util.companion.requestError.setValue(1);
                    t.printStackTrace();
                }
            }
        });
    }

    public void hockey(String date){
        List<CustomMatch> list = new ArrayList<>();
        _isFetchingData.setValue(true);
        if (hockeyRequest != null) {
            hockeyRequest.cancel();
            hockeyRequest = null;
        }

        Call<HockeyApiResponse> callback = hockeyRetrofitInstance.api.hockeyGames(date);
        hockeyRequest = callback;
        callback.enqueue(new Callback<HockeyApiResponse>() {
            @Override
            public void onResponse(Call<HockeyApiResponse> call, Response<HockeyApiResponse> response) {
                hockeyRequest = null;

                if (response.isSuccessful()) {
                    List<HockeyApiResponse.HockeyGame> matchList = response.body().getResponse();
                    matchList = matchList.stream().filter(item -> (
                                    (item.getTeams().getHome().getName() !=null &&
                                            item.getTeams().getAway().getName() !=null &&
                                            item.getTeams().getHome().getLogo() !=null &&
                                            item.getTeams().getAway().getLogo() !=null &&
                                            item.getLeague().getName() !=null &&
                                            item.getLeague().getLogo() !=null &&
                                            item.getTime() !=null
                                    )
                            )
                    ).collect(Collectors.toList());


                    Collections.sort(matchList, new Comparator<HockeyApiResponse.HockeyGame>() {
                        @Override
                        public int compare(HockeyApiResponse.HockeyGame match1, HockeyApiResponse.HockeyGame match2) {
                            return match1.getLeague().getName().compareTo(match2.getLeague().getName());
                        }
                    });

                    for(HockeyApiResponse.HockeyGame game: matchList){
                        int id =game.getId();
                        String localTeamName = game.getTeams().getHome().getName();
                        String visitorTeamName =game.getTeams().getAway().getName();
                        String localTeamLogo = game.getTeams().getHome().getLogo();
                        String visitorTeamLogo =game.getTeams().getAway().getLogo();
                        String leagueName = game.getLeague().getName();
                        String leagueLogo = game.getLeague().getLogo();
                        String score = "-  :  -";
                        if(game.getScores().getHome()!=null && game.getScores().getAway()!=null) {
                            score = game.getScores().getHome() + " : " + game.getScores().getAway();
                        }
                        String startTime = game.getTime();
                        String prediction = "";
                        CustomMatch match = new CustomMatch(id,localTeamName,visitorTeamName,localTeamLogo,visitorTeamLogo,leagueName,leagueLogo,score,startTime,prediction);
                        list.add(match);

                    }
                    _hockeyMatches.postValue(list);
                    _isFetchingData.postValue(false);


                } else {
                    if (!call.isCanceled()) {
                        _isFetchingData.setValue(false);
                        Util.companion.requestError.setValue(1);
                        Log.e("", response.errorBody().toString());
                    }
                }
            }

            @Override
            public void onFailure(Call<HockeyApiResponse> call, Throwable t) {
                hockeyRequest = null;
                _isFetchingData.setValue(false);

                if (!call.isCanceled()) {
                    Util.companion.requestError.setValue(1);
                    t.printStackTrace();
                }
            }
        });
    }

    public void rugby(String date){
        List<CustomMatch> list = new ArrayList<>();
        _isFetchingData.setValue(true);
        if (rugbyRequest != null) {
            rugbyRequest.cancel();
            rugbyRequest = null;
        }

        Call<RugbyApiResponse> callback = rugbyRetrofitInstance.api.rugbyGames(date);
        rugbyRequest = callback;
        callback.enqueue(new Callback<RugbyApiResponse>() {
            @Override
            public void onResponse(Call<RugbyApiResponse> call, Response<RugbyApiResponse> response) {
                hockeyRequest = null;

                if (response.isSuccessful()) {
                    List<RugbyApiResponse.RugbyGame> matchList = response.body().getResponse();
                    matchList = matchList.stream().filter(item -> (
                                    (item.getTeams().getHome().getName() !=null &&
                                            item.getTeams().getAway().getName() !=null &&
                                            item.getTeams().getHome().getLogo() !=null &&
                                            item.getTeams().getAway().getLogo() !=null &&
                                            item.getLeague().getName() !=null &&
                                            item.getLeague().getLogo() !=null &&
                                            item.getTime() !=null
                                    )
                            )
                    ).collect(Collectors.toList());


                    Collections.sort(matchList, new Comparator<RugbyApiResponse.RugbyGame>() {
                        @Override
                        public int compare(RugbyApiResponse.RugbyGame match1, RugbyApiResponse.RugbyGame match2) {
                            return match1.getLeague().getName().compareTo(match2.getLeague().getName());
                        }
                    });

                    for(RugbyApiResponse.RugbyGame game: matchList){
                        int id =game.getId();
                        String localTeamName = game.getTeams().getHome().getName();
                        String visitorTeamName =game.getTeams().getAway().getName();
                        String localTeamLogo = game.getTeams().getHome().getLogo();
                        String visitorTeamLogo =game.getTeams().getAway().getLogo();
                        String leagueName = game.getLeague().getName();
                        String leagueLogo = game.getLeague().getLogo();
                        String score = "-  :  -";
                        if(game.getScores().getHome()!=null && game.getScores().getAway()!=null) {
                            score = game.getScores().getHome() + " : " + game.getScores().getAway();
                        }
                        String startTime = game.getTime();
                        String prediction = "";
                        CustomMatch match = new CustomMatch(id,localTeamName,visitorTeamName,localTeamLogo,visitorTeamLogo,leagueName,leagueLogo,score,startTime,prediction);
                        list.add(match);

                    }
                    _rugbyMatches.postValue(list);
                    _isFetchingData.postValue(false);


                } else {
                    if (!call.isCanceled()) {
                        _isFetchingData.setValue(false);
                        Util.companion.requestError.setValue(1);
                        Log.e("", response.errorBody().toString());
                    }
                }
            }

            @Override
            public void onFailure(Call<RugbyApiResponse> call, Throwable t) {
                rugbyRequest = null;
                _isFetchingData.setValue(false);

                if (!call.isCanceled()) {
                    Util.companion.requestError.setValue(1);
                    t.printStackTrace();
                }
            }
        });
    }

    public void handBall(String date){
        List<CustomMatch> list = new ArrayList<>();
        _isFetchingData.setValue(true);
        if (handBallRequest != null) {
            handBallRequest.cancel();
            handBallRequest = null;
        }

        Call<HandballApiResponse> callback = handBallRetrofitInstance.api.handBallGames(date);
        handBallRequest = callback;
        callback.enqueue(new Callback<HandballApiResponse>() {
            @Override
            public void onResponse(Call<HandballApiResponse> call, Response<HandballApiResponse> response) {
                hockeyRequest = null;

                if (response.isSuccessful()) {
                    List<HandballApiResponse.HandBallGame> matchList = response.body().getResponse();
                    matchList = matchList.stream().filter(item -> (
                                    (item.getTeams().getHome().getName() !=null &&
                                            item.getTeams().getAway().getName() !=null &&
                                            item.getTeams().getHome().getLogo() !=null &&
                                            item.getTeams().getAway().getLogo() !=null &&
                                            item.getLeague().getName() !=null &&
                                            item.getLeague().getLogo() !=null &&
                                            item.getTime() !=null
                                    )
                            )
                    ).collect(Collectors.toList());


                    Collections.sort(matchList, new Comparator<HandballApiResponse.HandBallGame>() {
                        @Override
                        public int compare(HandballApiResponse.HandBallGame match1, HandballApiResponse.HandBallGame match2) {
                            return match1.getLeague().getName().compareTo(match2.getLeague().getName());
                        }
                    });

                    for(HandballApiResponse.HandBallGame game: matchList){
                        int id =game.getId();
                        String localTeamName = game.getTeams().getHome().getName();
                        String visitorTeamName =game.getTeams().getAway().getName();
                        String localTeamLogo = game.getTeams().getHome().getLogo();
                        String visitorTeamLogo =game.getTeams().getAway().getLogo();
                        String leagueName = game.getLeague().getName();
                        String leagueLogo = game.getLeague().getLogo();
                        String score = "-  :  -";
                        if(game.getScores().getHome()!=null && game.getScores().getAway()!=null) {
                            score = game.getScores().getHome() + " : " + game.getScores().getAway();
                        }
                        String startTime = game.getTime();
                        String prediction = "";
                        CustomMatch match = new CustomMatch(id,localTeamName,visitorTeamName,localTeamLogo,visitorTeamLogo,leagueName,leagueLogo,score,startTime,prediction);
                        list.add(match);

                    }

                    _handBallMatches.postValue(list);
                    _isFetchingData.postValue(false);

                } else {
                    if (!call.isCanceled()) {
                        _isFetchingData.setValue(false);
                        Util.companion.requestError.setValue(1);
                        Log.e("", response.errorBody().toString());
                    }
                }
            }

            @Override
            public void onFailure(Call<HandballApiResponse> call, Throwable t) {
                handBallRequest = null;
                _isFetchingData.setValue(false);

                if (!call.isCanceled()) {
                    Util.companion.requestError.setValue(1);
                    t.printStackTrace();
                }
            }
        });
    }

    public void volleyBall(String date){

        List<CustomMatch> list = new ArrayList<>();
        _isFetchingData.setValue(true);
        if (volleyBallRequest != null) {
            volleyBallRequest.cancel();
            volleyBallRequest = null;
        }

        Call<VolleyBallApiResponse> callback = volleyBallRetrofitInstance.api.volleyBallGames(date);
        volleyBallRequest = callback;
        callback.enqueue(new Callback<VolleyBallApiResponse>() {
            @Override
            public void onResponse(Call<VolleyBallApiResponse> call, Response<VolleyBallApiResponse> response) {
                hockeyRequest = null;

                if (response.isSuccessful()) {
                    List<VolleyBallApiResponse.VolleyBallGame> matchList = response.body().getResponse();
                    matchList = matchList.stream().filter(item -> (
                                    (item.getTeams().getHome().getName() !=null &&
                                            item.getTeams().getAway().getName() !=null &&
                                            item.getTeams().getHome().getLogo() !=null &&
                                            item.getTeams().getAway().getLogo() !=null &&
                                            item.getLeague().getName() !=null &&
                                            item.getLeague().getLogo() !=null &&
                                            item.getTime() !=null
                                    )
                            )
                    ).collect(Collectors.toList());


                    Collections.sort(matchList, new Comparator<VolleyBallApiResponse.VolleyBallGame>() {
                        @Override
                        public int compare(VolleyBallApiResponse.VolleyBallGame match1, VolleyBallApiResponse.VolleyBallGame match2) {
                            return match1.getLeague().getName().compareTo(match2.getLeague().getName());
                        }
                    });

                    for(VolleyBallApiResponse.VolleyBallGame game: matchList){
                        int id =game.getId();
                        String localTeamName = game.getTeams().getHome().getName();
                        String visitorTeamName =game.getTeams().getAway().getName();
                        String localTeamLogo = game.getTeams().getHome().getLogo();
                        String visitorTeamLogo =game.getTeams().getAway().getLogo();
                        String leagueName = game.getLeague().getName();
                        String leagueLogo = game.getLeague().getLogo();
                        String score = "-  :  -";
                        if(game.getScores().getHome()!=null && game.getScores().getAway()!=null) {
                            score = game.getScores().getHome() + " : " + game.getScores().getAway();
                        }
                        String startTime = game.getTime();
                        String prediction = "";
                        CustomMatch match = new CustomMatch(id,localTeamName,visitorTeamName,localTeamLogo,visitorTeamLogo,leagueName,leagueLogo,score,startTime,prediction);
                        list.add(match);

                    }
                    _volleyBallMatches.postValue(list);
                    _isFetchingData.postValue(false);


                } else {
                    if (!call.isCanceled()) {
                        _isFetchingData.setValue(false);
                        Util.companion.requestError.setValue(1);
                        Log.e("", response.errorBody().toString());
                    }
                }
            }

            @Override
            public void onFailure(Call<VolleyBallApiResponse> call, Throwable t) {
                volleyBallRequest = null;
                _isFetchingData.setValue(false);

                if (!call.isCanceled()) {
                    Util.companion.requestError.setValue(1);
                    t.printStackTrace();
                }
            }
        });
    }

    public void nfl(String date){

        List<CustomMatch> list = new ArrayList<>();
        _isFetchingData.setValue(true);
        if (nflRequest != null) {
            nflRequest.cancel();
            nflRequest = null;
        }

        Call<NFLapiResponse> callback = nflRetrofitInstance.api.NFLgames(date);
        nflRequest = callback;
        callback.enqueue(new Callback<NFLapiResponse>() {
            @Override
            public void onResponse(Call<NFLapiResponse> call, Response<NFLapiResponse> response) {
                hockeyRequest = null;

                if (response.isSuccessful()) {
                    List<NFLapiResponse.NFLGame> matchList = response.body().getResponse();
                    matchList = matchList.stream().filter(item -> (
                                    (item.getTeams().getHome().getName() !=null &&
                                            item.getTeams().getAway().getName() !=null &&
                                            item.getTeams().getHome().getLogo() !=null &&
                                            item.getTeams().getAway().getLogo() !=null &&
                                            item.getLeague().getName() !=null &&
                                            item.getLeague().getLogo() !=null &&
                                            item.getGame().getDate().getTime() !=null &&
                                            item.getGame().getDate().getDate() !=null
                                    )
                            )
                    ).collect(Collectors.toList());


                    Collections.sort(matchList, new Comparator<NFLapiResponse.NFLGame>() {
                        @Override
                        public int compare(NFLapiResponse.NFLGame match1, NFLapiResponse.NFLGame match2) {
                            return match1.getLeague().getName().compareTo(match2.getLeague().getName());
                        }
                    });

                    for(NFLapiResponse.NFLGame game: matchList){
                        int id =game.getGame().getId();
                        String localTeamName = game.getTeams().getHome().getName();
                        String visitorTeamName =game.getTeams().getAway().getName();
                        String localTeamLogo = game.getTeams().getHome().getLogo();
                        String visitorTeamLogo =game.getTeams().getAway().getLogo();
                        String leagueName = game.getLeague().getName();
                        String leagueLogo = game.getLeague().getLogo();
                        String score = "-  :  -";
                        if(game.getScores().getHome().getTotal()!=null && game.getScores().getAway().getTotal()!=null) {
                            score = game.getScores().getHome().getTotal() + " : " + game.getScores().getAway().getTotal();
                        }
                        String startTime = game.getGame().getDate().getDate() + " "+ game.getGame().getDate().getTime();
                        String prediction = "";
                        CustomMatch match = new CustomMatch(id,localTeamName,visitorTeamName,localTeamLogo,visitorTeamLogo,leagueName,leagueLogo,score,startTime,prediction);
                        list.add(match);

                    }
                    _nflMatches.postValue(list);
                    _isFetchingData.postValue(false);

                } else {
                    if (!call.isCanceled()) {
                        _isFetchingData.setValue(false);
                        Util.companion.requestError.setValue(1);
                        Log.e("", response.errorBody().toString());
                    }
                }
            }

            @Override
            public void onFailure(Call<NFLapiResponse> call, Throwable t) {
                nflRequest = null;
                _isFetchingData.setValue(false);

                if (!call.isCanceled()) {
                    Util.companion.requestError.setValue(1);
                    t.printStackTrace();
                }
            }
        });
    }
    public void soccer(String date,String api){
        List<CustomMatch> list = new ArrayList<>();
        _isFetchingData.setValue(true);
        if (soccerRequest != null) {
            soccerRequest.cancel();
            soccerRequest = null;
        }

        Call<SoccerApiResponse> callback = soccerRetrofitInstance.api.soccerGames(date,api);
        soccerRequest = callback;
        callback.enqueue(new Callback<SoccerApiResponse>() {
            @Override
            public void onResponse(Call<SoccerApiResponse> call, Response<SoccerApiResponse> response) {
                soccerRequest = null;

                if (response.isSuccessful()) {
                    List<SoccerApiResponse.SoccerGame> matchList = response.body().getData();
                    matchList = matchList.stream().filter(item -> (
                                    (item.getLocalTeam().getData().getName() !=null &&
                                            item.getVisitorTeam().getData().getName() !=null &&
                                            item.getLocalTeam().getData().getLogo_path() !=null &&
                                            item.getVisitorTeam().getData().getLogo_path() !=null &&
                                            item.getLeague().getData().getName() !=null &&
                                            item.getLeague().getData().getLogo_path() !=null &&
                                            item.getTime().getStarting_at().getDate_time() !=null
                                    )
                            )
                    ).collect(Collectors.toList());


                    Collections.sort(matchList, new Comparator<SoccerApiResponse.SoccerGame>() {
                        @Override
                        public int compare(SoccerApiResponse.SoccerGame match1, SoccerApiResponse.SoccerGame match2) {
                            return match1.getLeague().getData().getName().compareTo(match2.getLeague().getData().getName());
                        }
                    });

                    for(SoccerApiResponse.SoccerGame game: matchList){
                        int id =game.getId();
                        String localTeamName = game.getLocalTeam().getData().getName();
                        String visitorTeamName =game.getVisitorTeam().getData().getName();
                        String localTeamLogo = game.getLocalTeam().getData().getLogo_path();
                        String visitorTeamLogo =game.getVisitorTeam().getData().getLogo_path();
                        String leagueName = game.getLeague().getData().getName();
                        String leagueLogo = game.getLeague().getData().getLogo_path();
                        String score = "-  :  -";
                        if(game.getScores().getFt_score()!=null) {
                            score = game.getScores().getFt_score();
                        }
                        String startTime = game.getTime().getStarting_at().getDate_time();
                        String prediction = "";
                        CustomMatch match = new CustomMatch(id,localTeamName,visitorTeamName,localTeamLogo,visitorTeamLogo,leagueName,leagueLogo,score,startTime,prediction);
                        list.add(match);
                    }
                    _soccerMatches.postValue(list);
                    _isFetchingData.postValue(false);


                } else {
                    if (!call.isCanceled()) {
                        _isFetchingData.setValue(false);
                        Util.companion.requestError.setValue(1);
                        Log.e("", response.errorBody().toString());
                    }
                }
            }

            @Override
            public void onFailure(Call<SoccerApiResponse> call, Throwable t) {
                soccerRequest = null;
                _isFetchingData.setValue(false);

                if (!call.isCanceled()) {
                    Util.companion.requestError.setValue(1);
                    t.printStackTrace();
                }
            }
        });
    }

    public void soccerPredictions(String api){
        List<CustomMatch> list = new ArrayList<>();
        _isFetchingData.setValue(true);
        if (predictionsRequest != null) {
            predictionsRequest.cancel();
            predictionsRequest = null;
        }

        Call<PredictionsResponse> callback = predictionsRetrofitInstance.api.getPredictions(api);
        predictionsRequest = callback;
        callback.enqueue(new Callback<PredictionsResponse>() {
            @Override
            public void onResponse(Call<PredictionsResponse> call, Response<PredictionsResponse> response) {
                predictionsRequest = null;

                if (response.isSuccessful()) {
                    List<PredictionsResponse.Match> matchList = response.body().getTodayMatches();
                    matchList = matchList.stream().filter(item -> (
                                    (item.getHome_team() !=null &&
                                            item.getAway_team() !=null &&
                                            item.getHome_team_logo() !=null &&
                                            item.getAway_team_logo() !=null &&
                                            item.getLeague_name() !=null &&
                                            item.getLeague_logo() !=null &&
                                            item.getAdvice() !=null
                                    )
                            )
                    ).collect(Collectors.toList());


                    Collections.sort(matchList, new Comparator<PredictionsResponse.Match>() {
                        @Override
                        public int compare(PredictionsResponse.Match match1, PredictionsResponse.Match match2) {
                            return match1.getLeague_name().compareTo(match2.getLeague_name());
                        }
                    });

                    for(PredictionsResponse.Match game: matchList){
                        int id = matchList.indexOf(game);
                        String localTeamName = game.getHome_team();
                        String visitorTeamName =game.getAway_team();
                        String localTeamLogo = game.getHome_team_logo();
                        String visitorTeamLogo =game.getAway_team_logo();
                        String leagueName = game.getLeague_name();
                        String leagueLogo = game.getLeague_logo();
                        String score = "Prediction : ";
                        String startTime = "";
                        String prediction = game.getAdvice();
                        CustomMatch match = new CustomMatch(id,localTeamName,visitorTeamName,localTeamLogo,visitorTeamLogo,leagueName,leagueLogo,score,startTime,prediction);
                        list.add(match);
                    }
                    _soccerMatches.postValue(list);
                    _isFetchingData.postValue(false);


                } else {
                    if (!call.isCanceled()) {
                        _isFetchingData.setValue(false);
                        Util.companion.requestError.setValue(1);
                        Log.e("", response.errorBody().toString());
                    }
                }
            }

            @Override
            public void onFailure(Call<PredictionsResponse> call, Throwable t) {
                predictionsRequest = null;
                _isFetchingData.setValue(false);

                if (!call.isCanceled()) {
                    Util.companion.requestError.setValue(1);
                    t.printStackTrace();
                }
            }
        });
    }
}

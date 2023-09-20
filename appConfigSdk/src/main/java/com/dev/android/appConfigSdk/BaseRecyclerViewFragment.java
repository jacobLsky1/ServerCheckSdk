package com.dev.android.appConfigSdk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dev.android.appConfigSdk.data.CustomMatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BaseRecyclerViewFragment extends Fragment {

    private AppConfigViewModel viewModel;
    private ProgressBar pb;
    private TextView noMatchesTV;
    private RecyclerView recyclerView;
    private GameItemsAdapter adapter;
    private String sport;
    private Integer style;
    String formattedDate = "";

    private String viewModelDate;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewModel = new ViewModelProvider(requireActivity()).get(AppConfigViewModel.class);
        return inflater.inflate(R.layout.fragment_base_rv, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sport = getArguments().getString("sport");
        style = getArguments().getInt("style");
        // Initialize the RecyclerView
        recyclerView = view.findViewById(R.id.app_config_base_rv);
        recyclerView.setNestedScrollingEnabled(false);
        pb = view.findViewById(R.id.app_config_progressBar);
        noMatchesTV = view.findViewById(R.id.app_config_noMatchesTV);


        setUpObservers();

    }

    private void getDataForSport(String date) {

        if(Objects.equals(sport, "soccer")) {
            viewModel.soccer(date,Util.companion.soccerKey);
        }
        if(Objects.equals(sport, "soccer_predictions")) {
            viewModel.soccerPredictions(Util.companion.predictionsKey);
        }
        if(Objects.equals(sport, "basketball")) {
            viewModel.basketBall(date);
        }
        if(Objects.equals(sport, "baseball")) {
            viewModel.baseball(date);
        }
        if(Objects.equals(sport, "hockey")) {
            viewModel.hockey(date);
        }
        if(Objects.equals(sport, "rugby")) {
            viewModel.rugby(date);
        }
        if(Objects.equals(sport, "nfl")) {
            viewModel.nfl(date);
        }
        if(Objects.equals(sport, "volleyball")) {
            viewModel.volleyBall(date);
        }
        if(Objects.equals(sport, "handball")) {
            viewModel.handBall(date);
        }
    }

    private void setUpObservers() {



        viewModel.getIsFetchingData().observe(getViewLifecycleOwner(), isFetching -> {
            if(isFetching){
                pb.setVisibility(View.VISIBLE);
            }else{
                pb.setVisibility(View.GONE);
            }

        });

        viewModel.getSelectedDate().observe(getViewLifecycleOwner(), selectedDate -> {

            if(selectedDate!=""){
                viewModelDate=selectedDate;
                getDataForSport(selectedDate);
            }
        });

        viewModel.getQuerySearch().observe(getViewLifecycleOwner(), query -> {
            List<CustomMatch> list = new ArrayList<>();
                if(Objects.equals(sport, "soccer") && viewModel._soccerMatches.getValue() != null) {
                    if(!Objects.equals(query, "")) {
                        list = viewModel._soccerMatches.getValue();
                        filterRVByQuery(list, query);
                    }else{
                        returnToOrgnlList(viewModel._soccerMatches.getValue());
                    }
                }

            if(Objects.equals(sport, "soccer_predictions") && viewModel._soccerPredictionsMatches.getValue() != null) {
                if(!Objects.equals(query, "")) {
                    list = viewModel._soccerPredictionsMatches.getValue();
                    filterRVByQuery(list, query);
                }else{
                    returnToOrgnlList(viewModel._soccerPredictionsMatches.getValue());
                }
            }

                if(Objects.equals(sport, "basketball") && viewModel._basketballMatches.getValue() != null) {
                    if(!Objects.equals(query, "")) {
                        list = viewModel._basketballMatches.getValue();
                        filterRVByQuery(list, query);
                    }else{
                        returnToOrgnlList(viewModel._basketballMatches.getValue());
                    }
                }
                if(Objects.equals(sport, "baseball") && viewModel._baseballMatches.getValue() != null) {
                    if(!Objects.equals(query, "")) {
                        list = viewModel._baseballMatches.getValue();
                        filterRVByQuery(list, query);
                    }else{
                        returnToOrgnlList(viewModel._baseballMatches.getValue());
                    }
                }
                if(Objects.equals(sport, "hockey") && viewModel._hockeyMatches.getValue() != null) {
                    if(!Objects.equals(query, "")) {
                        list = viewModel._hockeyMatches.getValue();
                        filterRVByQuery(list, query);
                    }else{
                        returnToOrgnlList(viewModel._hockeyMatches.getValue());
                    }
                }
                if(Objects.equals(sport, "nfl") && viewModel._nflMatches.getValue() != null) {
                    if(!Objects.equals(query, "")) {
                        list = viewModel._nflMatches.getValue();
                        filterRVByQuery(list, query);
                    }else{
                        returnToOrgnlList(viewModel._nflMatches.getValue());
                    }
                }
                if(Objects.equals(sport, "rugby") && viewModel._rugbyMatches.getValue() != null) {
                    if(!Objects.equals(query, "")) {
                        list = viewModel._rugbyMatches.getValue();
                        filterRVByQuery(list, query);
                    }else{
                        returnToOrgnlList(viewModel._rugbyMatches.getValue());
                    }
                }
                if(Objects.equals(sport, "volleyball") && viewModel._volleyBallMatches.getValue() != null) {
                    if(!Objects.equals(query, "")) {
                        list = viewModel._volleyBallMatches.getValue();
                        filterRVByQuery(list, query);
                    }else{
                        returnToOrgnlList(viewModel._volleyBallMatches.getValue());
                    }
                }
                if(Objects.equals(sport, "handball") && viewModel._handBallMatches.getValue() != null) {
                    if(!Objects.equals(query, "")) {
                        list = viewModel._handBallMatches.getValue();
                        filterRVByQuery(list, query);
                    }else{
                        returnToOrgnlList(viewModel._handBallMatches.getValue());
                    }
                }
            });

        if(Objects.equals(sport, "soccer")) {
            viewModel.getSoccerMatches().observe(getViewLifecycleOwner(), newMatches -> {
                recyclerView.setAdapter(null);
                if (newMatches.isEmpty()) {
                    noMatchesTV.setVisibility(View.VISIBLE);
                    noMatchesTV.setText("No Soccer Matches for: "+ viewModelDate);
                } else {
                    noMatchesTV.setVisibility(View.GONE);
                    adapter = new GameItemsAdapter(newMatches,style,requireContext());
                    recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
                    recyclerView.setAdapter(adapter);
                }
            });
        }
        if(Objects.equals(sport, "soccer_predictions")) {
            viewModel.getSoccerMatches().observe(getViewLifecycleOwner(), newMatches -> {
                recyclerView.setAdapter(null);
                if (newMatches.isEmpty()) {
                    noMatchesTV.setVisibility(View.VISIBLE);
                    noMatchesTV.setText("No Soccer Predictions for: "+ viewModelDate);
                } else {
                    noMatchesTV.setVisibility(View.GONE);
                    adapter = new GameItemsAdapter(newMatches,style,requireContext());
                    recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
                    recyclerView.setAdapter(adapter);
                }
            });
        }
        if(Objects.equals(sport, "basketball")) {
            viewModel.getBasketBallMatches().observe(getViewLifecycleOwner(), newMatches -> {
                recyclerView.setAdapter(null);
                if (newMatches.isEmpty()) {
                    noMatchesTV.setVisibility(View.VISIBLE);
                    noMatchesTV.setText("No Basketball Matches for: "+ viewModelDate);
                } else {
                    noMatchesTV.setVisibility(View.GONE);
                    adapter = new GameItemsAdapter(newMatches,style,requireContext());
                    recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
                    recyclerView.setAdapter(adapter);
                }
            });
        }
        if(Objects.equals(sport, "baseball")) {
            viewModel.getBaseBallMatches().observe(getViewLifecycleOwner(), newMatches -> {
                recyclerView.setAdapter(null);
                if (newMatches.isEmpty()) {
                    noMatchesTV.setVisibility(View.VISIBLE);
                    noMatchesTV.setText("No Baseball Matches for: "+ viewModelDate);
                } else {
                    noMatchesTV.setVisibility(View.GONE);
                    adapter = new GameItemsAdapter(newMatches,style,requireContext());
                    recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
                    recyclerView.setAdapter(adapter);
                }
            });
        }
        if(Objects.equals(sport, "hockey")) {
            viewModel.geHockeyMatches().observe(getViewLifecycleOwner(), newMatches -> {
                recyclerView.setAdapter(null);
                if (newMatches.isEmpty()) {
                    noMatchesTV.setVisibility(View.VISIBLE);
                    noMatchesTV.setText("No Hockey Matches for: "+ viewModelDate);
                } else {
                    noMatchesTV.setVisibility(View.GONE);
                    adapter = new GameItemsAdapter(newMatches,style,requireContext());
                    recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
                    recyclerView.setAdapter(adapter);
                }
            });
        }
        if(Objects.equals(sport, "nfl")) {
            viewModel.getNFLMatches().observe(getViewLifecycleOwner(), newMatches -> {
                recyclerView.setAdapter(null);
                if (newMatches.isEmpty()) {
                    noMatchesTV.setVisibility(View.VISIBLE);
                    noMatchesTV.setText("No NFL Matches for: "+ viewModelDate);
                } else {
                    noMatchesTV.setVisibility(View.GONE);
                    adapter = new GameItemsAdapter(newMatches,style,requireContext());
                    recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
                    recyclerView.setAdapter(adapter);
                }
            });
        }
        if(Objects.equals(sport, "rugby")) {
            viewModel.geRugbyMatches().observe(getViewLifecycleOwner(), newMatches -> {
                recyclerView.setAdapter(null);
                if (newMatches.isEmpty()) {
                    noMatchesTV.setVisibility(View.VISIBLE);
                    noMatchesTV.setText("No Rugby Matches for: "+ viewModelDate);
                } else {
                    noMatchesTV.setVisibility(View.GONE);
                    adapter = new GameItemsAdapter(newMatches,style,requireContext());
                    recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
                    recyclerView.setAdapter(adapter);
                }
            });
        }
        if(Objects.equals(sport, "volleyball")) {
            viewModel.getVolleyBallMatches().observe(getViewLifecycleOwner(), newMatches -> {
                recyclerView.setAdapter(null);
                if (newMatches.isEmpty()) {
                    noMatchesTV.setVisibility(View.VISIBLE);
                    noMatchesTV.setText("No Volleyball Matches for: "+ viewModelDate);
                } else {
                    noMatchesTV.setVisibility(View.GONE);
                    adapter = new GameItemsAdapter(newMatches,style,requireContext());
                    recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
                    recyclerView.setAdapter(adapter);
                }
            });
        }
        if(Objects.equals(sport, "handball")) {
            viewModel.getHandBallMatches().observe(getViewLifecycleOwner(), newMatches -> {
                recyclerView.setAdapter(null);
                if (newMatches.isEmpty()) {
                    noMatchesTV.setVisibility(View.VISIBLE);
                    noMatchesTV.setText("No Handball Matches for: "+ viewModelDate);
                } else {
                    noMatchesTV.setVisibility(View.GONE);
                    adapter = new GameItemsAdapter(newMatches,style,requireContext());
                    recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
                    recyclerView.setAdapter(adapter);
                }
            });
        }
    }

    private void returnToOrgnlList(List<CustomMatch> list) {
        adapter = new GameItemsAdapter(list,style,requireContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(adapter);
    }

    private void filterRVByQuery(List<CustomMatch> list,String query) {
        List<CustomMatch> matchList = list.stream().filter(item -> (
                        (item.getLeagueName().toLowerCase().contains(query.toLowerCase()) ||
                                item.getLocalTeamName().toLowerCase().contains(query.toLowerCase()) ||
                                item.getVisitorTeamName().toLowerCase().contains(query.toLowerCase())
                        )
                )
        ).collect(Collectors.toList());
        adapter = new GameItemsAdapter(matchList,style,requireContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(adapter);
    }

    public static BaseRecyclerViewFragment newInstance(String sport,Integer style) {
        BaseRecyclerViewFragment fragment = new BaseRecyclerViewFragment();
        Bundle args = new Bundle();
        args.putString("sport", sport);
        args.putInt("style", style);
        fragment.setArguments(args);
        return fragment;
    }

}


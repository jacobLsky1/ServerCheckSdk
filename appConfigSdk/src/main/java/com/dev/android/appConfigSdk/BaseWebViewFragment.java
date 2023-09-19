package com.dev.android.appConfigSdk;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class BaseWebViewFragment extends Fragment {

    private AppConfigViewModel viewModel;
    private WebView webView;
    private String url;

    public BaseWebViewFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewModel = new ViewModelProvider(requireActivity()).get(AppConfigViewModel.class);
        return inflater.inflate(R.layout.fragment_base_web_view, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        url = getArguments().getString("URL_KEY");
        // Initialize the WebView
        webView = view.findViewById(R.id.app_config_base_web_view);
        ProgressBar progressBar = view.findViewById(R.id.app_config_webViewProgressBar);
        webView.computeScroll();
        webView.getSettings().setSupportZoom(Util.companion.webViewHasZoom);
        webView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        webView.getSettings().setSupportZoom(Util.companion.webViewHasZoom);
        webView.getSettings().setSupportZoom(Util.companion.webViewHasZoom);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return true;
            }
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                // Show progress bar here
                viewModel.setWebView(webView);
                progressBar.setVisibility(View.VISIBLE);
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                // Hide progress bar here
                progressBar.setVisibility(View.GONE);
                super.onPageFinished(view, url);
            }
        });

        webView.loadUrl(url);
    }


    public static BaseWebViewFragment newInstance(String url) {
        BaseWebViewFragment fragment = new BaseWebViewFragment();
        Bundle args = new Bundle();
        args.putString("URL_KEY", url);
        fragment.setArguments(args);
        return fragment;
    }
}

package com.dev.android.appConfigSdk;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.webkit.CookieManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.dev.android.appConfigSdk.databinding.ActivityServerErrorBinding;

public class ServerErrorActivity extends AppCompatActivity {

    private ActivityServerErrorBinding binding;
    private WebView webView;
    CookieManager cookieManager = CookieManager.getInstance();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityServerErrorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        webView = binding.webview;

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setDomStorageEnabled(true);
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);

        webView.loadUrl(Util.companion.backUpSite);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                cookieManager.flush();
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                cookieManager.removeAllCookies(null);
                super.onPageFinished(view, url);

            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                // This method is called when there's an error loading a web page
            }
        });
    }

    public static String decodeBase64(String encodedString) {
        byte[] decodedBytes = Base64.decode(encodedString, Base64.DEFAULT);
        return new String(decodedBytes);
    }

    @Override
    public void onBackPressed() {
        if(Util.companion.hasExitDialog){
            new AlertDialog.Builder(this)
                    .setIcon(android.R.drawable.ic_dialog_alert) // Use built-in Android icon for alert dialog
                    .setTitle("Exit Application")
                    .setMessage(Util.companion.exitDialogMessage)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finishAffinity();  // This will close the app completely, including other activities in the task
                        }
                    })
                    .setNegativeButton("No", null)  // No action on clicking NO button, just close the dialog
                    .setNeutralButton("RATE", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            openAppInPlaystore(getApplicationContext());
                        }
                    })
                    .show();
        }else{
            super.onBackPressed();
        }
    }
    public void openAppInPlaystore(Context context) {
        String appPackageName = context.getPackageName();
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        } catch (android.content.ActivityNotFoundException anfe) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }
    }
}

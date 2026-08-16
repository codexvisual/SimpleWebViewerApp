package com.razormist.simplewebviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_search;
    private EditText et_url;
    private WebView wv_browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SearchSite();
    }

    public void SearchSite(){
        btn_search = (Button)findViewById(R.id.btn_search);
        et_url = (EditText)findViewById(R.id.et_url);
        wv_browser = (WebView)findViewById(R.id.wv_browser);

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www." + et_url.getText().toString();
                wv_browser.getSettings().setLoadsImagesAutomatically(true);
                wv_browser.getSettings().setJavaScriptEnabled(true);
                wv_browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv_browser.setWebViewClient(new WebViewClient());
                wv_browser.loadUrl(url);
            }
        });
    }
}

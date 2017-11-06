package com.arbree.tanvir.arbree;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by Tanvir on 7/23/2017.
 */
public class WebActivity extends Activity {

        private WebView webView;
        private Button btn_back;
        private String TAG = "WebActivity";

        @Override
        protected void onResume() {
            super.onResume();
            Log.d(TAG, "on resume arbree home");
            webView = (WebView) findViewById(R.id.webView);
            btn_back = (Button) findViewById(R.id.backToMain);

            webView.getSettings().setJavaScriptEnabled(true);
            // webView.loadUrl("http://10.0.2.2/AndroidWebVIEW/index.html");

            //webView.loadUrl("http://localhost:49696/Account/Login");

            Log.d(TAG, "on resume before loading url");

            webView.loadUrl("http://www.arbree.com/Team");

            Log.d(TAG, "Done loading webview content");
            //webView.loadUrl("http://www.aiub.edu");
            btn_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(WebActivity.this, LoginActivity.class);
                    //finish();
                    startActivity(intent);
                    finish();
                }
            });
        }

        @Override
        public void onBackPressed() {
            Log.d(TAG, "Moving to webview");
            Intent intent = new Intent(WebActivity.this, LoginActivity.class);
            //finish();
            startActivity(intent);
            finish();
        }

        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.webcontent);
            Log.d(TAG, "Moving to arbree home");
            //String customHtml = "<html><body><h2>Greetings from Aiub Android Class!</h2></body></html>";
            // webView.loadData(customHtml, "text/html", "UTF-8");


        }

}

package ahmed.javcoder.ebook.Fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import ahmed.javcoder.ebook.R;

public class Main2Activity extends AppCompatActivity {

    WebView AndroidWebView ;
    ProgressBar progressBar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        AndroidWebView = findViewById(R.id.AndroidWebView_ID) ;
        progressBar = findViewById(R.id.progressBarAndroid_ID) ;

        WebSettings webSettings = AndroidWebView.getSettings() ;
        webSettings.setJavaScriptEnabled(true);
        Intent intent = getIntent() ;
        int x = intent.getIntExtra("url1" , 0);
        if(x == 0)
        {
            AndroidWebView.loadUrl("https://www.tutorialspoint.com/android/");
        }else if(x == 1)
        {
            AndroidWebView.loadUrl("https://abhiandroid.com/");
        }else if(x == 2)
        {
            AndroidWebView.loadUrl("https://developer.android.com/guide");
        }else if(x == 3)
        {
            AndroidWebView.loadUrl("https://www.studytonight.com/android/introduction-to-android");
        }else if(x == 4)
        {
            AndroidWebView.loadUrl("https://www.w3adda.com/android-tutorial ");
        }

        AndroidWebView.setWebViewClient(new MyWebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(AndroidWebView.canGoBack())
        {
            AndroidWebView.goBack();
        }else
        {
            super.onBackPressed();
        }

    }

    public class MyWebViewClient extends WebViewClient
    {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            progressBar.setVisibility(View.GONE);
        }
    }
}

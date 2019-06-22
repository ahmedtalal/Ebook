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

public class Main3Activity extends AppCompatActivity {

    WebView webView ;
    ProgressBar progressBar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        webView =  findViewById(R.id.WebWebView_ID) ;
        progressBar =  findViewById(R.id.progressBarWEB_ID) ;

        WebSettings webSettings = webView.getSettings() ;
        webSettings.setJavaScriptEnabled(true);

        Intent intent = getIntent() ;
        int x = intent.getIntExtra("url2" , 0);

        if(x == 0)
        {
            webView.loadUrl("https://www.w3schools.com/");
        }else if(x == 1)
        {
            webView.loadUrl("https://www.tutorialspoint.com/web_developers_guide/index.htm");
        }else if(x == 2)
        {
            webView.loadUrl("https://www.sololearn.com/Course/HTML/");
        }else if(x == 3)
        {
            webView.loadUrl("https://www.tutorialrepublic.com/");
        }else if(x == 4)
        {
            webView.loadUrl("https://www.lynda.com/Web-training-tutorials/88-0.html");
        }else if(x == 5)
        {
            webView.loadUrl("https://developer.mozilla.org/en-US/");
        }else if(x == 6)
        {
            webView.loadUrl("https://www.sitesbay.com/");
        }else if(x == 7)
        {
            webView.loadUrl("https://www.afterhoursprogramming.com/");
        }

        webView.setWebViewClient(new MyWebViewClient());

    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack())
        {
            webView.goBack();
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

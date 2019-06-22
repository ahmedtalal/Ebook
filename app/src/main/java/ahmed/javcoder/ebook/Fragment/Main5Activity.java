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

public class Main5Activity extends AppCompatActivity {
    WebView AlgowebView ;
    ProgressBar progressBar ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        AlgowebView =  findViewById(R.id.AlgoWebView_ID) ;
        progressBar =  findViewById(R.id.progressBarAlgo_ID) ;
        WebSettings webSettings = AlgowebView.getSettings() ;
        webSettings.setJavaScriptEnabled(true);

        Intent intent = getIntent() ;
        int x = intent.getIntExtra("url4" , 0);

        if(x == 0)
        {
            AlgowebView.loadUrl("https://www.tutorialspoint.com/data_structures_algorithms/index.htm");
        }else if(x == 1)
        {
            AlgowebView.loadUrl("https://www.geeksforgeeks.org/data-structures/");
        }else if(x == 2)
        {
            AlgowebView.loadUrl("https://www.includehelp.com/data-structure-tutorial/");
        }else if(x == 3)
        {
            AlgowebView.loadUrl("https://www.studytonight.com/data-structures/");
        }else if(x == 4)
        {
            AlgowebView.loadUrl("https://www.w3schools.in/data-structures-tutorial/intro/");
        }else if(x == 5)
        {
            AlgowebView.loadUrl("https://www.javatpoint.com/data-structure-tutorial");
        }else if(x == 6)
        {
            AlgowebView.loadUrl("https://www.programiz.com/dsa/bubble-sort");
        }else if(x == 7)
        {
            AlgowebView.loadUrl("https://www.sitesbay.com/data-structure/index");
        }

        AlgowebView.setWebViewClient(new MyWebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(AlgowebView.canGoBack())
        {
            AlgowebView.goBack();
        }else
        {
            super.onBackPressed();
        }
    }

    public class  MyWebViewClient extends WebViewClient
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

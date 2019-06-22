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

public class Main4Activity extends AppCompatActivity {
    WebView IoswebView ;
    ProgressBar progressBar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        IoswebView =  findViewById(R.id.IosWebView_ID) ;
        progressBar =  findViewById(R.id.progressBarIOS_ID) ;
        WebSettings webSettings = IoswebView.getSettings() ;
        webSettings.setJavaScriptEnabled(true);

        Intent intent = getIntent() ;
        int x = intent.getIntExtra("url3" , 0);

        if(x == 0)
        {
            IoswebView.loadUrl("https://www.appcoda.com/ios-programming-course/");
        }else if(x == 1)
        {
            IoswebView.loadUrl("https://www.tutorialspoint.com/ios/index.htm");
        }else if(x == 2)
        {
            IoswebView.loadUrl("https://www.lynda.com/iOS-training-tutorials/413-0.html");
        }else if(x == 3)
        {
            IoswebView.loadUrl("https://codewithchris.com/learn-ios/");
        }

        IoswebView.setWebViewClient(new MyWebViewClient());
    }

    @Override
    public void onBackPressed() {

        if(IoswebView.canGoBack())
        {
            IoswebView.goBack();
        }else
        {
            super.onBackPressed();
        }

    }

    public class  MyWebViewClient extends  WebViewClient
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

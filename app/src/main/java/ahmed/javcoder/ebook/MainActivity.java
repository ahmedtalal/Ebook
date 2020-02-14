package ahmed.javcoder.ebook;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ahmed.javcoder.ebook.Adapters.AndroidPagerAdapter;
import ahmed.javcoder.ebook.Fragment.FragmentAlgo;
import ahmed.javcoder.ebook.Fragment.FragmentAndroid;
import ahmed.javcoder.ebook.Fragment.FragmentIos;
import ahmed.javcoder.ebook.Fragment.FragmentWeb;

public class MainActivity extends AppCompatActivity {


    TabLayout tabLayout ;
    ViewPager viewPager ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout  = findViewById(R.id.tabLayout_ID) ;
        viewPager =  findViewById(R.id.viewPager_ID) ;

        AndroidPagerAdapter android = new AndroidPagerAdapter(getSupportFragmentManager()) ;
        android.AddFragment(new FragmentAndroid() , "Android");
        android.AddFragment(new FragmentWeb() , "Web");
        android.AddFragment(new FragmentIos() , "Ios");
        android.AddFragment(new FragmentAlgo() , "Ds&Algo");
        viewPager.setAdapter(android);
        tabLayout.setupWithViewPager(viewPager);



    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBackPressed() {
        finish();
    }
}

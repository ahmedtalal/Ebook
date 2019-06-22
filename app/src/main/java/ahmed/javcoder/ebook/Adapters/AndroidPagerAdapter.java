package ahmed.javcoder.ebook.Adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class AndroidPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragmentList =  new ArrayList<>();
    private  ArrayList<String> fragmentListTitles =  new ArrayList<>() ;



    public AndroidPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentListTitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentListTitles.get(position) ;
    }

    public void AddFragment(Fragment fragment , String title)
    {
        fragmentList.add(fragment) ;
        fragmentListTitles.add(title) ;
    }

}

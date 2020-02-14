package ahmed.javcoder.ebook.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import ahmed.javcoder.ebook.Adapters.AndroidAdapter;
import ahmed.javcoder.ebook.R;

public class FragmentAndroid  extends Fragment{

    View view ;

    int[] Androidimages =
            {
                    R.drawable.tutorials_point,
                    R.drawable.ic_android1 ,
                    R.drawable.ic_android ,
                    R.drawable.studytonight ,
                    R.drawable.w3schools ,
                    R.drawable.journaldev ,
                    R.drawable.tutlane
            };
    String[] Androidtext =
            {
                    "TutorialPoint" ,
                    "AbhiAndroid" ,
                    "Android Developer" ,
                    "StudyTonight" ,
                    "W3schools" ,
                    "JournalDev" ,
                    "Tutlane"
            };


    GridView AndeoidGridview  ;
    public FragmentAndroid() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.android_fragment , container , false) ;
        AndeoidGridview = view.findViewById(R.id.AndroidGridview_ID) ;
        AndroidAdapter androidAdapter =  new AndroidAdapter(getContext() , Androidimages , Androidtext) ;
        AndeoidGridview.setAdapter(androidAdapter);

        AndeoidGridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =  new Intent(getContext() , Main2Activity.class) ;
                if(Androidtext[position] == "TutorialPoint")
                {

                    intent.putExtra("url1" , 0);
                    startActivity(intent);
                }else if(Androidtext[position] == "AbhiAndroid")
                {
                    intent.putExtra("url1" , 1);
                    startActivity(intent);
                }else if(Androidtext[position] == "Android Developer")
                {
                    intent.putExtra("url1" , 2) ;
                    startActivity(intent);
                }else if(Androidtext[position] == "StudyTonight")
                {
                    intent.putExtra("url1" , 3) ;
                    startActivity(intent);
                }else if(Androidtext[position] == "W3schools")
                {
                    intent.putExtra("url1" , 4) ;
                    startActivity(intent);
                }else if(Androidtext[position] == "JournalDev")
                {
                    intent.putExtra("url1" , 5) ;
                    startActivity(intent);
                }else if(Androidtext[position] == "Tutlane")
                {
                    intent.putExtra("url1" , 6) ;
                    startActivity(intent);
                }
            }
        });
        return  view ;
    }
}

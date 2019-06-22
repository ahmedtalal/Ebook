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

import ahmed.javcoder.ebook.Adapters.AlgoAdapter;
import ahmed.javcoder.ebook.R;

public class FragmentAlgo extends Fragment {

    View view ;

    int[] Algoimages =
            {
                    R.drawable.tutorials_point,
                    R.drawable.gekksforgeeks ,
                    R.drawable.include ,
                    R.drawable.studytonight ,
                    R.drawable.w3schools ,
                    R.drawable.javatpoint ,
                    R.drawable.programiz ,
                    R.drawable.sitesbay
            };
    String[] Algotext =
            {
                    "TutorialPoint" ,
                    "GeeksForGeek" ,
                    "IncludeHelp.com" ,
                    "StudyTonight" ,
                    "W3schools" ,
                    "JavaTpoint" ,
                    "Programiz" ,
                    "SitesBay"
            };


    GridView AlgoGridview  ;

    public FragmentAlgo()
    {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.algo_fragment , container , false) ;
        AlgoGridview = view.findViewById(R.id.AlgoGridview_ID) ;
        AlgoAdapter algoAdapter =  new AlgoAdapter(getContext() , Algoimages , Algotext) ;
        AlgoGridview.setAdapter(algoAdapter);

        AlgoGridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =  new Intent(getContext() , Main5Activity.class) ;

                if(Algotext[position] == "TutorialPoint")
                {

                    intent.putExtra("url4" , 0);
                    startActivity(intent);
                }else if(Algotext[position] == "GeeksForGeek")
                {
                    intent.putExtra("url4" , 1);
                    startActivity(intent);
                }else if(Algotext[position] == "IncludeHelp.com")
                {
                    intent.putExtra("url4" , 2);
                    startActivity(intent);
                }else if(Algotext[position] == "StudyTonight")
                {
                    intent.putExtra("url4" , 3);
                    startActivity(intent);
                }else if(Algotext[position] == "W3schools")
                {
                    intent.putExtra("url4" , 4);
                    startActivity(intent);
                }else if(Algotext[position] == "JavaTpoint")
                {
                    intent.putExtra("url4" , 5);
                    startActivity(intent);
                }else if(Algotext[position] == "Programiz")
                {
                    intent.putExtra("url4" , 6);
                    startActivity(intent);
                }else if(Algotext[position] == "SitesBay")
                {
                    intent.putExtra("url4" , 7);
                    startActivity(intent);
                }

            }
        });


        return view ;
    }
}

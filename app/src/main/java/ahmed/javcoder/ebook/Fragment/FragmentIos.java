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

import ahmed.javcoder.ebook.Adapters.IosAdapter;
import ahmed.javcoder.ebook.R;

public class FragmentIos extends Fragment {

    View view ;

    int[] Iosimages =
            {
                    R.drawable.appcoda,
                    R.drawable.tutorials_point ,
                    R.drawable.lynda ,
                    R.drawable.download
            };
    String[] Iostext =
            {
                    "Appcoda" ,
                    "TutorialPoint" ,
                    "Lynda.com" ,
                    "Codewithchris" ,
            };


    GridView IosGridView   ;
    public FragmentIos()
    {

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.ios_fragment , container , false) ;
        IosGridView = view.findViewById(R.id.IosGridview_ID) ;
        IosAdapter iosAdapter = new IosAdapter(getContext() , Iosimages , Iostext) ;
        IosGridView.setAdapter(iosAdapter);

        IosGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext() , Main4Activity.class) ;

                if(Iostext[position] == "Appcoda")
                {
                    intent.putExtra("url3" , 0);
                    startActivity(intent);
                }else if(Iostext[position] == "TutorialPoint")
                {
                    intent.putExtra("url3" , 1);
                    startActivity(intent);
                }else if(Iostext[position] == "Lynda.com")
                {
                    intent.putExtra("url3" , 2);
                    startActivity(intent);
                }else if(Iostext[position] == "Codewithchris")
                {
                    intent.putExtra("url3" , 3);
                    startActivity(intent);
                }
            }
        });
        return  view ;
    }
}

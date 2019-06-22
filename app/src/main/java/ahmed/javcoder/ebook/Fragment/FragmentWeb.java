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

import ahmed.javcoder.ebook.Adapters.WebAdapter;
import ahmed.javcoder.ebook.R;

public class FragmentWeb extends Fragment {

    View view ;

    int[] Webimages =
            {
                    R.drawable.w3schools,
                    R.drawable.tutorials_point ,
                    R.drawable.sololearn ,
                    R.drawable.web ,
                    R.drawable.lynda ,
                    R.drawable.signature ,
                    R.drawable.sitesbay ,
                    R.drawable.website
            };
    String[] Webtext =
            {
                    "W3schools" ,
                    "TutorialPoint" ,
                    "Sololearn" ,
                    "tutorial republic" ,
                    "Lynda.com" ,
                    "MDN Web" ,
                    "SitesBay" ,
                    "Web development"
            };


    GridView WebGridView  ;


    public FragmentWeb() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.web_fragment , container , false) ;
        WebGridView = view.findViewById(R.id.WebGridview_ID) ;
        WebAdapter webAdapter =  new WebAdapter(getContext() , Webimages , Webtext) ;
        WebGridView.setAdapter(webAdapter);

        WebGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =  new Intent(getContext() , Main3Activity.class) ;

                if(Webtext[position] == "W3schools")
                {
                    intent.putExtra("url2" , 0);
                    startActivity(intent);
                }else if(Webtext[position] == "TutorialPoint")
                {
                    intent.putExtra("url2" , 1);
                    startActivity(intent);
                }else if(Webtext[position] == "Sololearn")
                {
                    intent.putExtra("url2" , 2);
                    startActivity(intent);
                }else if(Webtext[position] == "tutorial republic")
                {
                    intent.putExtra("url2" , 3);
                    startActivity(intent);
                }else if(Webtext[position] == "Lynda.com")
                {
                    intent.putExtra("url2" , 4);
                    startActivity(intent);
                }else if(Webtext[position] == "MDN Web")
                {
                    intent.putExtra("url2" , 5);
                    startActivity(intent);
                }else if(Webtext[position] == "SitesBay")
                {
                    intent.putExtra("url2" , 6);
                    startActivity(intent);
                }else if(Webtext[position] == "Web development")
                {
                    intent.putExtra("url2" , 7);
                    startActivity(intent);
                }
            }
        });
        return view ;
    }
}

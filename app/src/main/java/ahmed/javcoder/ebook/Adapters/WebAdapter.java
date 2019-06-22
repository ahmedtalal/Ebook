package ahmed.javcoder.ebook.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import ahmed.javcoder.ebook.R;

public class WebAdapter extends BaseAdapter {

    private int[] webImages ;
    private String[] webText ;
    private Context context1  ;
    private LayoutInflater inflater ;

    public WebAdapter(Context getcontext , int[] image , String[] text)
    {
        this.context1 = getcontext ;
        this.webImages = image ;
        this.webText = text ;
        this.inflater = LayoutInflater.from(getcontext) ;
    }

    @Override
    public int getCount() {
        return webText.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView =  inflater.inflate(R.layout.web_view  , null) ;
        ImageView imageView = convertView.findViewById(R.id.WebImage_ID) ;
        TextView textView =  convertView.findViewById(R.id.WebTextview_ID) ;

        imageView.setImageResource(webImages[position]);
        textView.setText(webText[position]);
        return convertView;
    }
}

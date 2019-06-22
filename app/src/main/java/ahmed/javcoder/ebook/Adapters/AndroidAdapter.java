package ahmed.javcoder.ebook.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import ahmed.javcoder.ebook.R;

public class AndroidAdapter  extends BaseAdapter {

    int[] androidImages ;
    String[] androidText ;
    Context context ;
    LayoutInflater inflater ;

    public AndroidAdapter(Context getcontext ,int[] androidImages, String[] androidText)
    {
        this.androidImages = androidImages;
        this.androidText = androidText;
        this.context = getcontext;
        this.inflater = LayoutInflater.from(getcontext);
    }

    @Override
    public int getCount() {
        return androidText.length;
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
        convertView = inflater.inflate(R.layout.android_view , null) ;

        ImageView imageView =  convertView.findViewById(R.id.AndroidImage_ID) ;
        TextView textView = convertView.findViewById(R.id.AndroidTextview_ID) ;
        imageView.setImageResource(androidImages[position]);
        textView.setText(androidText[position]);

        return convertView;
    }
}

package ahmed.javcoder.ebook.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import ahmed.javcoder.ebook.R;

public class AlgoAdapter extends BaseAdapter {

    int[] algoImages ;
    String[] algoText ;
    Context context ;
    LayoutInflater inflater ;

    public AlgoAdapter(Context getcontext ,int[] algoImages, String[] algoText)
    {
        this.algoImages = algoImages;
        this.algoText = algoText;
        this.context = getcontext;
        this.inflater = LayoutInflater.from(getcontext);
    }

    @Override
    public int getCount() {
        return algoText.length;
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
        convertView = inflater.inflate(R.layout.algo_view , null) ;

        ImageView imageView =  convertView.findViewById(R.id.AlgoImage_ID) ;
        TextView textView = convertView.findViewById(R.id.AlgoTextview_ID) ;
        imageView.setImageResource(algoImages[position]);
        textView.setText(algoText[position]);

        return convertView;
    }
}

package ahmed.javcoder.ebook.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import ahmed.javcoder.ebook.R;

public class IosAdapter  extends BaseAdapter {

    private int[] IosImages ;
    private String[] IosTextes ;
    private Context context1 ;
    private LayoutInflater inflater ;

    public IosAdapter(Context getcontext , int[] image , String[] text)
    {
        this.context1 = getcontext ;
        this.IosImages = image ;
        this.IosTextes = text ;
        this.inflater = LayoutInflater.from(getcontext) ;
    }

    @Override
    public int getCount() {
        return IosTextes.length;
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
        convertView = inflater.inflate(R.layout.ios_view , null) ;

        ImageView imageView =  convertView.findViewById(R.id.IosImage_ID) ;
        TextView  textView =  convertView.findViewById(R.id.IosTextview_ID) ;

        imageView.setImageResource(IosImages[position]);
        textView.setText(IosTextes[position]);

        return convertView;
    }
}

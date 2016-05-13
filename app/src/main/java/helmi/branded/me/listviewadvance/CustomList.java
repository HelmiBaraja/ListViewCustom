package helmi.branded.me.listviewadvance;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HelmiHasan on 13/05/2016.
 */
public class CustomList extends ArrayAdapter<Celebrity> {
    private ArrayList<Celebrity>arrayList;

    private Activity context;


    public CustomList(Activity context, ArrayList<Celebrity> arrayList) {
        super(context, R.layout.list_layout, arrayList);

        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewDesc = (TextView) listViewItem.findViewById(R.id.textViewJob);
        ImageView image = (ImageView) listViewItem.findViewById(R.id.imageView);

        textViewName.setText(arrayList.get(position).getName());
        textViewDesc.setText(arrayList.get(position).getJob());
        image.setImageResource(arrayList.get(position).getImage());
        return  listViewItem;
    }
}
package com.example.naird.listview_item_row;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by naird on 03/07/2016.
 */
public class BandasAdapter extends ArrayAdapter<Bandas> {

    Context context;
    int layoutResourseId;
    Bandas data[] = null;


    public BandasAdapter(Context context, int layoutResorceId, Bandas[] data){
        super(context,layoutResorceId,data);
        this.context = context;
        this.layoutResourseId = layoutResorceId;
        this.data=data;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        BandasHolder holder = null;

        if(row==null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourseId,parent,false);

            holder = new BandasHolder();
            holder.images = (ImageView) row.findViewById(R.id.images);
            holder.Texto = (TextView) row.findViewById(R.id.tv);

            row.setTag(holder);
        }
        else{
            holder = (BandasHolder)row.getTag();
        }

        Bandas bandas = data[position];
        holder.Texto.setText(bandas.title);
        holder.images.setImageResource(bandas.icon);

        return row;
    }

    static class BandasHolder{
        ImageView images;
        TextView Texto;
    }
}

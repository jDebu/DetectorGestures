package com.example.glup.gesturesdetect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Glup on 7/01/16.
 */
public class Adaptador extends BaseAdapter {
    private Context context;
    public Adaptador(Context context){
        this.context=context;
    }
    @Override
    public int getCount() {return Holder.ITEMS.length;}
    @Override
    public Holder getItem(int position) {return Holder.ITEMS[position];}

    @Override
    public long getItemId(int position) {return position;}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            LayoutInflater inflater=(LayoutInflater)context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.grid_item,parent,false);
        }
        TextView titulo = (TextView)convertView.findViewById(R.id.title);
        ImageView imagen = (ImageView) convertView.findViewById(R.id.image);

        Holder item=getItem(position);
        titulo.setText(item.getTitle());
        imagen.setBackgroundColor(item.getColor());
        return convertView;
    }
}

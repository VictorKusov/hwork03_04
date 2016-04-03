package ru.list.victor_90.study.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;


public class MyAdapter extends BaseAdapter {

    Context context;
    List<String> list;
    LayoutInflater inflater;

    ViewHolder holder;

    public MyAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list == null ? null : list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_text,parent,false);
            holder.txtView = (TextView) convertView.findViewById(R.id.it_txt);
            convertView.setTag(holder);
            Log.d("[MY LOG!!!!!!!!!!!!!!!]", "Подняли холдер  " + position);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtView.setText( (String) getItem(position));
        return convertView;
    }


    private static class ViewHolder{
        TextView txtView;
    }
}

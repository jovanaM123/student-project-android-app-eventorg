package com.example.student;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MeceviListAdapter extends ArrayAdapter<Mecevi> {

    private static final String TAG = "MeceviListAdapter";

    private Context mContext;
    private int mResource;
    private int lastPosition = -1;


    private static class ViewHolder {
        TextView sala;
        TextView datum;
        TextView vreme;
        TextView mec;
    }


    public MeceviListAdapter(Context context,int resource,  ArrayList<Mecevi> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String sala = getItem(position).getSala();
        String datum = getItem(position).getDatum();
        String vreme = getItem(position).getVreme();
        String mec = getItem(position).getMec();

        Mecevi mecevi = new Mecevi(mec,datum,sala,vreme);

        final View result;

        ViewHolder holder;


        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder= new ViewHolder();
            holder.mec = (TextView) convertView.findViewById(R.id.textView1);
            holder.vreme = (TextView) convertView.findViewById(R.id.textView2);
            holder.datum = (TextView) convertView.findViewById(R.id.textView3);
            holder.sala = (TextView) convertView.findViewById(R.id.textView4);

            result = convertView;

            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }


        lastPosition = position;

        holder.sala.setText(mecevi.getSala());
        holder.vreme.setText(mecevi.getVreme());
        holder.mec.setText(mecevi.getMec());
        holder.datum.setText(mecevi.getDatum());

        return convertView;
    }

}









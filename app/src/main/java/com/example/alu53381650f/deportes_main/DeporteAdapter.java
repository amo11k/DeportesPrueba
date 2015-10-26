package com.example.alu53381650f.deportes_main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alu53381650f on 26/10/15.
 */
public class DeporteAdapter {
    private ArrayList<Deporte> deportes;
    private LayoutInflater mInflater;
    public DeporteAdapter(Context context, ArrayList<Deporte> vers) {
        this.mInflater = LayoutInflater.from(context);
        this.deportes = vers;
    }
    public int getCount() {
        return deportes.size();
    }
    public Deporte getItem(int position) {
        return deportes.get(position);
    }
    public long getItemId(int position) {
        return position;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.hNombre = (TextView) convertView.findViewById(R.id.idNombre);
            holder.hImage = (ImageView) convertView.findViewById(R.id.idLogo);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Deporte version = getItem(position);
        holder.hNombre.setText(version.getNombre());
        holder.hImage.setImageResource(version.getLogo());
        return convertView;
    }
    class ViewHolder {
        TextView hNombre;
        ImageView hImage;
    }
}

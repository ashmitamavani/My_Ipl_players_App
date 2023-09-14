package com.example.my_ipl_players_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.my_ipl_players_app.Activity.Players_Details_Activity;
import com.example.my_ipl_players_app.R;

public class Gradient_Adapter extends BaseAdapter {
    Players_Details_Activity players_details_activity;
    int[] gradArr;
    public Gradient_Adapter(Players_Details_Activity players_details_activity, int[] gradArr) {
        this.players_details_activity=players_details_activity;
        this.gradArr=gradArr;
    }

    @Override
    public int getCount() {
        return gradArr.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view= LayoutInflater.from(players_details_activity).inflate(R.layout.gradient_dialog_item_layout,parent,false);
        ImageView imageView=view.findViewById(R.id.grad_item);

        imageView.setBackgroundResource(gradArr[position]);
        return view;
    }
}

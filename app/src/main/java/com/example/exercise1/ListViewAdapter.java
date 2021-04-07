package com.example.exercise1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    Context mcontext;
    LayoutInflater inflater;
    private ArrayList<Class_nama> arrayList;

    public ListViewAdapter(Context context){
        mcontext = context;
        inflater = LayoutInflater.from(mcontext);
        this.arrayList = new ArrayList<Class_nama>();
        this.arrayList.addAll(home_activity.classNamaArrayList);
    }
    public class ViewHolder{
        TextView name;
    }

    @Override
    public int getCount() {
        return home_activity.classNamaArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return home_activity.classNamaArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.item_list,null);
            holder.name = (TextView) view.findViewById(R.id.tvnama_item);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        holder.name.setText(home_activity.classNamaArrayList.get(i).getNama());
        return view;
    }
}

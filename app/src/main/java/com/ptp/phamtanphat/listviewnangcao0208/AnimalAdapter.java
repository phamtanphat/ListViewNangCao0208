package com.ptp.phamtanphat.listviewnangcao0208;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 28/8/2017.
 */

public class AnimalAdapter extends BaseAdapter {
    //3 thuoc tinh chuan bi cho viec do du lieu len BaseAdapter
    Context context;
    int layout;
    ArrayList<Animal> manganimal;

    //Phuong thuc giup ng dung bao dam du lieu se can phai truyen vao(constructor)
    public AnimalAdapter(Context context, int layout, ArrayList<Animal> manganimal) {
        this.context = context;
        this.layout = layout;
        this.manganimal = manganimal;
    }
    //tra ve so luong dong tren listview
    @Override
    public int getCount() {
        return manganimal.size();
    }

    //Tra ve Vi tri thuoc tinh cua doi tuong
    @Override
    public Object getItem(int i) {
        return manganimal.get(i);
    }

    //tra ve id cua cac thuoc tinh
    @Override
    public long getItemId(int i) {
        return i;
    }

    //Phuong thuc dinh hinh view truyen vao va dinh hinh lai cho view
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //Nhan vao 1 man hinh bat ky
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //Dinh nghia man hinh
        view = layoutInflater.inflate(R.layout.dong_animal_item,null);

        ImageView imganimal = view.findViewById(R.id.imageviewanimal);
        TextView txttenanimal = view.findViewById(R.id.textviewtenanimal);

        Animal animal = (Animal) getItem(i);
        imganimal.setImageResource(animal.getHinhAnh());
        txttenanimal.setText(animal.getTen());

        return view;
    }
}

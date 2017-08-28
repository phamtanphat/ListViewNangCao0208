package com.ptp.phamtanphat.listviewnangcao0208;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Animal> animalArrayList;
    AnimalAdapter animalAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);
        animalArrayList = new ArrayList<>();
        animalArrayList.add(new Animal("Con Cho",R.drawable.concho));
        animalArrayList.add(new Animal("Con Chuot",R.drawable.conchuot));
        animalArrayList.add(new Animal("Con Huu",R.drawable.conhuu));
        animalArrayList.add(new Animal("Con Lac Da",R.drawable.conlacda));
        animalArrayList.add(new Animal("Con Ngua",R.drawable.conngua));
        animalArrayList.add(new Animal("Con Voi",R.drawable.convoi));
        animalArrayList.add(new Animal("Con Su Tu",R.drawable.sutu));
        animalAdapter = new AnimalAdapter(MainActivity.this,android.R.layout.simple_list_item_1,animalArrayList);
        lv.setAdapter(animalAdapter);
    }
}

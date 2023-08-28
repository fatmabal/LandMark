package com.fatma.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.fatma.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<LandMark> landMarkArrayList;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        landMarkArrayList=new ArrayList<>();

        LandMark pisa=new LandMark("Pisa","Italy",R.drawable.pisa);
        LandMark eyfel=new LandMark("Eyfel","France",R.drawable.eyfel);
        LandMark collesium=new LandMark("Collesium","Italy",R.drawable.collesium);
        LandMark londanBridge= new LandMark("Londan Bridge","United Kingdem",R.drawable.londan);

        landMarkArrayList.add(pisa);
        landMarkArrayList.add(eyfel);
        landMarkArrayList.add(collesium);
        landMarkArrayList.add(londanBridge);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));


        LandMarkAdapter landMarkAdapter=new LandMarkAdapter(landMarkArrayList);
        binding.recyclerView.setAdapter(landMarkAdapter);
/*
        ArrayAdapter arrayAdapter= null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                    landMarkArrayList.stream().map(landMark -> landMark.name).collect(Collectors.toList())
            );
        }
        binding.liestView.setAdapter(arrayAdapter);
        binding.liestView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this,landMarkArrayList.get(position).name,Toast.LENGTH_LONG);
                Intent intent=new Intent(MainActivity.this,Detail.class);
                intent.putExtra("Landmark",landMarkArrayList.get(position));
                startActivity(intent);
            }
        });

 */


    }
}
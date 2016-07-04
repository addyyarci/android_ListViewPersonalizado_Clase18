package com.example.naird.listview_item_row;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bandas Bandas_data[] = new Bandas[]{
                new Bandas(R.mipmap.ic_launcher, "Coldplay"),
                new Bandas(R.mipmap.ic_launcher, "Foo fighter"),
                new Bandas(R.mipmap.ic_launcher, "Muse"),
                new Bandas(R.mipmap.ic_launcher, "The killers"),
                new Bandas(R.mipmap.ic_launcher, "Red Hot Chillepepers"),
                new Bandas(R.mipmap.ic_launcher, "Nirvana"),
                new Bandas(R.mipmap.ic_launcher, "Perl jam"),
                new Bandas(R.mipmap.ic_launcher, "STP"),
                new Bandas(R.mipmap.ic_launcher, "Placebo"),
                new Bandas(R.mipmap.ic_launcher, "Metallica"),
                new Bandas(R.mipmap.ic_launcher, "Blink 182")
        };
    BandasAdapter adapter = new BandasAdapter(this,R.layout.listview_item_row,Bandas_data);
        lv = (ListView) findViewById(R.id.lv);
        View header = (View) getLayoutInflater().inflate(R.layout.list_header_row,null);
        lv.addHeaderView(header);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView v = (TextView)view.findViewById(R.id.tv);
                Toast.makeText(getApplicationContext(),v.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}

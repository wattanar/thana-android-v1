package com.kopkaap.thanashowtimes;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.List;


public class MainActivity extends ActionBarActivity {

    private ListView list;
    String url = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.listView);



        String[] major = new String[]{
                "TC พิษณุโลก (ห้าง บิ๊กซี)",
                "TC อยุธยา (อยุธยาพาร์ค)",
                "TC นครปฐม (ห้าง บิ๊กซี)",
                "TC สมุทรปราการ (ห้าง บิ๊กซี)",
                "TC ลำปาง (ห้าง บิ๊กซี)",
                "TC เชียงราย (ห้าง บิ๊กซี)",
                "TC เพชรบุรี (ห้าง บิ๊กซี)",
                "TC ราชบุรี (ห้าง บิ๊กซี)",
                "TC ลพบุรี (ห้าง บิ๊กซี)",
                "TC ตาก (ห้าง บิ๊กซี)",
                "TC พิจิตร (ห้าง แฮปปี้ พลาซ่า)",
                "TC แพร่ (มาร์คโฟร์)"
        };

        String[] pro = new String[]{
                "จังหวัด พิษณุโลก ",
                "จังหวัด อยุธยา",
                "จังหวัด นครปฐม",
                "จังหวัด สมุทรปราการ",
                "จังหวัด ลำปาง",
                "จังหวัด เชียงราย",
                "จังหวัด เพชรบุรี",
                "จังหวัด ราชบุรี",
                "จังหวัด ลพบุรี",
                "จังหวัด ตาก",
                "จังหวัด พิจิตร",
                "จังหวัด แพร"
        };


        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), major , pro);

        list.setAdapter(customAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(),"You Click ID : " + String.valueOf(i), Toast.LENGTH_LONG).show();

                if (i == 0){
                    url = "http://thanacineplex.com/movie.php?movie=&branch=1";
                }else if(i == 1){
                    url = "http://thanacineplex.com/movie.php?movie=&branch=2";
                }else if(i == 2){
                    url = "http://thanacineplex.com/movie.php?movie=&branch=3";
                }else if(i == 3){
                    url = "http://thanacineplex.com/movie.php?movie=&branch=4";
                }else if(i == 4){
                    url = "http://thanacineplex.com/movie.php?movie=&branch=5";
                }else if(i == 5){
                    url = "http://thanacineplex.com/movie.php?movie=&branch=6";
                }else if(i == 6){
                    url = "http://thanacineplex.com/movie.php?movie=&branch=7";
                }else if(i == 7){
                    url = "http://thanacineplex.com/movie.php?movie=&branch=8";
                }else if(i == 8){
                    url = "http://thanacineplex.com/movie.php?movie=&branch=9";
                }else if(i == 9){
                    url = "http://thanacineplex.com/movie.php?movie=&branch=11";
                }else if(i == 10){
                    url = "http://thanacineplex.com/movie.php?movie=&branch=10";
                }else if(i == 11){
                    url = "http://thanacineplex.com/movie.php?movie=&branch=12";
                }else{
                    url = "http://thanacineplex.com/movie.php?movie=&branch=1";
                }

                Intent intent = new Intent(MainActivity.this,showtimes.class);
                intent.putExtra("url",url);
                startActivity(intent);

            }
        });

        AdRequest.Builder adBuilder = new AdRequest.Builder();
        AdRequest adRequest = adBuilder.build();
        AdView adView = (AdView)findViewById(R.id.adView);
        adView.loadAd(adRequest);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

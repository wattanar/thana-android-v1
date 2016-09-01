package com.kopkaap.thanashowtimes;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.lang.annotation.Documented;
import java.util.ArrayList;


public class showtimes extends ActionBarActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showtimes);

        text = (TextView)findViewById(R.id.text);

        Bundle bundle = getIntent().getExtras();
        String url = bundle.getString("url");

        //text.setText(url);
        try {
            Document document = Jsoup.connect(url).get();
            Elements elements = document.select(".date");

            ArrayList arrayList = new ArrayList();

            for (int i = 0; i<elements.size();i++){
                Element element = elements.get(i);
                arrayList.add(element.text().trim());
            }

            text.setText(arrayList.size());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

package helmi.branded.me.listviewadvance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String names[] = {
            "Justin",
            "Beiber",
            "Believer",
            "Justt",
            "Beliep"
    };

    private String desc[] = {
            "Singer",
            "Singgg",
            "Rock",
            "Pianist",
            "Do nothing"
    };


    private Integer imageid[] = {
            R.drawable.bieber1,
            R.drawable.bieber2,
            R.drawable.bieber3,
            R.drawable.bieber4,
            R.drawable.bieber5
    };

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomList customList = new CustomList(this, names, desc, imageid);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(customList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"You Clicked "+names[i],Toast.LENGTH_SHORT).show();
            }
        });
    }
}

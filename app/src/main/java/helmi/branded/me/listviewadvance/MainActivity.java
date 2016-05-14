package helmi.branded.me.listviewadvance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Celebrity> arrayList = new ArrayList<>();
        arrayList.add(new Celebrity("justin","Singer",R.drawable.bieber1));
        arrayList.add(new Celebrity("Bieber","Sing",R.drawable.bieber2));
        arrayList.add(new Celebrity("Believer","Rock",R.drawable.bieber3));
        arrayList.add(new Celebrity("Just","Pianist",R.drawable.bieber4));
        arrayList.add(new Celebrity("Beliep","Nothing",R.drawable.bieber5));

        CustomList customList = new CustomList(this, arrayList);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(customList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

              Celebrity celebrity = (Celebrity) listView.getItemAtPosition(i);
//                Toast.makeText(getApplicationContext(),"You Clicked "+arrayList.get(i).getName(),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this
                        ,CelebrityDetailActivity.class);
                intent.putExtra("name", celebrity.getName());
                intent.putExtra("job", celebrity.getJob());
                intent.putExtra("image", celebrity.getImage());
                startActivity(intent);
            }
        });
    }
}

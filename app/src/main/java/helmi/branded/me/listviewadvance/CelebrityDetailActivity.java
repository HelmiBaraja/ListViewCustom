package helmi.branded.me.listviewadvance;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CelebrityDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celebrity_detail);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String job = intent.getStringExtra("job");
        int image = intent.getIntExtra("image",0);

        ImageView imageViewProfile = (ImageView) findViewById(R.id.imageViewProfile);
        TextView textViewJob = (TextView) findViewById(R.id.textViewJob);
        TextView textViewName = (TextView) findViewById(R.id.textViewName);

        imageViewProfile.setImageResource(image);
        textViewJob.setText(job);
        textViewName.setText(name);
    }

    public void buttonEmail(View view)
    {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","abc@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
        startActivity(Intent.createChooser(emailIntent, "Send email..."));
    }

    public void buttonMessage (View view)
    {
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("sms:"));
        sendIntent.putExtra("sms_body", "hi");
        startActivity(sendIntent);

    }

    public void buttonWebsite(View view)
    {
        String url = "http://www.example.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}

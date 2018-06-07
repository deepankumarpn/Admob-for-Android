package deepan.dev.admobads;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button ads1,ads2,ads3,ads4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ads1=(Button)findViewById(R.id.ads1);
        ads2=(Button)findViewById(R.id.ads2);
        ads3=(Button)findViewById(R.id.ads3);
        ads4=(Button)findViewById(R.id.ads4);

        ads1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),BannerAds.class);
                startActivity(i);
            }
        });
        ads2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),InterstitialAds.class);
                startActivity(i);
            }
        });
        ads3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),NativeAds.class);
                startActivity(i);
            }
        });
        ads4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RewardedVideoAds.class);
                startActivity(i);
            }
        });

    }
}

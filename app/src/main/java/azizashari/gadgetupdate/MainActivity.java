package azizashari.gadgetupdate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //smartphone
    public void klikButton1(View v){
        Intent intent1 = new Intent(this,SmartphoneActivity.class);
        startActivity(intent1);
    }

    //notebook
    public  void  klikButton2 (View v){
        Intent intent2 = new Intent(this,NotebookActivity.class);
        startActivity(intent2);

    }

    //drone
    public  void  klikButton3 (View v){
        Intent intent3 = new Intent(this,DroneActivity.class);
        startActivity(intent3);
    }

    //swartwatch
    public  void  klikButton4 (View v){
        Intent intent4 = new Intent(this,WatchActivity.class);
        startActivity(intent4);
    }

    //action camera
    public  void  klikButton5 (View v){
        Intent intent5 = new Intent(this,Actioncam.class);
        startActivity(intent5);
    }

    //credit
    public  void  klikButton6 (View v){
        Intent intent6 = new Intent(this,CreditActivity.class);
        startActivity(intent6);
    }

}

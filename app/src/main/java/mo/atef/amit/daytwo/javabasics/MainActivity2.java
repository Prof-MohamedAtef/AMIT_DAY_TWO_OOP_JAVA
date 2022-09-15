package mo.atef.amit.daytwo.javabasics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.bumptech.glide.Glide;

import mo.atef.amit.daytwo.javabasics.databinding.ActivityMain2Binding;
import mo.atef.amit.daytwo.javabasics.models.Talabat;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main2);
        int deliveryTime=20;
        String location="Ramsis";
        Drawable img=getResources().getDrawable(R.drawable.img);
        binding.setTalabat(new Talabat(img,deliveryTime, location));
        binding.tvLocation.setText(location);
        binding.tvdatetime.setText(String.valueOf(deliveryTime));
    }
}
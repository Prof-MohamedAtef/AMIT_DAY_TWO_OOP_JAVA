package mo.atef.amit.daytwo.javabasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import mo.atef.amit.daytwo.javabasics.engines.Electricity;
import mo.atef.amit.daytwo.javabasics.homes.NewHome;
import mo.atef.amit.daytwo.javabasics.persons.Atef;
import mo.atef.amit.daytwo.javabasics.persons.Youssef;

public class MainActivity extends AppCompatActivity {

    public float myFloatNum = 5;
    public int myInt=3;
    public String name="ahmed";
    char myLetter = 'D';         // character
    boolean myBool = true;
    boolean myBoolFalse = false;

    public int width= 50;
    private int height= 30;

    private int date;

    int DateOfBirth=28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("MyFloat", "val: "+myFloatNum);
        Log.e("MyFloat", "val: "+myInt);
        Log.e("MyFloat", "val: "+name);
        Log.e("MyFloat", "val: "+myLetter);
        Log.e("MyFloat", "val: "+myBool);
        Log.e("MyFloat", "val: "+myBoolFalse);

        if(width==height){ // true
            Log.e("MyQuestion1", "val: Width is Bigger than Height!");
        }else{ //false
            Log.e("MyQuestion1", "val: Width is not equal than Height!");
        }


        Log.e("MyQuestion2","val: Width is not equal than Height!");
        Log.v("MyVerbose1","This is my verbose");
        Log.d("MyDebug1","This is my Debug");

        System.out.println("m**********m");


        /*
        inheritance - وراثة
        parent - > child
        attributes

         */
        NewHome newHome=new NewHome();
        Atef atef=new Atef();
//        atef.HasBook

        Youssef youssef=new Youssef();
        youssef.readData();

        Electricity electricity=new Electricity();
        electricity.setVolt(90);

        Log.e("amh","value: ");


    }


    /*
    access modifiers
    class
    methods : overriding - overloading
    attributes
    getter / setter
    inheritance
     */
}
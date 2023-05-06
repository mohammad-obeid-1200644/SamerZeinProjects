package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButtonToggleGroup;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private RadioButton applerd;
    private RadioButton tomatrd;

    private Spinner animalspn;

    private EditText skyedt;
    private RadioButton basket;
    private RadioButton racket;
    private RadioButton mitt;
    private RadioButton stick;
    private RadioButton clr1;
    private RadioButton clr2;
    private RadioButton clr3;
    private Button showbtn;
    private Button showwrng;
    private TextView lasttxt;
    private TextView wrngrxr;
    private static int res=5;
    private String wrn="";
    DAanimal animal=new DAanimal();

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        applerd=findViewById(R.id.radio_Apple);
        tomatrd=findViewById(R.id.Tomato);
        skyedt=findViewById(R.id.skyclredt);
        animalspn=findViewById(R.id.animalid);
        basket=findViewById(R.id.basket);
        racket=findViewById(R.id.racket);
        mitt=findViewById(R.id.mitt);
        stick=findViewById(R.id.stick);
        showbtn=findViewById(R.id.showbtn);
        clr1=findViewById(R.id.clr1);
        clr2=findViewById(R.id.clr2);
        clr3=findViewById(R.id.clr3);
        lasttxt=findViewById(R.id.restxt);
        showwrng=findViewById(R.id.wrngbtn);
        wrngrxr=findViewById(R.id.wrntxt);
        getOpartions();

    }
    public void getOpartions(){
        ArrayAdapter<String> array = new ArrayAdapter<>(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, animal.getName());
        animalspn.setAdapter(array);
    }


    public void appleclk(View view) {
        //Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();

    }
    public void tomatclk(View view) {
    }
    public void basketclk(View view) {
    }

    public void racketclk(View view) {
    }

    public void mittclk(View view) {
    }

    public void stickclk(View view) {
    }

    public void clr1clk(View view) {
    }

    public void clr2clk(View view) {
    }

    public void clr3clk(View view) {
    }

    public void showclk(View view) {
        if(!applerd.isChecked()){
            res-=1;
            wrn+="Exercise One Is Wrong\n";

        }

        if(!animalspn.getSelectedItem().toString().equals("Cow")){
            res-=1;
            wrn+="Exercise Two Is Wrong\n";
        }
        String x=skyedt.getText().toString().toLowerCase();
        if(!x.equals("blue")){
            wrn+="Exercise Three Is Wrong\n";
            res-=1;
        }
        if(!stick.isChecked()){
            wrn+="Exercise Four Is Wrong\n";
            res-=1;
        }
        if(!clr3.isChecked()){
            wrn+="Exercise Five Is Wrong\n";
            res-=1;
        }
        lasttxt.setText("your Score Is "+res);
        lasttxt.setVisibility(view.VISIBLE);
        if(res!=5){
            showwrng.setVisibility(view.VISIBLE);
        }
    }

    public void wrongbtn(View view) {
        wrngrxr.setText(wrn);
        wrngrxr.setVisibility(view.VISIBLE);
    }
}
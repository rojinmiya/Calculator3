package com.calculator3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tvOutput;
    private Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnAdd, btnSubtract, btnMultiply, btnDivide, btnEqual;
    private float value1, value2;
    boolean add, subtract, divide, multiply;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne=findViewById(R.id.btnOne);
        btnTwo=findViewById(R.id.btnTwo);
        btnThree=findViewById(R.id.btnThree);
        btnFour=findViewById(R.id.btnFour);
        btnFive=findViewById(R.id.btnFive);
        btnSix=findViewById(R.id.btnSix);
        btnSeven=findViewById(R.id.btnSeven);
        btnEight=findViewById(R.id.btnEight);
        btnNine=findViewById(R.id.btnNine);
        btnZero=findViewById(R.id.btnZero);
        btnAdd=findViewById(R.id.btnAdd);
        btnSubtract=findViewById(R.id.btnSubtract);
        btnMultiply=findViewById(R.id.btnMultiply);
        btnDivide=findViewById(R.id.btnDivide);
        btnEqual = findViewById(R.id.btnEqual);
        tvOutput=findViewById(R.id.tvOutput);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener( this);
        btnThree.setOnClickListener( this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener( this);
        btnSix.setOnClickListener( this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener( this);
        btnNine.setOnClickListener( this);
        btnZero.setOnClickListener( this);
        btnAdd.setOnClickListener( this);
        btnSubtract.setOnClickListener( this);
        btnDivide.setOnClickListener( this);
        btnEqual.setOnClickListener(this);
        btnMultiply.setOnClickListener( this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnOne:
                tvOutput.setText(tvOutput.getText().toString()+"1");
                break;

            case R.id.btnTwo:
                tvOutput.setText(tvOutput.getText().toString()+"2");
                break;

            case R.id.btnThree:
                tvOutput.setText(tvOutput.getText().toString()+"3");
                break;

            case R.id.btnFour:
                tvOutput.setText(tvOutput.getText().toString()+"4");
                break;

            case R.id.btnFive:
                tvOutput.setText(tvOutput.getText().toString()+"5");
                break;

            case R.id.btnSix:
                tvOutput.setText(tvOutput.getText().toString()+"6");
                break;

            case R.id.btnSeven:
                tvOutput.setText(tvOutput.getText().toString()+"7");
                break;

            case R.id.btnEight:
                tvOutput.setText(tvOutput.getText().toString()+"8");
                break;

            case R.id.btnNine:
                tvOutput.setText(tvOutput.getText().toString()+"9");
                break;

            case R.id.btnZero:
                tvOutput.setText(tvOutput.getText().toString()+"0");
                break;


            case R.id.btnAdd:
                if(tvOutput==null){
                    tvOutput.setText("");

                }else{

                    value1=Float.parseFloat(tvOutput.getText().toString());
                    add =true;
                    tvOutput.setText("");
                }
                break;

            case R.id.btnSubtract:
                if(tvOutput==null){
                    tvOutput.setText("");

                }else{
                    value1=Float.parseFloat(tvOutput.getText().toString());
                    subtract=true;
                    tvOutput.setText("");
                }
                break;

            case R.id.btnMultiply:
                if (tvOutput==null){
                    tvOutput.setText("");

                }else{

                    value1=Float.parseFloat(tvOutput.getText().toString());
                    multiply=true;
                    tvOutput.setText("");
                }
                break;


            case R.id.btnDivide:
                if (tvOutput==null){
                    tvOutput.setText("");

                }else{

                    value1=Float.parseFloat(tvOutput.getText().toString());
                    divide=true;
                    tvOutput.setText("");
                }
                break;

            case R.id.btnEqual:
                value2=Float.parseFloat(tvOutput.getText().toString());
                if(add){

                    tvOutput.setText((value1+value2)+"");

                }

               else if (subtract){

                    tvOutput.setText((value1-value2)+"");

                }

               else if(multiply){
                    tvOutput.setText((value1*value2)+"");
                }

              else  if(divide){
                    tvOutput.setText((value1/value2)+"");
                }

              break;




        }
    }
}

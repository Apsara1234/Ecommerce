package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CheckoutActivity extends AppCompatActivity {
    TextView txtCheck, txtAddress, txtName, txtSubstreet, txtMainstreet, txtCountry, txtPayment, txtCashon, txtItems,
            txtTittle, txtDescp, txtPrice, txtTotal,txtTotalprice,txtPromcode,txtDelivery;
    EditText etNumber, etMessage;
    Button  btnincrement, btndecrement, btnCheckout;
    ImageView imgCash, imgCircle, imgTag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        imgCash= findViewById(R.id.imgcash);
        imgCircle=findViewById(R.id.imgcirlce);
        imgTag=findViewById(R.id.imgtag);
        etNumber=findViewById(R.id.etnumber);
        etMessage=findViewById(R.id.etmessage);
        txtCheck=findViewById(R.id.txtcheck);
        txtAddress=findViewById(R.id.txtaddress);
        txtName=findViewById(R.id.txtname);
        txtSubstreet=findViewById(R.id.txtsubstreet);
        txtMainstreet=findViewById(R.id.txtmainstreet);
        txtCountry=findViewById(R.id.txtcountry);
        txtPayment=findViewById(R.id.txtpayment);
        txtPrice=findViewById(R.id.txtprice);
        txtPromcode=findViewById(R.id.txtpromcode);
        txtDelivery=findViewById(R.id.txtdelivery);
        txtDescp=findViewById(R.id.txtdescp);
        txtTittle=findViewById(R.id.txttittle);
        txtTotal=findViewById(R.id.txtTotal);
        txtTotalprice=findViewById(R.id.txtTotalprice);
        txtCashon=findViewById(R.id.txtcashon);
        txtItems=findViewById(R.id.txtitems);
        btnCheckout=findViewById(R.id.btnCheckout);
        btnincrement=findViewById(R.id.btnincrement);
        btndecrement=findViewById(R.id.btndecrement);

        btndecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnincrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
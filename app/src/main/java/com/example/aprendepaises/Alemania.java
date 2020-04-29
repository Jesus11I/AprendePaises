package com.example.aprendepaises;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Alemania extends Activity implements View.OnClickListener {

    private ImageView iv_alemania;
    private Button belgica, alemania, suiza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alemania);

        iv_alemania = (ImageView)findViewById(R.id.imageView2_Alemania);
        belgica = (Button)findViewById(R.id.belgica);
        alemania = (Button)findViewById(R.id.alemania);
        suiza = (Button)findViewById(R.id.suiza);

        belgica.setOnClickListener(this);
        alemania.setOnClickListener(this);
        suiza.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.belgica:
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                break;
            case R.id.alemania:
                Intent intent =new Intent(this,Espana.class);
                break;
            case R.id.suiza:
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}

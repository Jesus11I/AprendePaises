package com.example.aprendepaises;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Espana extends Activity  implements View.OnClickListener{

    private ImageView iv_espana;
    private Button espana, eslovaquia, moldavia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.espana);

        iv_espana = (ImageView)findViewById(R.id.imageView2_espana);
        espana = (Button)findViewById(R.id.espana);
        eslovaquia = (Button)findViewById(R.id.eslovaquia);
        moldavia = (Button)findViewById(R.id.moldavia);

        espana.setOnClickListener(this);
        eslovaquia.setOnClickListener(this);
        moldavia.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.espana:
                Intent intent = new Intent(this,Espana.class);
                startActivity(intent);
                break;
            case R.id.eslovaquia:
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                break;
            case R.id.moldavia:
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}

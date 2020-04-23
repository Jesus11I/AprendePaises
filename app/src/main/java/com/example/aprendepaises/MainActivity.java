package com.example.aprendepaises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejecutar_sobreLaApp (View vista_sobreLaApp){            //ejecuta el botón del
        Intent i=new Intent(this, sobreLaApp.class);      //menú "Sobre la App"
        startActivity(i);

    }

    public void ejecutar_sobreLosCreadores (View vista_sobreLosCreadores){   //ejecuta el botón del
        Intent i=new Intent(this, sobreLosCreadores.class);    //menú "Sobre los Creadores"
        startActivity(i);

    }

    @Override public boolean onCreateOptionsMenu(Menu menuApp){        //este método crea el menú
        getMenuInflater().inflate(R.menu.menu_informacion, menuApp);   //de la activity principal
        return true;
    }

    @Override public boolean onOptionsItemSelected (MenuItem opciones_menu){ //este método activa
        int id=opciones_menu.getItemId();                                    //las opciones del menú
                                                                     //(devuelve una acción de menú:
        if (id==R.id.SobreLaApp){                             // sobre la app o sobre los creadores)
            ejecutar_sobreLaApp(null);
            return true;
        }
        if (id==R.id.SobreLosCreadores){
            ejecutar_sobreLosCreadores(null);
            return true;
        }
        return super.onOptionsItemSelected(opciones_menu);
    }

}

package com.example.manuelalejandro.sensoresldhgrupo3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button botonProximidad;
    Button botonMagnetico;
    Button botonHumedad;
    Button botonAcelerometro;
    Button botonGiroscopio;
    Button botonLuz;
    /**
     * Constructor de la clase Activity,
     * @param savedInstanceState guarda una instancia de la actividad pasada por parametro
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**
         * Se declara boton para el sensor proximidad
         */
        botonProximidad = (Button) findViewById(R.id.button);
        botonProximidad.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                proximidad(v);
            }
        });

        /**
         * Se declara el boton para el sensor magnetico
         */
        botonMagnetico = (Button) findViewById(R.id.button2);
        botonMagnetico.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                magnometro(v);
            }
        });

        /**
         * Se declara el boton para el sensor humedad
         */
        botonHumedad = (Button) findViewById(R.id.button3);
        botonHumedad.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                humedad(v);
            }
        });

        /**
         * Se declara el boton para el sensor acelerometro
         */
        botonAcelerometro = (Button) findViewById(R.id.button4);
        botonAcelerometro.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                acelerometro(v);
            }
        });

        /**
         * Se declara el boton para el sensor giroscopio
         */
        botonGiroscopio = (Button) findViewById(R.id.button5);
        botonGiroscopio.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                giroscopio(v);
            }
        });



        /**
         * Se declara el boton para el sensor Luz
         */
        botonLuz = (Button) findViewById(R.id.button6);
        botonLuz.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                luz(v);
            }
        });


    }





    /**
     * Añade elementos a la barra de acción si está presente
     * @param menu
     * @return true
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Coge el id , comprueba si está en los ajustes, si está return true, si no, retorna el item seleccionado en las opciones
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Función que crea el intent con la actividad del sensor proximidad y la inicia.
     * Se espera modificar cambios (Probando commits con jira...)
     * @param view
     */
    public void proximidad(View view) {
        Intent i = new Intent(this, ProximidadActivity.class);
        startActivity(i);
    }

    /**
     * Función que crea el intent con la actividad del sensor magnometro y la inicia.
     * @param view
     */
    public void magnometro(View view) {
        Intent i = new Intent(this, MagnometroActivity.class);
        startActivity(i);
    }

    /**
     * Función que crea el intent con la actividad del sensor humedad y la inicia.
     * @param view
     */

    public void humedad(View view) {
        Intent i = new Intent(this, HumedadActivity.class);
        startActivity(i);
    }

    /**
     * Función que crea el intent con la actividad del sensor Acelerometro y la inicia.
     * @param view
     */

    public void acelerometro(View view) {
        Intent i = new Intent(this, AcelerometroActivity.class);
        startActivity(i);
    }

    /**
     * Función que crea el intent con la actividad del sensor Giroscopio y la inicia.
     * @param view
     */

    public void giroscopio(View view) {
        Intent i = new Intent(this, GiroscopioActivity.class);
        startActivity(i);
    }

    /**
     * Función que crea el intent con la actividad del sensor Luz y la inicia.
     * @param view
     */

    public void luz(View view) {
        Intent i = new Intent(this, LuzActivity.class);
        startActivity(i);
    }
}

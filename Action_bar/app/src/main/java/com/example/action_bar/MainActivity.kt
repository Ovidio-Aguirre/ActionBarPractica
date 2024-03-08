package com.example.action_bar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val toolbar= findViewById<Toolbar>(R.id.toolbar)


        setSupportActionBar(toolbar)

        supportActionBar?.title="Aguirre Martinez"
        supportActionBar?.subtitle="Universidad Francisco Gavidia"
        supportActionBar?.setIcon(R.drawable.ic_launcher_foreground)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater .inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.configuracion->{
                Toast.makeText( this, "usted ha seleccionado la opcion de configuracion ",Toast.LENGTH_LONG).show()
                true
            }
            R.id.perfil->{
                Toast.makeText( this, "usted ha seleccionado la opcion de perfil ",Toast.LENGTH_LONG).show()
                true
            }
            R.id.mapa->{
                Toast.makeText( this, "usted ha seleccionado la opcion de su ubicacion ",Toast.LENGTH_LONG).show()
                true
            }
            R.id.nueva_cuenta->{
                Toast.makeText( this, "usted ha seleccionado la opcion de una nueva cuenta ",Toast.LENGTH_LONG).show()
                true
            }
            R.id.salir->{
                Toast.makeText( this, "usted ha seleccionado la opcion de salir de la app ",Toast.LENGTH_LONG).show()
                true
            }
            else -> false
        }

    }
}

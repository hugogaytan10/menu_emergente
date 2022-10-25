package com.example.menuemergente

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //crear funcion para mostrar el PopUp
    fun mostrarPopUp(v : View){
        PopupMenu(this, v).apply {
            inflate(R.menu.menu_emergente)
            setOnMenuItemClickListener {
                when(it!!.itemId){
                    R.id.idOpcion1 -> {
                        Toast.makeText(this@MainActivity,
                        "Opcion 1 en la imagen",
                        Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.idOpcion2 -> {
                        Toast.makeText(this@MainActivity,
                            "Opcion 2 en la imagen",
                            Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }
            }
        }.show()
    }
}
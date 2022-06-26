package com.example.toplama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toplama.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)
         val ilkDeger =" "
         val sonDeger =" "
        val sonuc:String =" "
        val temp:Int =0;
        val ArtıTıkla = false


        tasarim.buttonBir.setOnClickListener {
            val bir ="1"
            tasarim.textViewSonuc.setText("$bir").toString()
        }
        tasarim.buttonIki.setOnClickListener {
            val iki ="2"
            tasarim.textViewSonuc.setText("$iki").toString()
        }
        tasarim.buttonUc.setOnClickListener {
            val uc ="3"
            tasarim.textViewSonuc.setText("$uc").toString()
        }
        tasarim.buttonDort.setOnClickListener {
            val dort="4"
            tasarim.textViewSonuc.setText("$dort").toString()
        }
        tasarim.buttonBes.setOnClickListener {
            val bes ="5"
            tasarim.textViewSonuc.setText("$bes").toString()
        }
        tasarim.buttonAlti.setOnClickListener {
            val altı ="6"
            tasarim.textViewSonuc.setText("$altı").toString()
        }
        tasarim.buttonYedi.setOnClickListener {
            val yedi ="7"
            tasarim.textViewSonuc.setText("$yedi").toString()
        }
        tasarim.buttonSekiz.setOnClickListener {
            val sekiz ="8"
            tasarim.textViewSonuc.setText("$sekiz").toString()
        }
        tasarim.buttonDokuz.setOnClickListener {
            val dokuz ="9"
            tasarim.textViewSonuc.setText("$dokuz").toString()
        }
        tasarim.buttonSifir.setOnClickListener {
            val sifir ="0"
            tasarim.textViewSonuc.setText("$sifir").toString()
        }
        tasarim.buttonTemizle.setOnClickListener {
            val temiz =" "
            tasarim.textViewSonuc.setText("$temiz").toString()
        }
        tasarim.buttonTopla.setOnClickListener {
            var temp:String =tasarim.textViewSonuc.text as String
            var ilkDeger =temp.toString()


        }
        tasarim.buttonEsittir.setOnClickListener {

        }

    }
}
package com.example.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultado2.*
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado2)

        val imc = intent.getParcelableExtra<IMC>("value")
        titleDensidadeCorporal.text = imc.nome.toString()
        textViewHeaderDensidadeCorporal.text = imc.calcular()
        val formatarIMC = DecimalFormat("#,##0.00", DecimalFormatSymbols(Locale("pt", "BR")))
        val imcFormatado = formatarIMC.format(imc.imc)
        textViewResultadoDensidadeCorporal.text = "Seu IMC " + imcFormatado.toString()
        textViewMostrarPeso.text = "Seu Peso " + imc.peso.toString()
        textViewMostrarAltura.text = "Sua Altura " + imc.altura.toString()


    }
}

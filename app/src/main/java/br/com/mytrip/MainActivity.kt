package br.com.mytrip

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.buttonCalcular) handleCalcute()
    }

    private fun handleCalcute() {
        if (isValid()) {
            Toast.makeText(this, "Valores validos", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, getString(R.string.valores_validos), Toast.LENGTH_LONG).show()
        }
    }


    private fun isValid(): Boolean {
        return editDistancia.text.isNotBlank() && editPreco.text.isNotBlank() && editAutonomia.text.isNotBlank()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonCalcular.setOnClickListener(this)
    }
}

package espinoza.ariana.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Button

class PrincipalActivity : AppCompatActivity() {
    lateinit var context:Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var vista = inflator.inflate(R.layout.activity_main,null)

        var tv_nombre = vista.findViewById(R.id.tv_nombre) as TextView
        var tv_email = vista.findViewById(R.id.tv_email) as TextView
        var btn_cerrar = vista.findViewById(R.id.btn_cerrar) as Button


        val bundle = intent.extras
        if(bundle!=null){
            val nombre = bundle.getString("name")
            val correo = bundle.getString("email")

            tv_nombre.setText(nombre)
            tv_email.setText(correo)

        }

        btn_cerrar.setOnClickListener{
            finish()
        }
    }
}
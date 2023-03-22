package tw.edu.pu.gm.o1103015.hw0322

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txv = findViewById(R.id.txv)
        txv.setOnClickListener ({
            if(txv.text == "李哲"){
                txv.text ="海青班，3333"
            }else{
                txv.text ="李哲"
            }
        })
    }
}
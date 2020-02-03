package ntphong.example.listviewnc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var araymonan : ArrayList<monan> = ArrayList()
        araymonan.add(monan("banhmy",R.drawable.banhgao))
        araymonan.add(monan("banhgio",R.drawable.banhmy))
        araymonan.add(monan("banhgao",R.drawable.banhgio))
        lsview.adapter = customadapter(this@MainActivity,araymonan)
    }
}

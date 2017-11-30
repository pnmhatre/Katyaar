package strange.cypher.katyaar

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.text.SpannableStringBuilder
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by pnmhatre on 11/18/2017.
 */
class MainActivity : FragmentActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun EditText.extract(): String {
        var value = this.text.toString()
        this.text = SpannableStringBuilder("")
        return value
    }
    fun EditText.extract2(): String {
        var value = this.text.toString()
        this.text = SpannableStringBuilder("")
        return value
    }
}
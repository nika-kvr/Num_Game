package com.example.a1234

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN
import android.widget.Switch
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent as Intent
import com.example.a1234.Main2Activity as Main2Activity1

class MainActivity : AppCompatActivity() {


    private var switch: Switch? = null

    private lateinit var saveData: saveData


    override fun onCreate(savedInstanceState: Bundle?) {

        saveData = saveData(this)
        if(saveData.loadDarkModeState() == true){

            setTheme(R.style.darkTheme)

        }else
            setTheme(R.style.AppTheme)


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // switch for on off

        switch = findViewById<View>(R.id.On_Off) as Switch?

        if (saveData.loadDarkModeState() == true){
            switch!!.isChecked = true
        }

        //On click on off

        switch!!.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked){
                saveData.setDarkModeState(true)
                restartApplication()
            }else{
                saveData.setDarkModeState(false)
                restartApplication()
            }


        }






        play.setOnClickListener {
            startActivity(Intent(this, com.example.a1234.Main2Activity::class.java))
        }





    }

    private fun restartApplication(){
        val i = Intent(applicationContext, MainActivity:: class.java)
        startActivity(i)
        finish()
    }
}


package com.happiestminds.animalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun buttonClick(view: View) {
        when(view.id){
            R.id.domesticB -> {
                val frag = AnimalFragment.newInstance(1,1) //1-domestic,2-wild
                supportFragmentManager.beginTransaction()
                    .replace(R.id.placeHolder, frag)
                    .addToBackStack(null)
                    .commit()
            }
            R.id.wildB -> {
                val frag = AnimalFragment.newInstance(1,2) //1-domestic,2-wild
                supportFragmentManager.beginTransaction()
                    .replace(R.id.placeHolder, frag)
                    .addToBackStack(null)
                    .commit()
            }
        }
    }
}
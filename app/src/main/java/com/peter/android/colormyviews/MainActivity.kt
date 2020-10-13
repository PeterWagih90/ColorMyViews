package com.peter.android.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // auto view binding
        val clickableViews: List<View> =
            listOf(box_one_text, box_two_text, box_three_text,
                box_four_text, box_five_text,red_btn,yellow_btn,green_btn)

        for(item in clickableViews){
            item.setOnClickListener{
                makeColored(view = item)
            }
        }
    }


    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.red_btn -> view.setBackgroundColor(ContextCompat.getColor(this,android.R.color.holo_red_dark))
            R.id.yellow_btn -> view.setBackgroundColor(ContextCompat.getColor(this,android.R.color.holo_orange_light))
            R.id.green_btn -> view.setBackgroundColor(ContextCompat.getColor(this,android.R.color.holo_green_dark))


            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
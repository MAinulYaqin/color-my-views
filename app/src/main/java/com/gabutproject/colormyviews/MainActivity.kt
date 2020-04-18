package com.gabutproject.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }

    private fun setListener() {
        val greenBoxesText =
            listOf<View>(
                main_layout,
                box_one_text,
                box_two_text,
                box_three_text,
                box_four_text,
                box_five_text,
                button_blue,
                button_yellow,
                button_red
            )

        for (item in greenBoxesText) {
            item.setOnClickListener {
                makeColored(it)
            }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Using Color class background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.LTGRAY)

            // Using android R background
            R.id.box_three_text -> view.setBackgroundColor(resources.getColor(android.R.color.holo_blue_dark))
            R.id.box_four_text -> view.setBackgroundColor(resources.getColor(android.R.color.holo_orange_dark))
            R.id.box_five_text -> view.setBackgroundColor(resources.getColor(android.R.color.holo_red_dark))

            R.id.button_blue -> box_three_text.setBackgroundColor(Color.BLUE)
            R.id.button_yellow -> box_four_text.setBackgroundColor(Color.YELLOW)
            R.id.button_red -> box_five_text.setBackgroundColor(Color.RED)
            else -> view.setBackgroundColor(resources.getColor(android.R.color.darker_gray))
        }
    }
}

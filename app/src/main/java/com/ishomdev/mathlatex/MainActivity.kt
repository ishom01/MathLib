package com.ishomdev.mathlatex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.ishomdev.latex.LatexDrawable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.image_view)
        image.setImageDrawable(LatexDrawable("\\frac{10}{10}", 12f))
    }
}
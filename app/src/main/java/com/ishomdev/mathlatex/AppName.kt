package com.ishomdev.mathlatex

import android.app.Application
import com.ishomdev.latex.core.AjLatexMath

class AppName: Application() {
    override fun onCreate() {
        super.onCreate()
        AjLatexMath.init(this)
    }
}
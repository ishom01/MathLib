package com.ishomdev.latex

import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.PixelFormat
import android.graphics.drawable.Drawable
import com.ishomdev.latex.core.TeXConstants
import com.ishomdev.latex.core.TeXFormula

class LatexDrawable(text: String, textSize: Float): Drawable() {

    private var mWidth = 0
    private var mHeight = 0

    private val mIcon = TeXFormula(text)
        .TeXIconBuilder()
        .setStyle(TeXConstants.STYLE_DISPLAY)
        .setSize(textSize)
        .build()

    init {
        mWidth = mIcon.iconWidth
        mHeight = mIcon.iconHeight
        setBounds(0, 0, mWidth, mHeight)
    }

    override fun draw(canvas: Canvas) {
        mIcon.paintIcon(canvas, 0, 0)
    }

    override fun setAlpha(p0: Int) {
    }

    override fun setColorFilter(p0: ColorFilter?) {
    }

    override fun getOpacity(): Int {
        return PixelFormat.TRANSLUCENT
    }

    override fun getIntrinsicHeight(): Int {
        return mHeight
    }

    override fun getIntrinsicWidth(): Int {
        return mWidth
    }
}
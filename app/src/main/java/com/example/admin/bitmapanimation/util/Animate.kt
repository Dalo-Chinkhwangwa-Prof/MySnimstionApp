package com.example.admin.bitmapanimation.util

import android.content.Context
import android.graphics.*
import android.support.constraint.solver.widgets.Rectangle
import android.view.View
import com.example.admin.bitmapanimation.R

class Animate(context: Context): View(context)
{
    var bm : Bitmap? = null
    var xPos: Float = 0.0f
    var yPos: Float = 0.0f

    var xAdd: Float = 10.0f
    var yAdd: Float = 10.0f

    init {
        bm = BitmapFactory.decodeResource(resources, R.drawable.dalo_name)
        xPos = 0.0f
        yPos = 0.0f
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        //canvas.drawRect(rectangle, pa)

        if(xPos <0 || xPos > canvas?.width!!-50)
            xAdd *= (-1)

        xPos += xAdd

        if(yPos <0 || yPos > canvas?.height!!-50)
            yAdd *= (-1)

        yPos += yAdd

        canvas?.drawBitmap(bm, xPos, yPos, Paint())
        invalidate()
    }
}
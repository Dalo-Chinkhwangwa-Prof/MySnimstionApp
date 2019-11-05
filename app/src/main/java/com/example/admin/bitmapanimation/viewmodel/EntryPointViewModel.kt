package com.example.admin.bitmapanimation.viewmodel

import android.app.Activity
import android.content.Intent
import android.databinding.BaseObservable
import android.databinding.Bindable
import android.widget.FrameLayout
import android.widget.ImageView
import com.example.admin.bitmapanimation.BR
import com.example.admin.bitmapanimation.R
import com.example.admin.bitmapanimation.util.Animate
import com.example.admin.bitmapanimation.view.FragmentA
import com.example.admin.bitmapanimation.view.FragmentB

class EntryPointViewModel(activity: Activity, greeting: String?): BaseObservable() {

    /*private var bitMap: Bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
    private var timer: Timer = Timer()
    private var xPos: Int = 0
    private var yPos: Int = 0
    */

    private var animate: Animate?= null
    private var x  = 0
    private var frameLayout: FrameLayout? = null
    private var activity = activity
    @get:Bindable
    var entryTextGreeting : String? = "Default String"
    set(entryTextGreeting) {
        field = entryTextGreeting
        notifyPropertyChanged(BR.entryTextGreeting)
    }

    init {
        var imageView:ImageView = activity.findViewById(R.id.imageViewId)
        frameLayout = activity.findViewById(R.id.frameLayoutID)
        entryTextGreeting = greeting

        //creating the bitmap
        /*
        bitMap.eraseColor(Color.BLUE)// setting the color to Blue
        imageView.setImageBitmap(bitMap)

        val timer = Timer()
        timer.schedule(timerTask { update(2) }, 0, 1000)*/

        //animating the bitmap
        //animate = Animate(activity)
        //activity.setContentView(animate)
    }

    /*fun update( x : Int)
    {
        //Log.d("XXX: ", ""+x)
        entryTextGreeting = entryTextGreeting + " a "

    }*/

    fun onFragmentA()
    {
        //Log.d("Fragments: ", "A")
        activity.fragmentManager.beginTransaction().replace(R.id.frameLayoutID, FragmentA()).commit()
        var intent = Intent(activity.applicationContext, Kobi::class.java)
        activity.startActivity(intent)
    }

    fun onFragmentB()
    {
        activity.fragmentManager.beginTransaction().replace(R.id.frameLayoutID, FragmentB()).commit()
        //Log.d("Fragments: ", "B")
    }
}
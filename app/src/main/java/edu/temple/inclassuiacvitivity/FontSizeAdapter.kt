package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class FontSizeAdapter(private val context : Context, private val fontSizes :Array<Int>): BaseAdapter() {
    override fun getCount(): Int { //You can shorten it to 'override fun getCount() = fontSizes.size'
        return fontSizes.size
    }

    override fun getItem(p0: Int): Any {
        return fontSizes[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val textView : TextView

        if(p1 != null) {
            textView = p1 as TextView
        } else {
            textView = TextView(context)
        }

        textView.text = fontSizes[p0].toString()
        textView.textSize = fontSizes[p0].toFloat()
        textView.setPadding(5,10,0,10)


        return textView

    }
}
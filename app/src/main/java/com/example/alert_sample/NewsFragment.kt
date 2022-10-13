package com.example.alert_sample

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.ImageButton
import androidx.fragment.app.DialogFragment

class NewsFragment : DialogFragment(){
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = Dialog(this.requireActivity())

        dialog.window!!.requestFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.fragment_news)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setCanceledOnTouchOutside(false)

        dialog.findViewById<ImageButton>(R.id.imgBtnNews)
            .setOnClickListener{
                dismiss()
            }
        dialog.findViewById<ImageButton>(R.id.imgBtnClose)
            .setOnClickListener{
                dismiss()
            }
        return dialog
    }
}
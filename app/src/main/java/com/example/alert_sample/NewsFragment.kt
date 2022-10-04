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
        Log.d("LOG_01F","onCreateDialog_NewsFragment")
        val dialog = Dialog(this.requireActivity())
        Log.d("LOG_02F","val_dialog_NewsFragment")

        dialog.window!!.requestFeature(Window.FEATURE_NO_TITLE)
//        dialog.window!!.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN)
        dialog.setContentView(R.layout.fragment_news)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setCanceledOnTouchOutside(false)
        Log.d("LOG_03F","dialog_setContentView_NewsFragment")

        dialog.findViewById<ImageButton>(R.id.imgBtnNews)
            .setOnClickListener{
                dismiss()
                Log.d("LOG_04F","dismiss_btnImage_NewsFragment")
            }
        dialog.findViewById<ImageButton>(R.id.imgBtnClose)
            .setOnClickListener{
                dismiss()
                Log.d("LOG_04'F","dismiss_btnX_NewsFragment")
            }
        return dialog
        Log.d("LOG_05F","return_dialog_NewsFragment")

    }
}
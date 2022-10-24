package com.example.alert_sample

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import androidx.fragment.app.DialogFragment
import com.example.alert_sample.databinding.FragmentNewsBinding

class NewsFragment : DialogFragment(){
    private lateinit var binding: FragmentNewsBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = Dialog(this.requireActivity())
        binding = FragmentNewsBinding.inflate(layoutInflater)

        dialog.window!!.requestFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(binding.root)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setCanceledOnTouchOutside(false)

        binding.imgBtnNews.setOnClickListener{
                dismiss()
            }
        binding.imgBtnClose.setOnClickListener{
                dismiss()
            }
        return dialog
    }
}
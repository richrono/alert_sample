package com.example.alert_sample

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment

class NewsFragment : DialogFragment(){

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = Dialog(this.requireActivity())

        dialog.window!!.requestFeature(Window.FEATURE_NO_TITLE)
        dialog.window!!.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN)
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



//class NewsFragment : Fragment() {
//    //    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        val args = arguments
////    }
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?,
//    ): View {
//        super.onCreateView(inflater, container, savedInstanceState)
//        return inflater.inflate(R.layout.fragment_news, container, false)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        view.findViewById<Button>(R.id.imgBtnNews).setOnClickListener {
//
//        }
//        view.findViewById<Button>(R.id.imgBtnClose).setOnClickListener {
//
//        }
//    }
//}
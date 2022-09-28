package com.example.alert_sample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//ボタン１つめ
        val btnAlertDialog: Button = findViewById(R.id.btnAlert)

        btnAlertDialog.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("タイトル")
                .setMessage("内容")
                .setNegativeButton("閉じる",null)
                .setCancelable(false)
                .show()
        }

////ボタン２め
//        val btnAlertFragment: Button = findViewById(R.id.btnFragment)
//        val customLayout = layoutInflater.inflate(R.layout.dialog_img, null)
////        val btnDismissAlertDialog: Button = findViewById(R.id.alertDismiss)
//
//        btnAlertFragment.setOnClickListener {
//            AlertDialog.Builder(this)
//                .setView(customLayout)
//                .setCancelable(false)
//                .setNegativeButton("閉じる",findViewById(R.id.alertDismiss))
//                .show()
////                .setOnDismissListener(findViewBy¸Id(R.id.alertDismiss))
//        }
////        btnDismissAlertDialog.setOnClickListener {
////            onDismiss(DialogFragment())
////        }
//    }
////    fun onDismiss(dialogFragment: DialogFragment) {}
//
////    private fun onDismiss(mainActivity: MainActivity) {
////
////    }

//ボタン２つめ作り直し
//val btnAlertFragment: Button = findViewById(R.id.btnFragment)
//    val customLayout = layoutInflater.inflate(R.layout.dialog_img, null)
////        val btnDismissAlertDialog: Button = findViewById(R.id.alertDismiss)
//
//    btnAlertFragment.setOnClickListener {
//        AlertDialog.Builder(this)
//            .setView(customLayout)
//            .setCancelable(false)
//            .setNegativeButton("閉じる",findViewById(R.id.alertDismiss))
//            .show()
////                .setOnDismissListener(findViewBy¸Id(R.id.alertDismiss))
//    }
////        btnDismissAlertDialog.setOnClickListener {
////            onDismiss(DialogFragment())
////        }
//}
////    fun onDismiss(dialogFragment: DialogFragment) {}
//
////    private fun onDismiss(mainActivity: MainActivity) {
////
////    }

////ボタンなし
////    val customLayout = layoutInflater.inflate(R.layout.dialog_img, null)
////        val btnDismissAlertDialog: Button = findViewById(R.id.alertDismiss)
//        AlertDialog.Builder(this,R.style.ImageAlertDialog)
////            .setView(customLayout)
//            .setCancelable(false)
//            .setNegativeButton(" ",null)
//            .show()
////            .setOnCancelListener(findViewById(R.id.alertDismiss))
////            .getButton(findViewById(R.id.alertDismiss))
////        setFinishOnTouchOutside(true)

//ボタン無し改
        AlertDialog.Builder(this,R.style.ImageAlertDialog)
            .setCancelable(false)
            .setNegativeButton(" ",null)
            .show()
//ボタン有り（２つめ）
        val btnAlertFragment: Button = findViewById(R.id.btnFragment)
        btnAlertFragment.setOnClickListener {
            AlertDialog.Builder(this, R.style.ImageAlertDialog)
                .setCancelable(false)
                .setNegativeButton(" ", null)
                .show()
        }
    }
}

//findViewById(R.id.alertDismiss)

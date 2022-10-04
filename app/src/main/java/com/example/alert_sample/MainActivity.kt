package com.example.alert_sample

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("LOG_01A","onCreate_MainActivity")
        super.onCreate(savedInstanceState)
        Log.d("LOG_02A","super.onCreate_MainActivity")
        setContentView(R.layout.activity_main)
        Log.d("LOG_03A","setContentView_MainActivity")

//ボタン無し　アプリ起動時に自動で表示されるフラグメント（fragment_news.xmlにてレイアウト）
        val dialog = NewsFragment()
        Log.d("LOG_04A","dialog=NewsFragment()_MainActivity")

        val data: SharedPreferences = getSharedPreferences("NewsShowed", Context.MODE_PRIVATE)

        val dataBoolean = data.getBoolean("NewsShowedBoolean", false)
        Log.d("LOG_05A","getBoolean_MainActivity")

        Log.d("LOG_06A","if_MainActivity")
        if (!dataBoolean) {
            Log.d("LOG_07A","(if==true)_MainActivity")
            dialog.show(supportFragmentManager, "")
            val editor = data.edit()
            editor.putBoolean("NewsShowedBoolean", true)
            editor.apply()
        }else {
            Log.d("LOG_08A", "(if==false)_MainActivity")
        }

//ボタン１つめ　上のボタンを押すと表示される純粋なダイアログサンプル
        val btnAlertDialog: Button = findViewById(R.id.btnAlert)
        Log.d("LOG_09A","val_btnFirst_MainActivity")

        btnAlertDialog.setOnClickListener {
            Log.d("LOG_10A","btnAlertDialog_MainActivity")
            AlertDialog.Builder(this)
                .setTitle("タイトル")
                .setMessage("内容")
                .setNegativeButton("閉じる", null)
                .setCancelable(false)
                .show()
            Log.d("LOG_11A","dialog.show_btnFirst_MainActivity")
        }

//ボタン２つめ　下のボタンを押すと表示されるダイアログ（theme.xmlにてデザインをカスタマイズ(上記と同一部品)）
        val btnAlertFragment: Button = findViewById(R.id.btnFragment)
        btnAlertFragment.setOnClickListener {
            AlertDialog.Builder(this, R.style.ImageAlertDialog)
                .setCancelable(false)
                .setNegativeButton(" ", null)
                .show()
            Log.d("LOG_12A","dialog.show_btnSecond_MainActivity")
        }

//ボタン３つめ　起動時の自動表示フラグメントを呼び出す
        val btnThird: Button = findViewById(R.id.btnThird)
        btnThird.setOnClickListener {
            dialog.show(supportFragmentManager, "")
            Log.d("LOG_13A","dialog.show_btnThird_MainActivity")
        }
    }
}
package com.example.alert_sample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//ボタン無し　アプリ起動時に自動で表示されるフラグメント（fragment_news.xmlにてレイアウト）
        val dialog = NewsFragment()
        dialog.show(supportFragmentManager, "")

//ボタン１つめ　上のボタンを押すと表示される純粋なダイアログサンプル
        val btnAlertDialog: Button = findViewById(R.id.btnAlert)
        btnAlertDialog.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("タイトル")
                .setMessage("内容")
                .setNegativeButton("閉じる", null)
                .setCancelable(false)
                .show()
        }

//ボタン２つめ　下のボタンを押すと表示されるダイアログ（theme.xmlにてデザインをカスタマイズ(上記と同一部品)）
        val btnAlertFragment: Button = findViewById(R.id.btnFragment)
        btnAlertFragment.setOnClickListener {
            AlertDialog.Builder(this, R.style.ImageAlertDialog)
                .setCancelable(false)
                .setNegativeButton(" ", null)
                .show()
        }

//ボタン３つめ　起動時の自動表示フラグメントを呼び出す
        val btnThird: Button = findViewById(R.id.btnThird)
        btnThird.setOnClickListener {
            dialog.show(supportFragmentManager, "")
        }
    }
}
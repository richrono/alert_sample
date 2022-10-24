package com.example.alert_sample

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.alert_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//ボタン無し　アプリ起動時に自動で表示されるフラグメント（fragment_news.xmlにてレイアウト）
        val dialog = NewsFragment()
        val data: SharedPreferences = getSharedPreferences("NewsShowed", Context.MODE_PRIVATE)
        val dataBoolean = data.getBoolean("NewsShowedBoolean", false)
        if (!dataBoolean) {
            dialog.show(supportFragmentManager, "")
            val editor = data.edit()
            editor.putBoolean("NewsShowedBoolean", true)
            editor.apply()
        }

//ボタン１つめ　上のボタンを押すと表示される純粋なダイアログサンプル
        binding.btnFirst.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("タイトル")
                .setMessage("内容")
                .setNegativeButton("閉じる", null)
                .setCancelable(false)
                .show()
        }

//ボタン２つめ　下のボタンを押すと表示されるダイアログ（theme.xmlにてデザインをカスタマイズ(上記と同一部品)）
        binding.btnSecond.setOnClickListener {
            AlertDialog.Builder(this, R.style.ImageAlertDialog)
                .setCancelable(false)
                .setNegativeButton(" ", null)
                .show()
        }

//ボタン３つめ　起動時の自動表示フラグメントを呼び出す
        binding.btnThird.setOnClickListener {
            dialog.show(supportFragmentManager, "")
        }
    }
}
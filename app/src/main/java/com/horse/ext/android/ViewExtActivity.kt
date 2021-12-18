package com.horse.ext.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.horse.ext.android.ext.setOnClickListener
import com.horse.ext.android.ext.show

class ViewExtActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_ext)
        findViewById<Button>(R.id.btn_goneView).setOnClickListener {
            it.show(false)
        }
        setOnClickListener<Button>(R.id.btn_set_listener){
            Toast.makeText(this,"设置监听成功",Toast.LENGTH_LONG).show()
        }
    }
}
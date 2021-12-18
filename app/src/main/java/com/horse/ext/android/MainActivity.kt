package com.horse.ext.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ananananzhuo.mvvm.activity.CustomAdapterActivity
import com.ananananzhuo.mvvm.bean.bean.ItemData

class MainActivity : CustomAdapterActivity() {
    override fun getAdapterDatas(): MutableList<ItemData> = mutableListOf(
        ItemData(title = "View的显示隐藏"){
            startActivity(Intent(this,ViewExtActivity::class.java))
        }
    )

    override fun showFirstItem(): Boolean =true

}
package com.horse.ext.android.ext

import android.app.Activity
import android.content.res.Resources
import android.view.View
import java.lang.Math.round
import kotlin.math.roundToInt

/**
 * author  :mayong
 * function:View类扩展方法
 * date    :2021/10/23
 **/

/**
 * View的显示隐藏 true：显示  false：隐藏
 */
fun View.show(shouldShow: Boolean) {
    visibility = if (shouldShow) {
        View.VISIBLE
    } else {
        View.GONE
    }
}

/**
 * View是否可见
 */
fun View.isVisible() = visibility == View.VISIBLE


val Int.dp get() = (toFloat() * Resources.getSystem().displayMetrics.density).roundToInt()

/**
 * 设置点击事件,并返回控件引用
 */
inline fun <T : View> Activity.setOnClickListener(
    id: Int,
    noinline listener: (v: View) -> Unit
): T {
    val view = findViewById<T>(id)
    view.setOnClickListener {
        listener(view)
    }
    return view
}


/**
 * 设置点击事件,无泛型
 */
fun Activity.setOnClickListener1(id: Int,  listener: (v: View) -> Unit): View {
    val view = findViewById<View>(id)
    view.setOnClickListener {
        listener(view)
    }
    return view
}
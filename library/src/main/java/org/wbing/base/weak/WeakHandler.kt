package org.wbing.base.weak

import android.os.Handler
import android.os.Looper
import android.os.Message

import java.lang.ref.WeakReference

/**
 * 若引用的handler，用来解决内存泄漏
 * 原理解析：当act或frag被销毁的时候，如果handler在执行任务，
 * 由于handler持有外部类的强引用，导致无法正确销毁，如果持有弱引用则无此问题。
 */
class WeakHandler(looper: Looper, callback: Handler.Callback) : Handler(looper) {

    private val callback: WeakReference<Handler.Callback> = WeakReference(callback)

    override fun handleMessage(msg: Message) {
        val call = this.callback.get()
        call?.handleMessage(msg)
    }
}

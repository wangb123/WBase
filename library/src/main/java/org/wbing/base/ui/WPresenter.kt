package org.wbing.base.ui

/**
 * presenter抽象
 */
interface WPresenter<View : WView<*>> {
    /**
     * 当view添加时调用
     */
    fun attachView(view: View)

    /**
     * 当View移除时调用
     */
    fun detachView()
}
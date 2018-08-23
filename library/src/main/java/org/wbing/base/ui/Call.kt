package org.wbing.base.ui

interface Call<Param, Result> {
    fun call(param: Param): Result
}

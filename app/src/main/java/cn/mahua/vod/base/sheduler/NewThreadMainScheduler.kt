package com.github.StormWyrm.wanandroid.base.sheduler

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by xuhao on 2017/11/17.
 * desc:
 */


class NewThreadMainScheduler<T> private constructor() :
    BaseScheduler<T>(Schedulers.newThread(), AndroidSchedulers.mainThread())

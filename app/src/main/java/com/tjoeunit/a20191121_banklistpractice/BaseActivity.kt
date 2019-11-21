package com.tjoeunit.a20191121_banklistpractice

import androidx.appcompat.app.AppCompatActivity


abstract class BaseActivity : AppCompatActivity() {

    var mContext = this

    abstract fun setupEvents()
    abstract fun setValues()

}
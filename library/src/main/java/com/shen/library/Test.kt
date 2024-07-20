package com.shen.library

import android.util.Log
import androidx.core.os.BuildCompat

fun print(msg:String){
    Log.d("my library", "print: $msg")
}
public class TestLib{
    object instance{
        fun printMsg(msg: String){
            print(msg )
        }
    }
}
package com.example.myalgorithms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.math.BigDecimal


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusMinus(arrayOf(-2, -3, 5, -3, 0, -1, -5, 0, 9, 7))
    }

    fun plusMinus(arr: Array<Int>): Unit {
        var positive: Float = 0F
        var negative: Float = 0F
        var zero: Float = 0F

        arr.forEach {
            when {
                it > 0 -> positive++
                it < 0 -> negative++
                else -> zero++
            }
        }
        val positiveResult = BigDecimal(positive.div(arr.size)
        var array = arrayOf() , BigDecimal(negative.div(arr.size)), BigDecimal(zero.div(arr.size)))
        Log.e(
            localClassName,
            "${array[0]}${array[1]}${array[2]}"
        )

    }


}

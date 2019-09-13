package com.example.myalgorithms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diagonalDifference(arrayOf(arrayOf(11, 2, 4), arrayOf(4, 5, 6), arrayOf(10, 8, -12)))
    }


    fun diagonalDifference(arr: Array<Array<Int>>): Int {
        var result = 0
        for (i in arr.indices step 2) {
            for (j in 0 until 3 step 2) {
                if (i % 2 == 0 && j % 2 == 0)
                    result += arr[i][j]
                else
                    result -= arr[i][j]
            }
        }
        return result
    }

}

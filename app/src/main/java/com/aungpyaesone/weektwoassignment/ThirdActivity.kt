package com.aungpyaesone.weektwoassignment

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    companion object{
        fun newIntent(context:Context):Intent{
            return Intent(context,ThirdActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        imgBackArrow.setOnClickListener {
            finish()
        }

    }
}

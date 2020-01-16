package com.aungpyaesone.weektwoassignment

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*
import java.io.Serializable

class SecondActivity : AppCompatActivity() {

    companion object{
        const val IE_DATA_FROM_MAIN_NAME = "IE_DATA_FROM_MAIN_NAME"
        const val IE_DATA_FROM_MAIN_EMAIL = "IE_DATA_FROM_MAIN_EMAIL"
        const val IE_DATA_FROM_MAIN_PHONE = "IE_DATA_FROM_MAIN_PHONE"
        fun newIntent(context:Context,name:String,email:String,phno:String): Intent {
            val intent = Intent(context,SecondActivity::class.java)
           // intent.putExtra(IE_DATA_FROM_MAIN,data as Serializable)
            intent.putExtra(IE_DATA_FROM_MAIN_NAME,name)
            intent.putExtra(IE_DATA_FROM_MAIN_EMAIL,email)
            intent.putExtra(IE_DATA_FROM_MAIN_PHONE,phno)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //val user = intent.extras?.get(IE_DATA_FROM_MAIN) as User
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener {
            finish()
        }
        setUpData()

        ivTheFlashMovie.setOnClickListener {
            startActivity(ThirdActivity.newIntent(this))
        }


    }
    fun setUpData(){
        val name = intent.getStringExtra(IE_DATA_FROM_MAIN_NAME)
        val email = intent.getStringExtra(IE_DATA_FROM_MAIN_EMAIL)
        val phno = intent.getStringExtra(IE_DATA_FROM_MAIN_PHONE)

        tvName.text = name
        tvEmail.text = email
        tvPhone.text = phno
    }

}

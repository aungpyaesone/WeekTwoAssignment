package com.aungpyaesone.weektwoassignment

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
       /* fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }*/
        btnContinue.setOnClickListener {
            if(checkValidation())
            {
               /* val data = User(etName.text.toString(),
                                etEmail.text.toString(),
                                etPhoneNumber.text.toString(),
                                etPassword.text.toString(),
                                etConfirmPassword.text.toString())*/
                startActivity(SecondActivity.newIntent(this,etName.text.toString(),etEmail.text.toString(),etPhoneNumber.text.toString()))
            }
        }
    }

    private fun checkValidation():Boolean {
        when {
            etName.text.toString().equals("")->
            {etName.setError("required")
             return false}
            etEmail.text.toString().equals("")->{
                etEmail.setError("Requried")
                return false
            }
            etPhoneNumber.text.toString().equals("")->
            {
                etPhoneNumber.setError("Required")
                return false
            }
            etPassword.text.toString().equals("")->
            {
                etPassword.setError("Required")
                return false
            }
            etConfirmPassword.text.toString().equals("")->
            {
                etConfirmPassword.setError("Required")
                return false
            }
            else -> return true
        }
    }

    /* override fun onCreateOptionsMenu(menu: Menu): Boolean {
         // Inflate the menu; this adds items to the action bar if it is present.
         menuInflater.inflate(R.menu.menu_main, menu)
         return true
     }

     override fun onOptionsItemSelected(item: MenuItem): Boolean {
         // Handle action bar item clicks here. The action bar will
         // automatically handle clicks on the Home/Up button, so long
         // as you specify a parent activity in AndroidManifest.xml.
         return when (item.itemId) {
             R.id.action_settings -> true
             else -> super.onOptionsItemSelected(item)
         }
     }*/
}

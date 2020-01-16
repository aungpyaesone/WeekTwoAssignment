package com.aungpyaesone.weektwoassignment

import java.io.Serializable

data class User(var name:String, var email:String,var phoneNo:String,
                var password:String, var confirmPassword:String): Serializable{
}
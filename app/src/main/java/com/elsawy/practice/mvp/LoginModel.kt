package com.elsawy.practice.mvp

import com.elsawy.practice.mvp.ContractInterface.Model

class LoginModel : Model {

   private val users = listOf(
      User("Ahmed", "ahmed@gmail.com", "1234"),
      User("Ali", "ali@gmail.com", "1234"),
      User("Sami", "sami@gmail.com", "1234"),
      User("Khaled", "khaled@gmail.com", "1234"),
      User("Mohamed", "mohamed@gmail.com", "1234"),
      User("Sayed", "sayed@gmail.com", "1234"),
   )

   private var result: String = ""

   override fun login(email: String, password: String) { //: Result
      result = users.find { user -> user.email == email && user.password == password }
         ?.let {
            "Welcome ${it.name}"
         }
         ?: run {
            // execute this block if null
            "wrong email or password, please try again!!"
         }
   }

   override fun getResult(): String {
      return result
   }

}
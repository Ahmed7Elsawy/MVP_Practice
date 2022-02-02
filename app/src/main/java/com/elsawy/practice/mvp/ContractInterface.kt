package com.elsawy.practice.mvp

interface ContractInterface {

   interface Model {
      fun login(email: String, password: String)
      fun getResult(): String
   }

   interface LoginView {
      fun initView()
      fun showMessage()
   }

   interface Presenter {
      fun login(email: String, password: String)
      fun getMessage():String
   }

}


package com.elsawy.practice.mvp

import com.elsawy.practice.mvp.ContractInterface.*

class LoginPresenter(private val view: LoginView) : Presenter {

   private var model: Model = LoginModel()

   init {
      view.initView()
   }

   override fun login(email: String, password: String) {
      model.login(email, password)
      view.showMessage()
   }

   override fun getMessage(): String {
      return model.getResult()
   }

}
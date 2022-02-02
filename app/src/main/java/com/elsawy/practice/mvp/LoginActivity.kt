package com.elsawy.practice.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elsawy.practice.mvp.ContractInterface.LoginView
import com.elsawy.practice.mvp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), LoginView {
   private lateinit var binding: ActivityLoginBinding
   private lateinit var loginPresenter: LoginPresenter
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      binding = ActivityLoginBinding.inflate(layoutInflater)
      setContentView(binding.root)

      loginPresenter = LoginPresenter(this)
   }

   override fun initView() {
      binding.login.setOnClickListener {
         loginPresenter.login(
            binding.email.text.toString(),
            binding.password.text.toString()
         )
      }
   }

   override fun showMessage() {
      binding.message.text = loginPresenter.getMessage()
   }
}
package com.neppplus.loginlogictest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

//            1. 입력한 아이디 / 비번을 추출. (변수 저장)
            val inputId = idEdt.text.toString()
            val inputPw = passwordEdt.text.toString()

//            2. 아이디와 비번 검사.

            if (inputId == "admin" && inputPw == "qwer") {
//                로그인 성공
                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
            }
            else {
//                로그인 실패. (위의 경우가 아니면 모두 실패)
                Toast.makeText(this, "로그인에 실패했습니다.", Toast.LENGTH_SHORT).show()
            }


        }

    }

}
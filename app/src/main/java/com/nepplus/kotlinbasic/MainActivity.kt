package com.nepplus.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 본인의 이름을 변수 (myName)에 담고, 로그로 출력
        var myName = "조경진"
        myName = "조진경"
        Log.d("이름출력-변수활용", myName)


        // 한 사용자의 나이를 17살이라고 저장
        val userAge = 10

        // 이 사용자가 성인인가? : 나이가 20살 이상인가?
        if (userAge >= 20) {
            //if {} 내부의 질문 결과가 true일 때만 실행됨
            Log.d("if문예시", "성인이 맞습니다")
        }
        else if (userAge >= 17) {
            // 20살 미만이면서 17살 이상인 경우,
            Log.d("if문예시","고등학생입니다")
        }
        else if (userAge >= 14) {
            Log.d("if문예시", "중학생입니다")
        }
        else {
            Log.d("if문예시", "초등학생 or 미취학아동입니다")
        }


    }

}



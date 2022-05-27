package com.example.kakaopractice.test

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        KakaoSdk.init(this, "2987a737f843713360586810d1e79cf5")
    }
}
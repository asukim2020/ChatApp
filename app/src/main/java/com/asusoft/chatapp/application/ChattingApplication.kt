package com.asusoft.chatapp.application

import android.app.Application
import android.content.Context
import com.asusoft.chatapp.util.objects.CalculatorUtil
import com.asusoft.chatapp.util.objects.PreferenceManager
import io.realm.Realm

class ChattingApplication: Application() {
    companion object {

        lateinit var instance: ChattingApplication
        const val THROTTLE = 1000L

        fun getContext(): Context {
            return instance.baseContext
        }
    }

    override fun onCreate() {
        super.onCreate()

        instance = this

        // Realm 초기화
        Realm.init(this)

        // Util 초기화
        PreferenceManager.setApplicationContext(this)
        CalculatorUtil.setContext(this)
    }

}
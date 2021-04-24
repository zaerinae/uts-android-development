package com.zaerina.uts_18090095.activity.login

import com.zaerina.uts_18090095.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}
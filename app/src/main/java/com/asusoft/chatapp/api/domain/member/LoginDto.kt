package com.asusoft.chatapp.api.domain.member

class LoginDto(
    var id: String?,
    var pw: String?
) {
    override fun toString(): String {
        return "LoginDto(id=$id, pw=$pw)"
    }
}
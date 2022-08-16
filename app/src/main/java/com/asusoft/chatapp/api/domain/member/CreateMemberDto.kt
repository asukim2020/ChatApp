package com.asusoft.chatapp.api.domain.member

class CreateMemberDto(
    var name: String?,
    var id: String?,
    var pw: String?
) {
    override fun toString(): String {
        return "CreateMemberDto(name=$name, id=$id, pw=$pw)"
    }
}
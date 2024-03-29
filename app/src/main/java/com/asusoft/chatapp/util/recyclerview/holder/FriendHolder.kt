package com.asusoft.chatapp.util.recyclerview.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.asusoft.chatapp.R
import com.asusoft.chatapp.util.api.domain.member.MemberReadDto
import com.asusoft.chatapp.util.extension.imageLoad
import com.asusoft.chatapp.util.recyclerview.RecyclerViewAdapter
import com.bumptech.glide.Glide

class FriendHolder(
    private val view: View
): RecyclerView.ViewHolder(view) {
    fun bind(
        position: Int,
        adapter: RecyclerViewAdapter
    ) {
        val item = adapter.list[position] as? MemberReadDto ?: return

        val tv = view.findViewById<TextView>(R.id.tv)
        tv.text = item.name

        val iv = view.findViewById<ImageView>(R.id.iv)

        iv.imageLoad(view, item.profileUrl, R.drawable.ic_person_24)
    }
}
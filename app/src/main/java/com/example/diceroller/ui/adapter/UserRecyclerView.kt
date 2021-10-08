package com.example.diceroller.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.diceroller.R
import com.example.diceroller.moodel.user

class UserRecyclerView : RecyclerView.Adapter<UserRecyclerView.UserViewHolder>() {

    var userList:ArrayList<user> = ArrayList()

    fun setList(userList: ArrayList<user>){
        this.userList=userList
        notifyDataSetChanged()
    }

   inner class  UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var iv_userImage:ImageView=itemView.findViewById(R.id.iv_item_userimage)
        var iv_userName:TextView=itemView.findViewById(R.id.tv_item_username)
        var iv_message:TextView=itemView.findViewById(R.id.tv_item_message)

       fun bind (User:user){
        iv_userImage.setImageResource(User.imageId)
           iv_userName.text=User.name
           iv_message.text=User.massage
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
      var view:View = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return UserViewHolder(view)

    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

      var User:user =userList.get(position)
        holder.bind(User)

    }

    override fun getItemCount(): Int {
        return userList.size
    }
}
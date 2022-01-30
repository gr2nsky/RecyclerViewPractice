package com.greensky0526.recyclerviewpractice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PhoneBookListAdapter(var persons: ArrayList<Person>) :
    RecyclerView.Adapter<PhoneBookListAdapter.ViewHolder>() {
    var TAG = "PhoneBookListAdapter"

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var iv_person_phone_book_list_item: ImageView = itemView.findViewById(R.id.iv_person_phone_book_list_item)
        var tv_name_phone_book_list_item: TextView = itemView.findViewById(R.id.tv_name_phone_book_list_item)
        var tv_phone_number_phone_book_list_item: TextView = itemView.findViewById(R.id.tv_phone_number_phone_book_list_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val con = parent.context
        val inflater = con.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.item_phonebook, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val person: Person = persons.get(position)
        //[수정요함] 이미지 작업의 경우 glide를 사용해 server의 image를 불러올 것
        //holder.iv_person_phone_book_list_item
        holder.tv_name_phone_book_list_item.text = person.name
        holder.tv_phone_number_phone_book_list_item.text = person.phoneNumber
    }

    override fun getItemCount(): Int {
        return persons.size
    }
}
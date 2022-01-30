package com.greensky0526.recyclerviewpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {

    lateinit var rv_phone_book: RecyclerView
    lateinit var phoneBookListAdapter: PhoneBookListAdapter
    lateinit var persons:ArrayList<Person>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_phone_book = findViewById(R.id.rv_phone_book)

        persons = tempPersons()
        setAdapter()
    }

    fun setAdapter(){
        //리사이클러뷰에 리사이클러뷰 어댑터 부착
        rv_phone_book.layoutManager = LinearLayoutManager(this)
        phoneBookListAdapter = PhoneBookListAdapter(persons)
        rv_phone_book.adapter = phoneBookListAdapter
    }

    fun tempPersons(): ArrayList<Person>{
        var persons = ArrayList<Person>()

        var p1 = Person(1, "kim", "01011111111")
        var p2 = Person(2, "lee", "01022222222")
        var p3 = Person(3, "park", "01033333333")
        var p4 = Person(4, "son", "01044444444")
        var p5 = Person(5, "hwang", "01055555555")
        var p6 = Person(6, "jo", "01066666666")
        var p7 = Person(7, "gwak", "01077777777")
        var p8 = Person(8, "sim", "01088888888")
        var p9 = Person(9, "choi", "01099999999")

        return persons
    }
}
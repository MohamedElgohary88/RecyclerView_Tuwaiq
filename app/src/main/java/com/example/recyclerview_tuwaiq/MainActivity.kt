package com.example.recyclerview_tuwaiq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
data()
    }

    fun data (){
        val array:ArrayList<Person> = ArrayList()
        array.add(Person("Ahmed", R.drawable.person))
        array.add(Person("Ahmed", R.drawable.person))
        array.add(Person("Ahmed", R.drawable.person))
        array.add(Person("Ahmed", R.drawable.person))
        array.add(Person("Ahmed", R.drawable.person))
        array.add(Person("Ahmed", R.drawable.person))
        array.add(Person("Ahmed", R.drawable.person))
        array.add(Person("Ahmed", R.drawable.person))
        array.add(Person("Ahmed", R.drawable.person))
        array.add(Person("Ahmed", R.drawable.person))
        array.add(Person("Ahmed", R.drawable.person))

        val customAdapter:CustomAdapter = CustomAdapter(array)

        recycler?.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        recycler?.adapter = customAdapter
    }
}
package com.example.myapplication3


import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication3.REPOZITORY.list
import java.nio.file.Files.list


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val listId = intent.getIntExtra("FILES_LIST",0)
        val textView5 = findViewById<View>(R.id.textView5) as TextView
        val textView3 = findViewById<View>(R.id.textView3) as TextView
        val textView4 = findViewById<View>(R.id.textView4) as TextView
        val book  = REPOZITORY.list[listId]
        textView5.text = book.name
        textView3.text = book.Auther
        textView4.text = book.year
    }
}
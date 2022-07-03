package ru.alexanderklimov.recyclerviewdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication3.MainActivity2
import com.example.myapplication3.R
import com.example.myapplication3.REPOZITORY
import com.example.myapplication3.book

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomRecyclerAdapter(getBookList(), { s: Int -> opendetails(s) })
    }

    private fun fillList(): List<String> {
        val data = mutableListOf<String>()
        (0..30).forEach { i -> data.add("$i element") }
        return data
    }

    private fun getBookList(): List<book> {
        return REPOZITORY.list
    }

    private fun opendetails(id: Int) {
        val filelist: ArrayList<REPOZITORY> = ArrayList<REPOZITORY>()
        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        intent.putExtra("FILES_LIST", id)
        startActivity(intent)
    }

}



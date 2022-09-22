package com.gauravbora.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView=findViewById<RecyclerView>(R.id.songsList)

       val songsObject:MutableList<Songs> = mutableListOf<Songs>()
       songsObject.add(Songs("Song1","Description1"))
        songsObject.add(Songs("Song2","Description2"))
        songsObject.add(Songs("Song3","Description3"))
        songsObject.add(Songs("Song4","Description4"))
        songsObject.add(Songs("Song5","Description5"))
        songsObject.add(Songs("Song6","Description6"))
        songsObject.add(Songs("Song7","Description7"))
        songsObject.add(Songs("Song8","Description8"))
        songsObject.add(Songs("Song9","Description9"))
        songsObject.add(Songs("Song10","Description10"))
        songsObject.add(Songs("Song11","Description11"))

        val adapter=MyAdapter(songsObject)
        recyclerView.adapter = adapter
       recyclerView.layoutManager=LinearLayoutManager(this)
    }
}






















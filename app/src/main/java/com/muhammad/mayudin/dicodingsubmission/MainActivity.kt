package com.muhammad.mayudin.dicodingsubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvAndroid: RecyclerView
    private val list = ArrayList<Android>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(supportActionBar != null){
            supportActionBar?.subtitle = "Daftar versi Android"
        }

        rvAndroid = findViewById(R.id.rv_android)
        rvAndroid.setHasFixedSize(true)

        list.addAll(AndroidData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvAndroid.layoutManager = LinearLayoutManager(this)
        val listAdapter = ListAndroidAdapter(list)
        rvAndroid.adapter = listAdapter

        listAdapter.setOnItemClickCallback(object : ListAndroidAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Android) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.NAME, data.name)
                intent.putExtra(DetailActivity.RELEASE, data.release)
                intent.putExtra(DetailActivity.API, data.api)
                intent.putExtra(DetailActivity.FEATURE, data.feature)
                intent.putExtra(DetailActivity.PHOTO, data.photo)
                startActivity(intent)
            }

        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_about -> startActivity(Intent(this@MainActivity, AboutActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}
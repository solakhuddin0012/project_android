package com.example.projecttugasandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.projecttugasandroid.R.*
import com.example.projecttugasandroid.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter :FragmentPageAdapter

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tab_layout)
        viewPager2 = findViewById(R.id.viewPager2)

        adapter = FragmentPageAdapter(supportFragmentManager, lifecycle)

        tabLayout.addTab(layout.newTab.setText("First"))
        tabLayout.addTab(layout.newTab.setText("Second"))

        viewPager2. adapter = adapter
        tabLayout.addOnTabSelectedListener(object. OnTabSelectedListener)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(layout.activity_main)
        replacefragment(HomeFragment())

        binding.btnNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                id.navi_home -> replacefragment(HomeFragment())
                id.navi_info -> replacefragment(InfoFragment())

                else -> {}
            }
            true
        }
    }

    private fun replacefragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransient = fragmentManager.beginTransaction()
        fragmentTransient.replace(id.framelayout, fragment)
        fragmentTransient.commit()


    }

    fun OncreateOptionMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_menu, menu)
        return true
    }


    //navigation draw//
    override fun setSupportActionBar(toolbar: Toolbar?) {
        super.setSupportActionBar(toolbar)
        val toggle =actionBarDrawerToggle(this,navigatord)
    }

    }













package org.techtown.livedataapppractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.livedatapratice.FirstFragment
import com.example.livedatapratice.SecondFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.techtown.livedataapppractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val firstFragment by lazy { FirstFragment() }
    private val secondFragment by lazy { SecondFragment() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        changeFragment(firstFragment)
        findViewById<BottomNavigationView>(R.id.bottomNav).setOnItemSelectedListener {
            when(it.itemId){
                R.id.firstfm -> {
                    changeFragment(firstFragment)
                    true
                }
                R.id.secondfm ->{
                    changeFragment(secondFragment)
                    true
                }
                else -> false
            }
        }
    }


    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fm, fragment).commit()

    }
}

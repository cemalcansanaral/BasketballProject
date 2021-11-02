package com.cemalcansanaral.basketballproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.cemalcansanaral.basketballproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var design : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        design = ActivityMainBinding.inflate(layoutInflater)
        setContentView(design.root)

        bottom_nav_transition()
    }

    fun bottom_nav_transition() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(design.bottomNav,navHostFragment.navController)
    }
}
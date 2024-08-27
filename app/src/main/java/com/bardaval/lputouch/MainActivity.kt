package com.bardaval.lputouch

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.bardaval.lputouch.dashboard.DashboardFragment
import com.bardaval.lputouch.happening.HappeningFragment
import com.bardaval.lputouch.navFragemt.AttendenceFragment
import com.bardaval.lputouch.notfication.Notification
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toolbar: Toolbar
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enableEdgeToEdge()

        drawerLayout = findViewById(R.id.drawer_layout)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.dashboard -> {
                    replaceFragment(DashboardFragment())
                    true
                }

                R.id.nav_happening -> {
                    replaceFragment(HappeningFragment())
                    true
                }

                R.id.nav_rms -> {
                    replaceFragment(RMSFragment())
                    true
                }

                R.id.nav_quiz -> {
                    replaceFragment(QuickQuizeFragment())
                    true
                }

                else -> false
            }
        }


        // Set up the custom menu icon
        val customMenuIcon: ImageView = findViewById(R.id.custom_menu_icon)
        customMenuIcon.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        // Set up the notification icon
        val customNotificationIcon: ImageView = findViewById(R.id.notification_icon)
        customNotificationIcon.setOnClickListener {
            // Add your notification handling code here
            val intent=Intent(this,Notification::class.java)
            startActivity(intent)
        }

        // Load default fragment
        if (savedInstanceState == null) {
            replaceFragment(DashboardFragment())
        }
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_attendence -> {
                replaceFragment(AttendenceFragment())
                setToolbarTitle("Attendence")
            }
            R.id.nav_campus -> {
                replaceFragment(CampusTourFragment())
                setToolbarTitle("Campus Tour")
            }
            R.id.nav_fee -> {
                replaceFragment(FeeFragment())
                setToolbarTitle("Fee Payment")
            }
            R.id.nav_document -> {
                replaceFragment(DocumentUploadFragment())
                setToolbarTitle("Documents Upload")
            }
            R.id.nav_doctor -> {
                replaceFragment(DocterAppointmentFragment())
                setToolbarTitle("Appoint ")
            }
            R.id.nav_mess -> {
                replaceFragment(MessFragment())
                setToolbarTitle("Hostel Mess")
            }
            R.id.nav_drivescan -> {
                replaceFragment(DrivescanFragment())
                setToolbarTitle("Drive Attendance ")
            }
            R.id.nav_logout -> {
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
            }

        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun setToolbarTitle(title: String) {
        toolbar.title = title
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}

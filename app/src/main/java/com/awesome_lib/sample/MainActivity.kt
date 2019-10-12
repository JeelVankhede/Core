package com.awesome_lib.sample

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.awesome_lib.core.AbstractBaseActivity
import com.awesome_lib.core.ConnectivityListener
import com.awesome_lib.core.absBuilder
import com.awesome_lib.core.startNewActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AbstractBaseActivity() {
    companion object {
        // Tag for logcat.
        const val TAG = "MainActivity"
    }

    private val mainActivityBinder by lazy {
        return@lazy MainActivityBinder()
    }

    override fun setUpBuilder() = absBuilder {
        contentView = R.layout.activity_main
        abstractBinding = mainActivityBinder
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        observeConnection()
        btn?.setOnClickListener {
            startNewActivity(AnotherActivity::class.java)
        }
    }

    private fun observeConnection() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ConnectivityListener().observe(this, Observer {
                if (it == true) {
                    tv_net_stat?.text = "Successfully connected to network"
//                    showSuccess("Successfully connected to network")
                    Log.e(TAG, "observeConnection : Successfully connected to network")
                } else {
                    tv_net_stat?.text = "Network connection lost !"
//                    showError("Network connection lost !")
                    Log.e(TAG, "observeConnection : Network connection lost !")
                }
            })
        }
    }
}

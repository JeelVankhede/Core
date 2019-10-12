package com.awesome_lib.sample

import android.os.Bundle
import com.awesome_lib.core.AbstractBaseActivity
import com.awesome_lib.core.absBuilder
import com.awesome_lib.core.startNewActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * [AnotherActivity] :
 *
 * @author : Jeel Vankhede
 * @version 1.0.0
 * @since 10/2/2019
 */
class AnotherActivity : AbstractBaseActivity() {
    override fun setUpBuilder() = absBuilder {
        contentView = R.layout.activity_another
        abstractBinding = AnotherActivityBinder()
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        btn?.setOnClickListener {
            startNewActivity(MainActivity::class.java)
        }
    }
}
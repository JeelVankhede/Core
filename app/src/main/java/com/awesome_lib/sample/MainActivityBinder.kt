package com.awesome_lib.sample

import com.awesome_lib.core.AbstractBinding
import com.awesome_lib.sample.databinding.ActivityMainBinding

/**
 * [MainActivityBinder] :
 *
 * @author : Jeel Vankhede
 * @version 1.0.0
 * @since 10/2/2019
 */
class MainActivityBinder : AbstractBinding<ActivityMainBinding>() {
    override fun onCreated() {
        binding?.mainBinder = this
    }

    override fun onDestroy() {

    }
}
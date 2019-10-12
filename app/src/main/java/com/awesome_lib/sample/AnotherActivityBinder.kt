package com.awesome_lib.sample

import com.awesome_lib.core.AbstractBinding
import com.awesome_lib.sample.databinding.ActivityAnotherBinding

/**
 * [AnotherActivityBinder] :
 *
 * @author : Jeel Vankhede
 * @version 1.0.0
 * @since 10/2/2019
 */
class AnotherActivityBinder : AbstractBinding<ActivityAnotherBinding>() {
    override fun onCreated() {
        binding?.binder = this
    }

    override fun onDestroy() {

    }
}
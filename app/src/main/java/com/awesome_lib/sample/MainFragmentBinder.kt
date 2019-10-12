package com.awesome_lib.sample

import com.awesome_lib.core.AbstractBinding
import com.awesome_lib.sample.databinding.FragmentMainBinding

/**
 * [MainFragmentBinder] :
 *
 * @author : Jeel Vankhede
 * @version 1.0.0
 * @since 10/2/2019
 */
class MainFragmentBinder : AbstractBinding<FragmentMainBinding>() {
    override fun onCreated() {
        binding?.fragmentBinder = this
    }

    override fun onDestroy() {
        binding?.fragmentBinder = null
    }
}
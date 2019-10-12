package com.awesome_lib.sample

import android.os.Bundle
import android.view.View
import com.awesome_lib.core.AbstractBaseFragment
import com.awesome_lib.core.absBuilder
import com.awesome_lib.core.showToast

/**
 * [MainFragment] :
 *
 * @author : Jeel Vankhede
 * @version 1.0.0
 * @since 10/2/2019
 */
class MainFragment : AbstractBaseFragment() {
    override fun setUpBuilder() = absBuilder {
        contentView = R.layout.fragment_main
        abstractBinding = MainFragmentBinder()
    }

    override fun onViewReady(view: View, savedInstanceState: Bundle?) {
        super.onViewReady(view, savedInstanceState)
        activity.showToast("Main Fragment")
    }
}
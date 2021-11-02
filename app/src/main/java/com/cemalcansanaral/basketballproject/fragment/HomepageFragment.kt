package com.cemalcansanaral.basketballproject.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.cemalcansanaral.basketballproject.R
import com.cemalcansanaral.basketballproject.adapter.PlayersAdapter
import com.cemalcansanaral.basketballproject.databinding.FragmentHomepageBinding
import com.cemalcansanaral.basketballproject.databinding.PlayersCardDesignBinding
import com.cemalcansanaral.basketballproject.entity.Teams
import com.cemalcansanaral.basketballproject.viewmodel.HomepageFragmentViewModel

class HomepageFragment : Fragment() {
    private lateinit var design : FragmentHomepageBinding
    private lateinit var adapter: PlayersAdapter
    private lateinit var viewModel : HomepageFragmentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        design = DataBindingUtil.inflate(inflater, R.layout.fragment_homepage, container, false)

        viewModel.homepageRvAnim(design)

        viewModel.playersList.observe(viewLifecycleOwner, { playerList ->
            Log.e("Mesaj","Mesaj${playerList.size}")
            adapter = PlayersAdapter(requireContext(),playerList)
            design.playersAdapter = adapter
        })
        return design.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : HomepageFragmentViewModel by viewModels()
        this.viewModel = tempViewModel
    }
}
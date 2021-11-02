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
import androidx.lifecycle.ViewModel
import com.cemalcansanaral.basketballproject.R
import com.cemalcansanaral.basketballproject.adapter.TeamsAdapter
import com.cemalcansanaral.basketballproject.databinding.FragmentTeamsBinding
import com.cemalcansanaral.basketballproject.entity.Teams
import com.cemalcansanaral.basketballproject.viewmodel.TeamsFragmentViewModel

class TeamsFragment : Fragment() {
    private lateinit var design : FragmentTeamsBinding
    private lateinit var adapter : TeamsAdapter
    private lateinit var viewModel : TeamsFragmentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        design = DataBindingUtil.inflate(inflater, R.layout.fragment_teams, container, false)

        viewModel.teamsRvAnim(design)

        viewModel.teamsList.observe(viewLifecycleOwner, { teamList ->
            adapter = TeamsAdapter(requireContext(), teamList)
            design.teamsAdapter = adapter
        })

        return design.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : TeamsFragmentViewModel by viewModels()
        this.viewModel = tempViewModel
    }
}
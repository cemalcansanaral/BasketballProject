package com.cemalcansanaral.basketballproject.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cemalcansanaral.basketballproject.databinding.FragmentHomepageBinding
import com.cemalcansanaral.basketballproject.databinding.FragmentTeamsBinding
import com.cemalcansanaral.basketballproject.entity.Teams
import com.cemalcansanaral.basketballproject.repo.BasketballDaoRepository

class TeamsFragmentViewModel : ViewModel() {
    var teamsList : MutableLiveData<List<Teams>>
    private val bdaor = BasketballDaoRepository()

    init {
        loadTeams()
        teamsList = bdaor.bringTeams()
    }

    fun loadTeams() {
        bdaor.allBringTeams()
    }

    fun teamsRvAnim(design : FragmentTeamsBinding){
        bdaor.teamsRvAnim(design)
    }
}
package com.cemalcansanaral.basketballproject.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cemalcansanaral.basketballproject.databinding.FragmentHomepageBinding
import com.cemalcansanaral.basketballproject.entity.Players
import com.cemalcansanaral.basketballproject.repo.BasketballDaoRepository

class HomepageFragmentViewModel : ViewModel() {
    var playersList = MutableLiveData<List<Players>>()
    private val bdaor = BasketballDaoRepository()

    init {
        loadPlayers()
        playersList = bdaor.bringPlayers()
    }

    fun loadPlayers(){
        bdaor.allBringPlayers()
    }

    fun homepageRvAnim(design : FragmentHomepageBinding){
        bdaor.homePageRvAnim(design)
    }
}
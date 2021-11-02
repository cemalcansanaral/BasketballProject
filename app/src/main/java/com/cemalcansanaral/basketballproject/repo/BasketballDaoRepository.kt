package com.cemalcansanaral.basketballproject.repo

import android.util.Log
import android.view.animation.AnimationUtils
import androidx.lifecycle.MutableLiveData
import com.cemalcansanaral.basketballproject.R
import com.cemalcansanaral.basketballproject.databinding.FragmentHomepageBinding
import com.cemalcansanaral.basketballproject.databinding.FragmentTeamsBinding
import com.cemalcansanaral.basketballproject.entity.*
import com.cemalcansanaral.basketballproject.retrofit.ApiUtils
import com.cemalcansanaral.basketballproject.retrofit.BasketballDaoInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BasketballDaoRepository {
    private var playersList : MutableLiveData<List<Players>>
    private var basketballDaoInterface: BasketballDaoInterface
    private var teamList : MutableLiveData<List<Teams>>

    init {
        basketballDaoInterface = ApiUtils.getBasketballDaoInterface()
        playersList = MutableLiveData()
        teamList = MutableLiveData()
    }

    fun bringPlayers() : MutableLiveData<List<Players>> {
        return playersList
    }

    fun allBringPlayers() {
        basketballDaoInterface.allPlayers().enqueue(object : Callback<PlayersAnswer>{
            override fun onResponse(call: Call<PlayersAnswer>?, response: Response<PlayersAnswer>?
            ) {
                val list = response?.body()?.data
                Log.e("Mesaj","Mesaj${list?.size}")
                playersList.value = list
            }

            override fun onFailure(call: Call<PlayersAnswer>?, t: Throwable?) {
                Log.e("Mesaj","Mesaj${t?.message}")
            }
        })
    }

    fun bringTeams() : MutableLiveData<List<Teams>> {
        return teamList
    }

    fun allBringTeams() {
        basketballDaoInterface.allTeams().enqueue(object : Callback<TeamsAnswer>{
            override fun onResponse(call: Call<TeamsAnswer>?, response: Response<TeamsAnswer>?) {
                val list = response?.body()?.data
                Log.e("Teams", "Teams${list?.size}")
                teamList.value = list
            }

            override fun onFailure(call: Call<TeamsAnswer>?, t: Throwable?) {
                Log.e("Teams","Teams${t?.message}")
            }
        })
    }

    fun homePageRvAnim(design : FragmentHomepageBinding){
        val rvanim = AnimationUtils.loadAnimation(design.playersRecyclerView.context, R.anim.recyclerview_animation)
        design.playersRecyclerView.startAnimation(rvanim)
    }

    fun teamsRvAnim(design : FragmentTeamsBinding){
        val rvanim = AnimationUtils.loadAnimation(design.teamsRecyclerView.context, R.anim.recyclerview_animation)
        design.teamsRecyclerView.startAnimation(rvanim)
    }

}
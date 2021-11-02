package com.cemalcansanaral.basketballproject.retrofit

import com.cemalcansanaral.basketballproject.entity.PlayersAnswer
import com.cemalcansanaral.basketballproject.entity.TeamsAnswer
import retrofit2.Call
import retrofit2.http.GET

interface BasketballDaoInterface {
    @GET ("players?page=1")
    fun allPlayers() : Call<PlayersAnswer>

    @GET ("teams")
    fun allTeams() : Call<TeamsAnswer>
}
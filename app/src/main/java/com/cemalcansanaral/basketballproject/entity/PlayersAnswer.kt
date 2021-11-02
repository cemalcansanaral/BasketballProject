package com.cemalcansanaral.basketballproject.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PlayersAnswer (@SerializedName ("data")
                          @Expose
                          var data : List<Players>?,
                          @SerializedName ("meta")
                          @Expose
                          var meta : PlayersMeta) {
}
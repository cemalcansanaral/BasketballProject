package com.cemalcansanaral.basketballproject.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TeamsAnswer (@SerializedName("data")
                   @Expose
                   var data : List<Teams>?,
                   @SerializedName("meta")
                   @Expose
                   var meta : TeamsMeta) {
}
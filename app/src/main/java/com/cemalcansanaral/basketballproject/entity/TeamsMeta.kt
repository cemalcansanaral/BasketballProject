package com.cemalcansanaral.basketballproject.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class TeamsMeta (@SerializedName("total_pages")
                      @Expose
                      var total_pages : Int,
                      @SerializedName("current_page")
                      @Expose
                      var current_page : Int,
                      @SerializedName("next_page")
                      @Expose
                      var next_page : Int?,
                      @SerializedName("per_page")
                      @Expose
                      var per_page : Int,
                      @SerializedName("total_count")
                      @Expose
                      var total_count : Int) : Serializable {
}
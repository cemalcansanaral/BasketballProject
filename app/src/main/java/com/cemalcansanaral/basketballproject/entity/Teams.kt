package com.cemalcansanaral.basketballproject.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Teams (@SerializedName ("id")
                  @Expose
                  var id : Int,
                  @SerializedName ("abbreviation")
                  @Expose
                  var abbreviation : String,
                  @SerializedName ("city")
                  @Expose
                  var city : String,
                  @SerializedName("conference")
                  @Expose
                  var conference : String,
                  @SerializedName ("division")
                  @Expose
                  var division : String,
                  @SerializedName ("full_name")
                  @Expose
                  var full_name : String,
                  @SerializedName ("name")
                  @Expose
                  var name : String) : Serializable {
}
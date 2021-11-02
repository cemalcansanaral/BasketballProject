package com.cemalcansanaral.basketballproject.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Players (@SerializedName("id")
                    @Expose
                    var id: Int,
                    @SerializedName("first_name")
                    @Expose
                    var first_name: String,
                    @SerializedName ("height_feet")
                    @Expose
                    var height_feet : Int?,
                    @SerializedName("height_inches")
                    @Expose
                    var height_inches : Int?,
                    @SerializedName("last_name")
                    @Expose
                    var last_name : String,
                    @SerializedName("position")
                    @Expose
                    var position : String,
                    @SerializedName("team")
                    @Expose
                    var team : Teams,
                    @SerializedName ("weight_pounds")
                    @Expose
                    var weight_pounds : Int?) : Serializable {
}
package com.cemalcansanaral.basketballproject.retrofit

class ApiUtils {
    companion object {
        val BASE_URL = "https://www.balldontlie.io/api/v1/"

        fun getBasketballDaoInterface() : BasketballDaoInterface {
            return RetrofitClient.getClient(BASE_URL).create(BasketballDaoInterface::class.java)
        }
    }
}
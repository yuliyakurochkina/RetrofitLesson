package com.example.retrofitlesson.retrofit

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface MainApi {
    @GET("product/{id}")
    suspend fun getProductById(@Path("id")id: Int): Product

    @POST("auth/login")
    suspend fun postPersonalData(@Body authRequest: AuthRequest): User
}
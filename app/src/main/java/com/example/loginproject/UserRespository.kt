package com.example.loginproject

import retrofit2.Response

class UserRespository {
    class UserRepository {
        suspend fun loginUser(loginRequest:LoginRequest): Response<LoginResponse>? {
            return UserApi.getApi()?.loginUser(loginRequest = loginRequest)
        }
    }
}
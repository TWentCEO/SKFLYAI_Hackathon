package com.example.hackathon;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface testApi {
    @GET("tests")
    Call<List<POST>> getPosts();
}

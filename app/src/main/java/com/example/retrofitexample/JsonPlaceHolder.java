package com.example.retrofitexample;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.*;

public interface JsonPlaceHolder {

    //API RELATIVE URL TO GET DATA FROM
    @GET("posts")
    Call<List<Post>> getPosts();
}

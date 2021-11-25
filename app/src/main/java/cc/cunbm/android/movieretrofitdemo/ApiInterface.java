package cc.cunbm.android.movieretrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("my.json")
    Call<List<Movie>> getMovies();
}


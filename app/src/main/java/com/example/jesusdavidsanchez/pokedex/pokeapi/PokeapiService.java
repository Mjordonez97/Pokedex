package com.example.jesusdavidsanchez.pokedex.pokeapi;

import com.example.jesusdavidsanchez.pokedex.models.RespuestaPokemon;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokeapiService {
    @GET("pokemon")
    Call<RespuestaPokemon> obtenerListaPokemon(@Query("limit") int limit, @Query("offset") int offset);
}

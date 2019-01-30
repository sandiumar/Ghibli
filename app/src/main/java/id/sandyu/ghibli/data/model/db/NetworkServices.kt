package id.sandyu.ghibli.data.model.db

import id.sandyu.ghibli.data.model.CharacterModel
import id.sandyu.ghibli.data.model.FilmModel
import id.sandyu.ghibli.data.model.LocationModel
import retrofit2.http.GET
import rx.Observable

interface NetworkServices {
    @GET("people")
    fun getAllCharacters(): Observable<CharacterModel>

    @GET("locations")
    fun getAllLocations(): Observable<LocationModel>

    @GET("films")
    fun  getAllFilms(): Observable<FilmModel>


}
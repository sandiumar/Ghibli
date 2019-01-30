package id.sandyu.ghibli.di

import dagger.Module
import id.sandyu.ghibli.data.model.db.NetworkServices
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


@Module
class NetworkModule {
    fun create(): NetworkServices{
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val clientBuilder = OkHttpClient.Builder()
        val client = clientBuilder.build()

        val retrofit = Retrofit.Builder()
            .baseUrl("https://ghibliapi.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
        return retrofit.create(NetworkServices::class.java)
    }
}
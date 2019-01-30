package id.sandyu.ghibli.data.model

import android.support.v7.widget.DialogTitle
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.FileDescriptor

data class FilmModel (
    @SerializedName("results") @Expose  var results:MutableList<GhibliFilm>
)
    {
        data class GhibliFilm(
            @SerializedName("id") @Expose var id: String,
            @SerializedName("title") @Expose var title: String,
            @SerializedName("description") @Expose var description: String,
            @SerializedName("director") @Expose var director: String,
            @SerializedName("producer") @Expose var producer: String,
            @SerializedName("release_date") @Expose var release_date: String,
            @SerializedName("rt_score") @Expose var score: String

        )
    }

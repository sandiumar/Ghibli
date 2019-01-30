package id.sandyu.ghibli.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class CharacterModel(
  @SerializedName("results") @Expose var results:MutableList<Ghibli>
){
    data class Ghibli(
        @SerializedName("id") @Expose var id: String? = null,
        @SerializedName("name") @Expose var name: String? = null,
        @SerializedName("gender")@Expose var gender: String? = null,
        @SerializedName("age") @Expose var age: String? = null,
        @SerializedName("eye_color") @Expose var eye_color: String? = null,
        @SerializedName("hair_color") @Expose var hair_color: String? = null
    )


}
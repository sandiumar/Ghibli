package id.sandyu.ghibli.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class LocationModel (
    @SerializedName("results") @Expose var results: MutableList<GhibliLocation>
) {
    data class GhibliLocation (
        @SerializedName("id") @Expose var id: String,
        @SerializedName("name") @Expose var name: String,
        @SerializedName("climate") @Expose var climate: String,
        @SerializedName("terrain") @Expose var terrain: String,
        @SerializedName("surface_water") @Expose var surface_water: String
    )
}

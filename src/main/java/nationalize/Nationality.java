package nationalize;

import com.google.gson.annotations.SerializedName;

import java.util.List;
@lombok.Data
public class Nationality {

    private long count;
    private String name;

    @SerializedName("country")
    private List<Country> countries;
    @lombok.Data
    public static class Country {

        @Override
        public String toString() {
            return ReflectionToStringBuilder.toString(this, ToStringStyle.NO_CLASS_NAME_STYLE);
        }

        private String countryId;
        private float probability;


    }

}

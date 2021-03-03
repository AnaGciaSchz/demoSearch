package jsonManaging;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Produces;

/**
 * Class that represents the json for the /search url
 *
 * @Author Ana Garcia
 */
@Produces(MediaType.APPLICATION_JSON)
public class SearchTitlesJson {

    private final int total;
    private final TitleJson[] items;

    @JsonCreator
    public SearchTitlesJson (@JsonProperty("total") int total, @JsonProperty ("items") TitleJson[] items){
        this.total = total;
        this.items = items;
    }

    public int getTotal() {
        return total;
    }

    public TitleJson[] getItems() {
        return items;
    }


}
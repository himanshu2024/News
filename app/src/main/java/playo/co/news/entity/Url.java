package playo.co.news.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Divum on 14-10-2017.
 */

public class Url {
    @SerializedName("value")
    private String value;
    @SerializedName("matchLevel")
    private String matchLevel;
    @SerializedName("matchedWords")
    private List<Object> matchedWords = null;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMatchLevel() {
        return matchLevel;
    }

    public void setMatchLevel(String matchLevel) {
        this.matchLevel = matchLevel;
    }

    public List<Object> getMatchedWords() {
        return matchedWords;
    }

    public void setMatchedWords(List<Object> matchedWords) {
        this.matchedWords = matchedWords;
    }
}

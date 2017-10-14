package playo.co.news.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Divum on 14-10-2017.
 */

public class HighlightResult {
    @SerializedName("title")
    private Title title;
    @SerializedName("url")
    private Url url;
    @SerializedName("author")
    private Author author;
    @SerializedName("story_text")
    private StoryText storyText;

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Url getUrl() {
        return url;
    }

    public void setUrl(Url url) {
        this.url = url;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public StoryText getStoryText() {
        return storyText;
    }

    public void setStoryText(StoryText storyText) {
        this.storyText = storyText;
    }

}

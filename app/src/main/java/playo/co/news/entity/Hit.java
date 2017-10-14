package playo.co.news.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Divum on 14-10-2017.
 */

public class Hit {
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("title")
    private String title;
    @SerializedName("url")
    private String url;
    @SerializedName("author")
    private String author;
    @SerializedName("points")
    private Integer points;
    @SerializedName("story_text")
    private String storyText;
    @SerializedName("comment_text")
    private Object commentText;
    @SerializedName("num_comments")
    private Integer numComments;
    @SerializedName("story_id")
    private Object storyId;
    @SerializedName("story_title")
    private Object storyTitle;
    @SerializedName("story_url")
    private Object storyUrl;
    @SerializedName("parent_id")
    private Object parentId;
    @SerializedName("created_at_i")
    private Integer createdAtI;
    @SerializedName("_tags")
    private List<String> tags = null;
    @SerializedName("objectID")
    private String objectID;
    @SerializedName("_highlightResult")
    private HighlightResult highlightResult;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getStoryText() {
        return storyText;
    }

    public void setStoryText(String storyText) {
        this.storyText = storyText;
    }

    public Object getCommentText() {
        return commentText;
    }

    public void setCommentText(Object commentText) {
        this.commentText = commentText;
    }

    public Integer getNumComments() {
        return numComments;
    }

    public void setNumComments(Integer numComments) {
        this.numComments = numComments;
    }

    public Object getStoryId() {
        return storyId;
    }

    public void setStoryId(Object storyId) {
        this.storyId = storyId;
    }

    public Object getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(Object storyTitle) {
        this.storyTitle = storyTitle;
    }

    public Object getStoryUrl() {
        return storyUrl;
    }

    public void setStoryUrl(Object storyUrl) {
        this.storyUrl = storyUrl;
    }

    public Object getParentId() {
        return parentId;
    }

    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public Integer getCreatedAtI() {
        return createdAtI;
    }

    public void setCreatedAtI(Integer createdAtI) {
        this.createdAtI = createdAtI;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getObjectID() {
        return objectID;
    }

    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }

    public HighlightResult getHighlightResult() {
        return highlightResult;
    }

    public void setHighlightResult(HighlightResult highlightResult) {
        this.highlightResult = highlightResult;
    }
}

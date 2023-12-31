
package com.shivam.newslatest;
import java.util.ArrayList;
import java.util.List;
public class user{
    public String title;
    public String link;
    public ArrayList<String> keywords;
    public ArrayList<String> creator;
    public Object video_url;
    public String description;
    public String content;
    public String pubDate;
    public String image_url;
    public String source_id;
    public ArrayList<String> country;
    public ArrayList<String> category;
    public String language;

    public user(String title, String link, ArrayList<String> keywords, ArrayList<String> creator, Object video_url, String description, String content, String pubDate, String image_url, String source_id, ArrayList<String> country, ArrayList<String> category, String language) {
        this.title = title;
        this.link = link;
        this.keywords = keywords;
        this.creator = creator;
        this.video_url = video_url;
        this.description = description;
        this.content = content;
        this.pubDate = pubDate;
        this.image_url = image_url;
        this.source_id = source_id;
        this.country = country;
        this.category = category;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }

    public ArrayList<String> getCreator() {
        return creator;
    }

    public void setCreator(ArrayList<String> creator) {
        this.creator = creator;
    }

    public Object getVideo_url() {
        return video_url;
    }

    public void setVideo_url(Object video_url) {
        this.video_url = video_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getSource_id() {
        return source_id;
    }

    public void setSource_id(String source_id) {
        this.source_id = source_id;
    }

    public ArrayList<String> getCountry() {
        return country;
    }

    public void setCountry(ArrayList<String> country) {
        this.country = country;
    }

    public ArrayList<String> getCategory() {
        return category;
    }

    public void setCategory(ArrayList<String> category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}

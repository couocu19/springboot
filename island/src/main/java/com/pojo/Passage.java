package com.pojo;

import java.util.Date;

public class Passage {
    private Integer id;

    private Integer userId;

    private String title;

    private String coverImage;

    private Integer praiseCount;

    private String praideId;

    private Integer collectedCount;

    private String collectId;

    private Integer commentCount;

    private Date time;

    private String content;

    public Passage(Integer id, Integer userId, String title, String coverImage, Integer praiseCount, String praideId, Integer collectedCount, String collectId, Integer commentCount, Date time, String content) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.coverImage = coverImage;
        this.praiseCount = praiseCount;
        this.praideId = praideId;
        this.collectedCount = collectedCount;
        this.collectId = collectId;
        this.commentCount = commentCount;
        this.time = time;
        this.content = content;
    }

    public Passage() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage == null ? null : coverImage.trim();
    }

    public Integer getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(Integer praiseCount) {
        this.praiseCount = praiseCount;
    }

    public String getPraideId() {
        return praideId;
    }

    public void setPraideId(String praideId) {
        this.praideId = praideId == null ? null : praideId.trim();
    }

    public Integer getCollectedCount() {
        return collectedCount;
    }

    public void setCollectedCount(Integer collectedCount) {
        this.collectedCount = collectedCount;
    }

    public String getCollectId() {
        return collectId;
    }

    public void setCollectId(String collectId) {
        this.collectId = collectId == null ? null : collectId.trim();
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
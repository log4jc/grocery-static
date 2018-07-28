package com.jwebcoder.grocerystatic.domain;

import java.util.List;

public class MessageBoard {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD.ID
     *
     * @mbggenerated
     */
    private Integer id = 1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD.VERSION
     *
     * @mbggenerated
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD.USERID
     *
     * @mbggenerated
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD.USER_NAME
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD.EMAIL
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD.CONTENT
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD.PHOTO_REF_ID
     *
     * @mbggenerated
     */
    private Integer photoRefId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD.AVATOR
     *
     * @mbggenerated
     */
    private Integer avator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD.CREATE_DATETIME
     *
     * @mbggenerated
     */
    private String createDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD.CUSTOM1
     *
     * @mbggenerated
     */
    private String custom1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD.CUSTOM2
     *
     * @mbggenerated
     */
    private String custom2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD.CUSTOM3
     *
     * @mbggenerated
     */
    private String custom3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD.CUSTOM4
     *
     * @mbggenerated
     */
    private String custom4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD.CUSTOM5
     *
     * @mbggenerated
     */
    private String custom5;

    private Integer subreplyCount;

    private List<MessageBoardSubreply> messageBoardSubreply;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD.ID
     *
     * @return the value of MESSAGE_BOARD.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD.ID
     *
     * @param id the value for MESSAGE_BOARD.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD.VERSION
     *
     * @return the value of MESSAGE_BOARD.VERSION
     *
     * @mbggenerated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD.VERSION
     *
     * @param version the value for MESSAGE_BOARD.VERSION
     *
     * @mbggenerated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD.USERID
     *
     * @return the value of MESSAGE_BOARD.USERID
     *
     * @mbggenerated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD.USERID
     *
     * @param userid the value for MESSAGE_BOARD.USERID
     *
     * @mbggenerated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD.USER_NAME
     *
     * @return the value of MESSAGE_BOARD.USER_NAME
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD.USER_NAME
     *
     * @param userName the value for MESSAGE_BOARD.USER_NAME
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD.EMAIL
     *
     * @return the value of MESSAGE_BOARD.EMAIL
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD.EMAIL
     *
     * @param email the value for MESSAGE_BOARD.EMAIL
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD.CONTENT
     *
     * @return the value of MESSAGE_BOARD.CONTENT
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD.CONTENT
     *
     * @param content the value for MESSAGE_BOARD.CONTENT
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD.PHOTO_REF_ID
     *
     * @return the value of MESSAGE_BOARD.PHOTO_REF_ID
     *
     * @mbggenerated
     */
    public Integer getPhotoRefId() {
        return photoRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD.PHOTO_REF_ID
     *
     * @param photoRefId the value for MESSAGE_BOARD.PHOTO_REF_ID
     *
     * @mbggenerated
     */
    public void setPhotoRefId(Integer photoRefId) {
        this.photoRefId = photoRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD.AVATOR
     *
     * @return the value of MESSAGE_BOARD.AVATOR
     *
     * @mbggenerated
     */
    public Integer getAvator() {
        return avator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD.AVATOR
     *
     * @param avator the value for MESSAGE_BOARD.AVATOR
     *
     * @mbggenerated
     */
    public void setAvator(Integer avator) {
        this.avator = avator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD.CREATE_DATETIME
     *
     * @return the value of MESSAGE_BOARD.CREATE_DATETIME
     *
     * @mbggenerated
     */
    public String getCreateDatetime() {
        return createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD.CREATE_DATETIME
     *
     * @param createDatetime the value for MESSAGE_BOARD.CREATE_DATETIME
     *
     * @mbggenerated
     */
    public void setCreateDatetime(String createDatetime) {
        this.createDatetime = createDatetime == null ? null : createDatetime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD.CUSTOM1
     *
     * @return the value of MESSAGE_BOARD.CUSTOM1
     *
     * @mbggenerated
     */
    public String getCustom1() {
        return custom1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD.CUSTOM1
     *
     * @param custom1 the value for MESSAGE_BOARD.CUSTOM1
     *
     * @mbggenerated
     */
    public void setCustom1(String custom1) {
        this.custom1 = custom1 == null ? null : custom1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD.CUSTOM2
     *
     * @return the value of MESSAGE_BOARD.CUSTOM2
     *
     * @mbggenerated
     */
    public String getCustom2() {
        return custom2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD.CUSTOM2
     *
     * @param custom2 the value for MESSAGE_BOARD.CUSTOM2
     *
     * @mbggenerated
     */
    public void setCustom2(String custom2) {
        this.custom2 = custom2 == null ? null : custom2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD.CUSTOM3
     *
     * @return the value of MESSAGE_BOARD.CUSTOM3
     *
     * @mbggenerated
     */
    public String getCustom3() {
        return custom3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD.CUSTOM3
     *
     * @param custom3 the value for MESSAGE_BOARD.CUSTOM3
     *
     * @mbggenerated
     */
    public void setCustom3(String custom3) {
        this.custom3 = custom3 == null ? null : custom3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD.CUSTOM4
     *
     * @return the value of MESSAGE_BOARD.CUSTOM4
     *
     * @mbggenerated
     */
    public String getCustom4() {
        return custom4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD.CUSTOM4
     *
     * @param custom4 the value for MESSAGE_BOARD.CUSTOM4
     *
     * @mbggenerated
     */
    public void setCustom4(String custom4) {
        this.custom4 = custom4 == null ? null : custom4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD.CUSTOM5
     *
     * @return the value of MESSAGE_BOARD.CUSTOM5
     *
     * @mbggenerated
     */
    public String getCustom5() {
        return custom5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD.CUSTOM5
     *
     * @param custom5 the value for MESSAGE_BOARD.CUSTOM5
     *
     * @mbggenerated
     */
    public void setCustom5(String custom5) {
        this.custom5 = custom5 == null ? null : custom5.trim();
    }

    public Integer getSubreplyCount() {
        return subreplyCount;
    }

    public void setSubreplyCount(Integer subreplyCount) {
        this.subreplyCount = subreplyCount;
    }

    public List<MessageBoardSubreply> getMessageBoardSubreply() {
        return messageBoardSubreply;
    }

    public void setMessageBoardSubreply(List<MessageBoardSubreply> messageBoardSubreply) {
        this.messageBoardSubreply = messageBoardSubreply;
    }
}
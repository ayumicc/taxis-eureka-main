package com.cc.taxis.model;

import java.util.Date;
import javax.persistence.*;

public class Message {
    @Id
    @Column(name = "message_id")
    private String messageId;

    @Column(name = "register_user_id")
    private String registerUserId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 推送平台
     */
    @Column(name = "push_platform")
    private String pushPlatform;

    /**
     * 推送状态
     */
    @Column(name = "push_status")
    private Byte pushStatus;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 创建人
     */
    private String creater;

    /**
     * @return message_id
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * @param messageId
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * @return register_user_id
     */
    public String getRegisterUserId() {
        return registerUserId;
    }

    /**
     * @param registerUserId
     */
    public void setRegisterUserId(String registerUserId) {
        this.registerUserId = registerUserId;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取推送平台
     *
     * @return push_platform - 推送平台
     */
    public String getPushPlatform() {
        return pushPlatform;
    }

    /**
     * 设置推送平台
     *
     * @param pushPlatform 推送平台
     */
    public void setPushPlatform(String pushPlatform) {
        this.pushPlatform = pushPlatform;
    }

    /**
     * 获取推送状态
     *
     * @return push_status - 推送状态
     */
    public Byte getPushStatus() {
        return pushStatus;
    }

    /**
     * 设置推送状态
     *
     * @param pushStatus 推送状态
     */
    public void setPushStatus(Byte pushStatus) {
        this.pushStatus = pushStatus;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改人
     *
     * @return modifier - 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 设置修改人
     *
     * @param modifier 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * 获取创建人
     *
     * @return creater - 创建人
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 设置创建人
     *
     * @param creater 创建人
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }
}
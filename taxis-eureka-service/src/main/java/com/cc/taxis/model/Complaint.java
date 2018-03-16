package com.cc.taxis.model;

import java.util.Date;
import javax.persistence.*;

public class Complaint {
    @Id
    @Column(name = "complaint_id")
    private String complaintId;

    @Column(name = "register_user_id")
    private String registerUserId;

    /**
     * 投诉内容
     */
    private String content;

    /**
     * 状态(1:未处理2:已处理)
     */
    private Byte status;

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
     * @return complaint_id
     */
    public String getComplaintId() {
        return complaintId;
    }

    /**
     * @param complaintId
     */
    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
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
     * 获取投诉内容
     *
     * @return content - 投诉内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置投诉内容
     *
     * @param content 投诉内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取状态(1:未处理2:已处理)
     *
     * @return status - 状态(1:未处理2:已处理)
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态(1:未处理2:已处理)
     *
     * @param status 状态(1:未处理2:已处理)
     */
    public void setStatus(Byte status) {
        this.status = status;
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
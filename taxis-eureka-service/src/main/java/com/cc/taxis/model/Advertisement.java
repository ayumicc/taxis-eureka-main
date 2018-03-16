package com.cc.taxis.model;

import java.util.Date;
import javax.persistence.*;

public class Advertisement {
    @Id
    @Column(name = "advertisement_id")
    private String advertisementId;

    /**
     * 广告类型
     */
    @Column(name = "advertisement_classify")
    private Byte advertisementClassify;

    /**
     * 地址
     */
    private String url;

    /**
     * 状态(1:启用2:禁用)
     */
    private Byte status;

    /**
     * 点击后跳转地址
     */
    @Column(name = "click_url")
    private String clickUrl;

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
     * @return advertisement_id
     */
    public String getAdvertisementId() {
        return advertisementId;
    }

    /**
     * @param advertisementId
     */
    public void setAdvertisementId(String advertisementId) {
        this.advertisementId = advertisementId;
    }

    /**
     * 获取广告类型
     *
     * @return advertisement_classify - 广告类型
     */
    public Byte getAdvertisementClassify() {
        return advertisementClassify;
    }

    /**
     * 设置广告类型
     *
     * @param advertisementClassify 广告类型
     */
    public void setAdvertisementClassify(Byte advertisementClassify) {
        this.advertisementClassify = advertisementClassify;
    }

    /**
     * 获取地址
     *
     * @return url - 地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置地址
     *
     * @param url 地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取状态(1:启用2:禁用)
     *
     * @return status - 状态(1:启用2:禁用)
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态(1:启用2:禁用)
     *
     * @param status 状态(1:启用2:禁用)
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取点击后跳转地址
     *
     * @return click_url - 点击后跳转地址
     */
    public String getClickUrl() {
        return clickUrl;
    }

    /**
     * 设置点击后跳转地址
     *
     * @param clickUrl 点击后跳转地址
     */
    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl;
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
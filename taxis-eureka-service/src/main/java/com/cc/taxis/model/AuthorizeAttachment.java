package com.cc.taxis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "authorize_attachment")
public class AuthorizeAttachment {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "attachment_id")
    private String attachmentId;

    /**
     * 汽车ID
     */
    @Column(name = "car_id")
    private String carId;

    /**
     * 驾驶证(蓝本)
     */
    @Column(name = "license_blue_url")
    private String licenseBlueUrl;

    /**
     * 驾驶证(黑本)
     */
    @Column(name = "license_black_url")
    private String licenseBlackUrl;

    /**
     * 身份证(正面)
     */
    @Column(name = "card_positive_url")
    private String cardPositiveUrl;

    /**
     * 身份证(反面)
     */
    @Column(name = "card_negative_url")
    private String cardNegativeUrl;

    /**
     * 汽车照片
     */
    @Column(name = "car_photo_url")
    private String carPhotoUrl;

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
     * 获取主键ID
     *
     * @return attachment_id - 主键ID
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    /**
     * 设置主键ID
     *
     * @param attachmentId 主键ID
     */
    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * 获取汽车ID
     *
     * @return car_id - 汽车ID
     */
    public String getCarId() {
        return carId;
    }

    /**
     * 设置汽车ID
     *
     * @param carId 汽车ID
     */
    public void setCarId(String carId) {
        this.carId = carId;
    }

    /**
     * 获取驾驶证(蓝本)
     *
     * @return license_blue_url - 驾驶证(蓝本)
     */
    public String getLicenseBlueUrl() {
        return licenseBlueUrl;
    }

    /**
     * 设置驾驶证(蓝本)
     *
     * @param licenseBlueUrl 驾驶证(蓝本)
     */
    public void setLicenseBlueUrl(String licenseBlueUrl) {
        this.licenseBlueUrl = licenseBlueUrl;
    }

    /**
     * 获取驾驶证(黑本)
     *
     * @return license_black_url - 驾驶证(黑本)
     */
    public String getLicenseBlackUrl() {
        return licenseBlackUrl;
    }

    /**
     * 设置驾驶证(黑本)
     *
     * @param licenseBlackUrl 驾驶证(黑本)
     */
    public void setLicenseBlackUrl(String licenseBlackUrl) {
        this.licenseBlackUrl = licenseBlackUrl;
    }

    /**
     * 获取身份证(正面)
     *
     * @return card_positive_url - 身份证(正面)
     */
    public String getCardPositiveUrl() {
        return cardPositiveUrl;
    }

    /**
     * 设置身份证(正面)
     *
     * @param cardPositiveUrl 身份证(正面)
     */
    public void setCardPositiveUrl(String cardPositiveUrl) {
        this.cardPositiveUrl = cardPositiveUrl;
    }

    /**
     * 获取身份证(反面)
     *
     * @return card_negative_url - 身份证(反面)
     */
    public String getCardNegativeUrl() {
        return cardNegativeUrl;
    }

    /**
     * 设置身份证(反面)
     *
     * @param cardNegativeUrl 身份证(反面)
     */
    public void setCardNegativeUrl(String cardNegativeUrl) {
        this.cardNegativeUrl = cardNegativeUrl;
    }

    /**
     * 获取汽车照片
     *
     * @return car_photo_url - 汽车照片
     */
    public String getCarPhotoUrl() {
        return carPhotoUrl;
    }

    /**
     * 设置汽车照片
     *
     * @param carPhotoUrl 汽车照片
     */
    public void setCarPhotoUrl(String carPhotoUrl) {
        this.carPhotoUrl = carPhotoUrl;
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
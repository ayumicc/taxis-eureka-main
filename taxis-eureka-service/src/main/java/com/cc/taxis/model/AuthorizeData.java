package com.cc.taxis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "authorize_data")
public class AuthorizeData {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "authorize_id")
    private String authorizeId;

    /**
     * 汽车ID
     */
    @Column(name = "car_id")
    private String carId;

    /**
     * 真实名称
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 身份证号
     */
    @Column(name = "card_id")
    private String cardId;

    /**
     * 驾驶证号
     */
    @Column(name = "license_no")
    private String licenseNo;

    /**
     * 首次领证时间
     */
    @Column(name = "first_license_time")
    private Date firstLicenseTime;

    /**
     * 驾驶证有效开始时间
     */
    @Column(name = "begin_license_time")
    private Date beginLicenseTime;

    /**
     * 驾驶证有效结束时间
     */
    @Column(name = "end_license_time")
    private Date endLicenseTime;

    /**
     * 有限期限(月)
     */
    @Column(name = "valid_month")
    private Integer validMonth;

    /**
     * 发动机号
     */
    @Column(name = "motor_no")
    private String motorNo;

    /**
     * 注册日期
     */
    @Column(name = "register_data")
    private Date registerData;

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
     * @return authorize_id - 主键ID
     */
    public String getAuthorizeId() {
        return authorizeId;
    }

    /**
     * 设置主键ID
     *
     * @param authorizeId 主键ID
     */
    public void setAuthorizeId(String authorizeId) {
        this.authorizeId = authorizeId;
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
     * 获取真实名称
     *
     * @return real_name - 真实名称
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实名称
     *
     * @param realName 真实名称
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取身份证号
     *
     * @return card_id - 身份证号
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 设置身份证号
     *
     * @param cardId 身份证号
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * 获取驾驶证号
     *
     * @return license_no - 驾驶证号
     */
    public String getLicenseNo() {
        return licenseNo;
    }

    /**
     * 设置驾驶证号
     *
     * @param licenseNo 驾驶证号
     */
    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    /**
     * 获取首次领证时间
     *
     * @return first_license_time - 首次领证时间
     */
    public Date getFirstLicenseTime() {
        return firstLicenseTime;
    }

    /**
     * 设置首次领证时间
     *
     * @param firstLicenseTime 首次领证时间
     */
    public void setFirstLicenseTime(Date firstLicenseTime) {
        this.firstLicenseTime = firstLicenseTime;
    }

    /**
     * 获取驾驶证有效开始时间
     *
     * @return begin_license_time - 驾驶证有效开始时间
     */
    public Date getBeginLicenseTime() {
        return beginLicenseTime;
    }

    /**
     * 设置驾驶证有效开始时间
     *
     * @param beginLicenseTime 驾驶证有效开始时间
     */
    public void setBeginLicenseTime(Date beginLicenseTime) {
        this.beginLicenseTime = beginLicenseTime;
    }

    /**
     * 获取驾驶证有效结束时间
     *
     * @return end_license_time - 驾驶证有效结束时间
     */
    public Date getEndLicenseTime() {
        return endLicenseTime;
    }

    /**
     * 设置驾驶证有效结束时间
     *
     * @param endLicenseTime 驾驶证有效结束时间
     */
    public void setEndLicenseTime(Date endLicenseTime) {
        this.endLicenseTime = endLicenseTime;
    }

    /**
     * 获取有限期限(月)
     *
     * @return valid_month - 有限期限(月)
     */
    public Integer getValidMonth() {
        return validMonth;
    }

    /**
     * 设置有限期限(月)
     *
     * @param validMonth 有限期限(月)
     */
    public void setValidMonth(Integer validMonth) {
        this.validMonth = validMonth;
    }

    /**
     * 获取发动机号
     *
     * @return motor_no - 发动机号
     */
    public String getMotorNo() {
        return motorNo;
    }

    /**
     * 设置发动机号
     *
     * @param motorNo 发动机号
     */
    public void setMotorNo(String motorNo) {
        this.motorNo = motorNo;
    }

    /**
     * 获取注册日期
     *
     * @return register_data - 注册日期
     */
    public Date getRegisterData() {
        return registerData;
    }

    /**
     * 设置注册日期
     *
     * @param registerData 注册日期
     */
    public void setRegisterData(Date registerData) {
        this.registerData = registerData;
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
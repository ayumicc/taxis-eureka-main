package com.cc.taxis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "register_user")
public class RegisterUser {
    @Id
    @Column(name = "register_user_id")
    private String registerUserId;

    /**
     * 电话号码(登录需要)
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 区域
     */
    private String region;

    /**
     * 区域码
     */
    @Column(name = "region_code")
    private String regionCode;

    /**
     * 用户类型,1:乘客,2:司机
     */
    @Column(name = "user_classify")
    private Byte userClassify;

    /**
     * 状态(1:启用2:禁用)
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
     * 获取电话号码(登录需要)
     *
     * @return phone - 电话号码(登录需要)
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话号码(登录需要)
     *
     * @param phone 电话号码(登录需要)
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取区域
     *
     * @return region - 区域
     */
    public String getRegion() {
        return region;
    }

    /**
     * 设置区域
     *
     * @param region 区域
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 获取区域码
     *
     * @return region_code - 区域码
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * 设置区域码
     *
     * @param regionCode 区域码
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /**
     * 获取用户类型,1:乘客,2:司机
     *
     * @return user_classify - 用户类型,1:乘客,2:司机
     */
    public Byte getUserClassify() {
        return userClassify;
    }

    /**
     * 设置用户类型,1:乘客,2:司机
     *
     * @param userClassify 用户类型,1:乘客,2:司机
     */
    public void setUserClassify(Byte userClassify) {
        this.userClassify = userClassify;
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
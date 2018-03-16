package com.cc.taxis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "register_user_data")
public class RegisterUserData {
    /**
     * 用户资料ID
     */
    @Id
    @Column(name = "user_data_id")
    private String userDataId;

    @Column(name = "register_user_id")
    private String registerUserId;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 性别
     */
    private Byte sex;

    /**
     * 年龄
     */
    private Byte age;

    /**
     * 行业
     */
    private String trade;

    /**
     * 公司
     */
    private String company;

    /**
     * 职业
     */
    private String occupation;

    /**
     * 个人签名
     */
    @Column(name = "personal_signature")
    private String personalSignature;

    /**
     * 头像
     */
    @Column(name = "head_portrait")
    private String headPortrait;

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
     * 获取用户资料ID
     *
     * @return user_data_id - 用户资料ID
     */
    public String getUserDataId() {
        return userDataId;
    }

    /**
     * 设置用户资料ID
     *
     * @param userDataId 用户资料ID
     */
    public void setUserDataId(String userDataId) {
        this.userDataId = userDataId;
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
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Byte getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
     * 获取行业
     *
     * @return trade - 行业
     */
    public String getTrade() {
        return trade;
    }

    /**
     * 设置行业
     *
     * @param trade 行业
     */
    public void setTrade(String trade) {
        this.trade = trade;
    }

    /**
     * 获取公司
     *
     * @return company - 公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置公司
     *
     * @param company 公司
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取职业
     *
     * @return occupation - 职业
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * 设置职业
     *
     * @param occupation 职业
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * 获取个人签名
     *
     * @return personal_signature - 个人签名
     */
    public String getPersonalSignature() {
        return personalSignature;
    }

    /**
     * 设置个人签名
     *
     * @param personalSignature 个人签名
     */
    public void setPersonalSignature(String personalSignature) {
        this.personalSignature = personalSignature;
    }

    /**
     * 获取头像
     *
     * @return head_portrait - 头像
     */
    public String getHeadPortrait() {
        return headPortrait;
    }

    /**
     * 设置头像
     *
     * @param headPortrait 头像
     */
    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
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
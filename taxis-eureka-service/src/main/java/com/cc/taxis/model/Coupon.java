package com.cc.taxis.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Coupon {
    @Id
    @Column(name = "coupon_id")
    private String couponId;

    @Column(name = "register_user_id")
    private String registerUserId;

    /**
     * 兑换序号(yyyyMMddHHmmss + 随机数4位)
     */
    @Column(name = "exchange_no")
    private String exchangeNo;

    /**
     * 兑换码
     */
    @Column(name = "exchange_password")
    private String exchangePassword;

    /**
     * 使用开始时间
     */
    @Column(name = "begin_time")
    private Date beginTime;

    /**
     * 使用结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 状态(1:未使用,2:已使用,3:已过期)
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
     * @return coupon_id
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * @param couponId
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId;
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
     * 获取兑换序号(yyyyMMddHHmmss + 随机数4位)
     *
     * @return exchange_no - 兑换序号(yyyyMMddHHmmss + 随机数4位)
     */
    public String getExchangeNo() {
        return exchangeNo;
    }

    /**
     * 设置兑换序号(yyyyMMddHHmmss + 随机数4位)
     *
     * @param exchangeNo 兑换序号(yyyyMMddHHmmss + 随机数4位)
     */
    public void setExchangeNo(String exchangeNo) {
        this.exchangeNo = exchangeNo;
    }

    /**
     * 获取兑换码
     *
     * @return exchange_password - 兑换码
     */
    public String getExchangePassword() {
        return exchangePassword;
    }

    /**
     * 设置兑换码
     *
     * @param exchangePassword 兑换码
     */
    public void setExchangePassword(String exchangePassword) {
        this.exchangePassword = exchangePassword;
    }

    /**
     * 获取使用开始时间
     *
     * @return begin_time - 使用开始时间
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * 设置使用开始时间
     *
     * @param beginTime 使用开始时间
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * 获取使用结束时间
     *
     * @return end_time - 使用结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置使用结束时间
     *
     * @param endTime 使用结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取金额
     *
     * @return money - 金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置金额
     *
     * @param money 金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取状态(1:未使用,2:已使用,3:已过期)
     *
     * @return status - 状态(1:未使用,2:已使用,3:已过期)
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态(1:未使用,2:已使用,3:已过期)
     *
     * @param status 状态(1:未使用,2:已使用,3:已过期)
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
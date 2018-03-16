package com.cc.taxis.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "purse_extract")
public class PurseExtract {
    @Id
    @Column(name = "extract_id")
    private String extractId;

    @Column(name = "purse_id")
    private String purseId;

    /**
     * 订单号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 提现金额
     */
    private BigDecimal money;

    /**
     * 银行
     */
    @Column(name = "bank_name")
    private String bankName;

    /**
     * 银行卡号
     */
    @Column(name = "bank_card_no")
    private String bankCardNo;

    /**
     * 户主
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 状态
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
     * @return extract_id
     */
    public String getExtractId() {
        return extractId;
    }

    /**
     * @param extractId
     */
    public void setExtractId(String extractId) {
        this.extractId = extractId;
    }

    /**
     * @return purse_id
     */
    public String getPurseId() {
        return purseId;
    }

    /**
     * @param purseId
     */
    public void setPurseId(String purseId) {
        this.purseId = purseId;
    }

    /**
     * 获取订单号
     *
     * @return order_no - 订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单号
     *
     * @param orderNo 订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取提现金额
     *
     * @return money - 提现金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置提现金额
     *
     * @param money 提现金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取银行
     *
     * @return bank_name - 银行
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置银行
     *
     * @param bankName 银行
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 获取银行卡号
     *
     * @return bank_card_no - 银行卡号
     */
    public String getBankCardNo() {
        return bankCardNo;
    }

    /**
     * 设置银行卡号
     *
     * @param bankCardNo 银行卡号
     */
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    /**
     * 获取户主
     *
     * @return user_name - 户主
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置户主
     *
     * @param userName 户主
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
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
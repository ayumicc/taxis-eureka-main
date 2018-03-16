package com.cc.taxis.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "purse_details")
public class PurseDetails {
    @Id
    @Column(name = "purse_details_id")
    private String purseDetailsId;

    @Column(name = "purse_id")
    private String purseId;

    /**
     * 1:支出,2:提现,3:收入
     */
    @Column(name = "details_classify")
    private Byte detailsClassify;

    /**
     * 明细内容
     */
    @Column(name = "details_content")
    private String detailsContent;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 订单号
     */
    @Column(name = "order_no")
    private String orderNo;

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
     * @return purse_details_id
     */
    public String getPurseDetailsId() {
        return purseDetailsId;
    }

    /**
     * @param purseDetailsId
     */
    public void setPurseDetailsId(String purseDetailsId) {
        this.purseDetailsId = purseDetailsId;
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
     * 获取1:支出,2:提现,3:收入
     *
     * @return details_classify - 1:支出,2:提现,3:收入
     */
    public Byte getDetailsClassify() {
        return detailsClassify;
    }

    /**
     * 设置1:支出,2:提现,3:收入
     *
     * @param detailsClassify 1:支出,2:提现,3:收入
     */
    public void setDetailsClassify(Byte detailsClassify) {
        this.detailsClassify = detailsClassify;
    }

    /**
     * 获取明细内容
     *
     * @return details_content - 明细内容
     */
    public String getDetailsContent() {
        return detailsContent;
    }

    /**
     * 设置明细内容
     *
     * @param detailsContent 明细内容
     */
    public void setDetailsContent(String detailsContent) {
        this.detailsContent = detailsContent;
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
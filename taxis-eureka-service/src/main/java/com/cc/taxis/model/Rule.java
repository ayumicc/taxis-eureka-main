package com.cc.taxis.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Rule {
    @Id
    @Column(name = "rule_id")
    private String ruleId;

    /**
     * 1:的士,2:的巴
     */
    @Column(name = "charge_classify")
    private Byte chargeClassify;

    /**
     * 1:固定金额,2:百分百
     */
    @Column(name = "charge_way")
    private Byte chargeWay;

    /**
     * charge_way:1 ----为固定金额,charge_way:2 ----为百分百的数字
     */
    private BigDecimal value;

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
     * @return rule_id
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * @param ruleId
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 获取1:的士,2:的巴
     *
     * @return charge_classify - 1:的士,2:的巴
     */
    public Byte getChargeClassify() {
        return chargeClassify;
    }

    /**
     * 设置1:的士,2:的巴
     *
     * @param chargeClassify 1:的士,2:的巴
     */
    public void setChargeClassify(Byte chargeClassify) {
        this.chargeClassify = chargeClassify;
    }

    /**
     * 获取1:固定金额,2:百分百
     *
     * @return charge_way - 1:固定金额,2:百分百
     */
    public Byte getChargeWay() {
        return chargeWay;
    }

    /**
     * 设置1:固定金额,2:百分百
     *
     * @param chargeWay 1:固定金额,2:百分百
     */
    public void setChargeWay(Byte chargeWay) {
        this.chargeWay = chargeWay;
    }

    /**
     * 获取charge_way:1 ----为固定金额,charge_way:2 ----为百分百的数字
     *
     * @return value - charge_way:1 ----为固定金额,charge_way:2 ----为百分百的数字
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * 设置charge_way:1 ----为固定金额,charge_way:2 ----为百分百的数字
     *
     * @param value charge_way:1 ----为固定金额,charge_way:2 ----为百分百的数字
     */
    public void setValue(BigDecimal value) {
        this.value = value;
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
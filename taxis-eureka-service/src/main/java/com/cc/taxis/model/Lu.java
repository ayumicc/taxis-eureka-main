package com.cc.taxis.model;

import java.util.Date;
import javax.persistence.*;

public class Lu {
    @Id
    @Column(name = "lu_id")
    private String luId;

    /**
     * 路(202...)
     */
    @Column(name = "lu_name")
    private String luName;

    /**
     * 车的区域和车牌有关
     */
    private String region;

    /**
     * 区域码
     */
    @Column(name = "region_code")
    private String regionCode;

    /**
     * 公交公司
     */
    private String company;

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
     * @return lu_id
     */
    public String getLuId() {
        return luId;
    }

    /**
     * @param luId
     */
    public void setLuId(String luId) {
        this.luId = luId;
    }

    /**
     * 获取路(202...)
     *
     * @return lu_name - 路(202...)
     */
    public String getLuName() {
        return luName;
    }

    /**
     * 设置路(202...)
     *
     * @param luName 路(202...)
     */
    public void setLuName(String luName) {
        this.luName = luName;
    }

    /**
     * 获取车的区域和车牌有关
     *
     * @return region - 车的区域和车牌有关
     */
    public String getRegion() {
        return region;
    }

    /**
     * 设置车的区域和车牌有关
     *
     * @param region 车的区域和车牌有关
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
     * 获取公交公司
     *
     * @return company - 公交公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置公交公司
     *
     * @param company 公交公司
     */
    public void setCompany(String company) {
        this.company = company;
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
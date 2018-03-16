package com.cc.taxis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "public_car")
public class PublicCar {
    @Id
    @Column(name = "public_car_id")
    private String publicCarId;

    @Column(name = "scheduling_id")
    private String schedulingId;

    @Column(name = "lu_id")
    private String luId;

    /**
     * 车牌号
     */
    @Column(name = "plate_no")
    private String plateNo;

    /**
     * 行程状态(1:启用,2:停用)
     */
    private Byte status;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

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
     * @return public_car_id
     */
    public String getPublicCarId() {
        return publicCarId;
    }

    /**
     * @param publicCarId
     */
    public void setPublicCarId(String publicCarId) {
        this.publicCarId = publicCarId;
    }

    /**
     * @return scheduling_id
     */
    public String getSchedulingId() {
        return schedulingId;
    }

    /**
     * @param schedulingId
     */
    public void setSchedulingId(String schedulingId) {
        this.schedulingId = schedulingId;
    }

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
     * 获取车牌号
     *
     * @return plate_no - 车牌号
     */
    public String getPlateNo() {
        return plateNo;
    }

    /**
     * 设置车牌号
     *
     * @param plateNo 车牌号
     */
    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    /**
     * 获取行程状态(1:启用,2:停用)
     *
     * @return status - 行程状态(1:启用,2:停用)
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置行程状态(1:启用,2:停用)
     *
     * @param status 行程状态(1:启用,2:停用)
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
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
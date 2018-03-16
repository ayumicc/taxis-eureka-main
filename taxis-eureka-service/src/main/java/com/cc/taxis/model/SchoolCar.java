package com.cc.taxis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "school_car")
public class SchoolCar {
    @Id
    @Column(name = "school_car_id")
    private String schoolCarId;

    /**
     * 学校名称
     */
    @Column(name = "school_name")
    private String schoolName;

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
     * @return school_car_id
     */
    public String getSchoolCarId() {
        return schoolCarId;
    }

    /**
     * @param schoolCarId
     */
    public void setSchoolCarId(String schoolCarId) {
        this.schoolCarId = schoolCarId;
    }

    /**
     * 获取学校名称
     *
     * @return school_name - 学校名称
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * 设置学校名称
     *
     * @param schoolName 学校名称
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
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
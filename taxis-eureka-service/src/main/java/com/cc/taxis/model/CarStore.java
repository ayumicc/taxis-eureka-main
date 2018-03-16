package com.cc.taxis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "car_store")
public class CarStore {
    @Id
    @Column(name = "store_id")
    private String storeId;

    /**
     * 门店名字
     */
    @Column(name = "store_name")
    private String storeName;

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
     * 电话
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

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
     * @return store_id
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * @param storeId
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    /**
     * 获取门店名字
     *
     * @return store_name - 门店名字
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 设置门店名字
     *
     * @param storeName 门店名字
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
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
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
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
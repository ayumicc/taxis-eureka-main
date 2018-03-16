package com.cc.taxis.model;

import java.util.Date;
import javax.persistence.*;

public class Taxi {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "taxi_id")
    private String taxiId;

    /**
     * 汽车ID
     */
    @Column(name = "car_id")
    private String carId;

    /**
     * 冗余用户ID
     */
    @Column(name = "register_user_id")
    private String registerUserId;

    /**
     * 车牌号
     */
    @Column(name = "plate_no")
    private String plateNo;

    /**
     * 车品牌
     */
    @Column(name = "car_brand")
    private String carBrand;

    /**
     * 车颜色
     */
    @Column(name = "car_colour")
    private String carColour;

    /**
     * 车主名称
     */
    @Column(name = "car_owner_name")
    private String carOwnerName;

    /**
     * 公司名称
     */
    private String company;

    /**
     * 车主联系电话
     */
    private String phone;

    /**
     * 头像
     */
    @Column(name = "head_portrait")
    private String headPortrait;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 的士类型,1:出租车,2:网约车
     */
    @Column(name = "taxi_classify")
    private Byte taxiClassify;

    /**
     * 是否在线,1:是,0:否
     */
    @Column(name = "is_onine")
    private Byte isOnine;

    /**
     * 是否空闲,1:是,0:否
     */
    @Column(name = "is_empty")
    private Byte isEmpty;

    /**
     * 是否接单,1:是,0:否
     */
    @Column(name = "is_order")
    private Byte isOrder;

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
     * 获取主键ID
     *
     * @return taxi_id - 主键ID
     */
    public String getTaxiId() {
        return taxiId;
    }

    /**
     * 设置主键ID
     *
     * @param taxiId 主键ID
     */
    public void setTaxiId(String taxiId) {
        this.taxiId = taxiId;
    }

    /**
     * 获取汽车ID
     *
     * @return car_id - 汽车ID
     */
    public String getCarId() {
        return carId;
    }

    /**
     * 设置汽车ID
     *
     * @param carId 汽车ID
     */
    public void setCarId(String carId) {
        this.carId = carId;
    }

    /**
     * 获取冗余用户ID
     *
     * @return register_user_id - 冗余用户ID
     */
    public String getRegisterUserId() {
        return registerUserId;
    }

    /**
     * 设置冗余用户ID
     *
     * @param registerUserId 冗余用户ID
     */
    public void setRegisterUserId(String registerUserId) {
        this.registerUserId = registerUserId;
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
     * 获取车品牌
     *
     * @return car_brand - 车品牌
     */
    public String getCarBrand() {
        return carBrand;
    }

    /**
     * 设置车品牌
     *
     * @param carBrand 车品牌
     */
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    /**
     * 获取车颜色
     *
     * @return car_colour - 车颜色
     */
    public String getCarColour() {
        return carColour;
    }

    /**
     * 设置车颜色
     *
     * @param carColour 车颜色
     */
    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    /**
     * 获取车主名称
     *
     * @return car_owner_name - 车主名称
     */
    public String getCarOwnerName() {
        return carOwnerName;
    }

    /**
     * 设置车主名称
     *
     * @param carOwnerName 车主名称
     */
    public void setCarOwnerName(String carOwnerName) {
        this.carOwnerName = carOwnerName;
    }

    /**
     * 获取公司名称
     *
     * @return company - 公司名称
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置公司名称
     *
     * @param company 公司名称
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取车主联系电话
     *
     * @return phone - 车主联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置车主联系电话
     *
     * @param phone 车主联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * 获取的士类型,1:出租车,2:网约车
     *
     * @return taxi_classify - 的士类型,1:出租车,2:网约车
     */
    public Byte getTaxiClassify() {
        return taxiClassify;
    }

    /**
     * 设置的士类型,1:出租车,2:网约车
     *
     * @param taxiClassify 的士类型,1:出租车,2:网约车
     */
    public void setTaxiClassify(Byte taxiClassify) {
        this.taxiClassify = taxiClassify;
    }

    /**
     * 获取是否在线,1:是,0:否
     *
     * @return is_onine - 是否在线,1:是,0:否
     */
    public Byte getIsOnine() {
        return isOnine;
    }

    /**
     * 设置是否在线,1:是,0:否
     *
     * @param isOnine 是否在线,1:是,0:否
     */
    public void setIsOnine(Byte isOnine) {
        this.isOnine = isOnine;
    }

    /**
     * 获取是否空闲,1:是,0:否
     *
     * @return is_empty - 是否空闲,1:是,0:否
     */
    public Byte getIsEmpty() {
        return isEmpty;
    }

    /**
     * 设置是否空闲,1:是,0:否
     *
     * @param isEmpty 是否空闲,1:是,0:否
     */
    public void setIsEmpty(Byte isEmpty) {
        this.isEmpty = isEmpty;
    }

    /**
     * 获取是否接单,1:是,0:否
     *
     * @return is_order - 是否接单,1:是,0:否
     */
    public Byte getIsOrder() {
        return isOrder;
    }

    /**
     * 设置是否接单,1:是,0:否
     *
     * @param isOrder 是否接单,1:是,0:否
     */
    public void setIsOrder(Byte isOrder) {
        this.isOrder = isOrder;
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
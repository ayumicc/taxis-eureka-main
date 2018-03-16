package com.cc.taxis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "register_car")
public class RegisterCar {
    /**
     * 汽车ID
     */
    @Id
    @Column(name = "car_id")
    private String carId;

    @Column(name = "register_user_id")
    private String registerUserId;

    /**
     * 注册汽车类型
     */
    @Column(name = "car_type")
    private Byte carType;

    /**
     * 车颜色
     */
    @Column(name = "car_colour")
    private String carColour;

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
     * 车品牌
     */
    @Column(name = "car_brand")
    private String carBrand;

    /**
     * 状态(1:启用2:禁用)
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
     * 获取注册汽车类型
     *
     * @return car_type - 注册汽车类型
     */
    public Byte getCarType() {
        return carType;
    }

    /**
     * 设置注册汽车类型
     *
     * @param carType 注册汽车类型
     */
    public void setCarType(Byte carType) {
        this.carType = carType;
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
     * 获取状态(1:启用2:禁用)
     *
     * @return status - 状态(1:启用2:禁用)
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态(1:启用2:禁用)
     *
     * @param status 状态(1:启用2:禁用)
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
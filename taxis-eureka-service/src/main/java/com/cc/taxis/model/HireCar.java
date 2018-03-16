package com.cc.taxis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hire_car")
public class HireCar {
    @Id
    @Column(name = "hire_car_id")
    private String hireCarId;

    @Column(name = "company_id")
    private String companyId;

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
     * 座位数
     */
    @Column(name = "seat_number")
    private Byte seatNumber;

    /**
     * 1:手动,2:自动
     */
    @Column(name = "drive_way")
    private Byte driveWay;

    /**
     * 车图片
     */
    @Column(name = "car_img")
    private String carImg;

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
     * @return hire_car_id
     */
    public String getHireCarId() {
        return hireCarId;
    }

    /**
     * @param hireCarId
     */
    public void setHireCarId(String hireCarId) {
        this.hireCarId = hireCarId;
    }

    /**
     * @return company_id
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * @param companyId
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
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
     * 获取座位数
     *
     * @return seat_number - 座位数
     */
    public Byte getSeatNumber() {
        return seatNumber;
    }

    /**
     * 设置座位数
     *
     * @param seatNumber 座位数
     */
    public void setSeatNumber(Byte seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     * 获取1:手动,2:自动
     *
     * @return drive_way - 1:手动,2:自动
     */
    public Byte getDriveWay() {
        return driveWay;
    }

    /**
     * 设置1:手动,2:自动
     *
     * @param driveWay 1:手动,2:自动
     */
    public void setDriveWay(Byte driveWay) {
        this.driveWay = driveWay;
    }

    /**
     * 获取车图片
     *
     * @return car_img - 车图片
     */
    public String getCarImg() {
        return carImg;
    }

    /**
     * 设置车图片
     *
     * @param carImg 车图片
     */
    public void setCarImg(String carImg) {
        this.carImg = carImg;
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
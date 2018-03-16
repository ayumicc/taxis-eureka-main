package com.cc.taxis.model;

import java.util.Date;
import javax.persistence.*;

public class Deba {
    @Id
    @Column(name = "deba_id")
    private String debaId;

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

    @Column(name = "line_id")
    private String lineId;

    /**
     * 出发时间
     */
    @Column(name = "depart_time")
    private Date departTime;

    /**
     * 乘坐人数
     */
    @Column(name = "passenger_number")
    private Byte passengerNumber;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 行程状态(1:未进行,2:进行中,3:已完成)
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
     * @return deba_id
     */
    public String getDebaId() {
        return debaId;
    }

    /**
     * @param debaId
     */
    public void setDebaId(String debaId) {
        this.debaId = debaId;
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
     * @return line_id
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * @param lineId
     */
    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    /**
     * 获取出发时间
     *
     * @return depart_time - 出发时间
     */
    public Date getDepartTime() {
        return departTime;
    }

    /**
     * 设置出发时间
     *
     * @param departTime 出发时间
     */
    public void setDepartTime(Date departTime) {
        this.departTime = departTime;
    }

    /**
     * 获取乘坐人数
     *
     * @return passenger_number - 乘坐人数
     */
    public Byte getPassengerNumber() {
        return passengerNumber;
    }

    /**
     * 设置乘坐人数
     *
     * @param passengerNumber 乘坐人数
     */
    public void setPassengerNumber(Byte passengerNumber) {
        this.passengerNumber = passengerNumber;
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
     * 获取行程状态(1:未进行,2:进行中,3:已完成)
     *
     * @return status - 行程状态(1:未进行,2:进行中,3:已完成)
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置行程状态(1:未进行,2:进行中,3:已完成)
     *
     * @param status 行程状态(1:未进行,2:进行中,3:已完成)
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
package com.cc.taxis.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "business_order")
public class BusinessOrder {
    @Id
    @Column(name = "order_id")
    private String orderId;

    /**
     * 发起人ID
     */
    @Column(name = "register_user_id")
    private String registerUserId;

    /**
     * 汽车ID
     */
    @Column(name = "car_id")
    private String carId;

    /**
     * 订单编号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 出行日期
     */
    @Column(name = "trip_date")
    private Date tripDate;

    /**
     * 出行星期
     */
    @Column(name = "trip_week")
    private Byte tripWeek;

    /**
     * 出行时间
     */
    @Column(name = "trip_time")
    private Date tripTime;

    /**
     * 出行方式(1:的士,2:的巴)
     */
    @Column(name = "trip_way")
    private Byte tripWay;

    /**
     * 支付方式(1:微信,2:支付宝,3:银行...)
     */
    @Column(name = "pay_way")
    private Byte payWay;

    /**
     * 区域
     */
    private String region;

    /**
     * 区域码
     */
    @Column(name = "region_code")
    private String regionCode;

    /**
     * 开始地址
     */
    @Column(name = "begin_address")
    private String beginAddress;

    /**
     * 结束地址
     */
    @Column(name = "end_address")
    private String endAddress;

    /**
     * 出发地经度
     */
    @Column(name = "start_longitude")
    private String startLongitude;

    /**
     * 出发地纬度
     */
    @Column(name = "start_latitude")
    private String startLatitude;

    /**
     * 目的地经度
     */
    @Column(name = "end_longitude")
    private String endLongitude;

    /**
     * 目的地纬度
     */
    @Column(name = "end_latitude")
    private String endLatitude;

    /**
     * 状态(1:进行中,2:已完成)
     */
    private Byte status;

    /**
     * 接单开始时间
     */
    @Column(name = "begin_time")
    private Date beginTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

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
     * 订单金额
     */
    private BigDecimal money;

    /**
     * 平台收益
     */
    private BigDecimal profit;

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
     * @return order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取发起人ID
     *
     * @return register_user_id - 发起人ID
     */
    public String getRegisterUserId() {
        return registerUserId;
    }

    /**
     * 设置发起人ID
     *
     * @param registerUserId 发起人ID
     */
    public void setRegisterUserId(String registerUserId) {
        this.registerUserId = registerUserId;
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
     * 获取订单编号
     *
     * @return order_no - 订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单编号
     *
     * @param orderNo 订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取出行日期
     *
     * @return trip_date - 出行日期
     */
    public Date getTripDate() {
        return tripDate;
    }

    /**
     * 设置出行日期
     *
     * @param tripDate 出行日期
     */
    public void setTripDate(Date tripDate) {
        this.tripDate = tripDate;
    }

    /**
     * 获取出行星期
     *
     * @return trip_week - 出行星期
     */
    public Byte getTripWeek() {
        return tripWeek;
    }

    /**
     * 设置出行星期
     *
     * @param tripWeek 出行星期
     */
    public void setTripWeek(Byte tripWeek) {
        this.tripWeek = tripWeek;
    }

    /**
     * 获取出行时间
     *
     * @return trip_time - 出行时间
     */
    public Date getTripTime() {
        return tripTime;
    }

    /**
     * 设置出行时间
     *
     * @param tripTime 出行时间
     */
    public void setTripTime(Date tripTime) {
        this.tripTime = tripTime;
    }

    /**
     * 获取出行方式(1:的士,2:的巴)
     *
     * @return trip_way - 出行方式(1:的士,2:的巴)
     */
    public Byte getTripWay() {
        return tripWay;
    }

    /**
     * 设置出行方式(1:的士,2:的巴)
     *
     * @param tripWay 出行方式(1:的士,2:的巴)
     */
    public void setTripWay(Byte tripWay) {
        this.tripWay = tripWay;
    }

    /**
     * 获取支付方式(1:微信,2:支付宝,3:银行...)
     *
     * @return pay_way - 支付方式(1:微信,2:支付宝,3:银行...)
     */
    public Byte getPayWay() {
        return payWay;
    }

    /**
     * 设置支付方式(1:微信,2:支付宝,3:银行...)
     *
     * @param payWay 支付方式(1:微信,2:支付宝,3:银行...)
     */
    public void setPayWay(Byte payWay) {
        this.payWay = payWay;
    }

    /**
     * 获取区域
     *
     * @return region - 区域
     */
    public String getRegion() {
        return region;
    }

    /**
     * 设置区域
     *
     * @param region 区域
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
     * 获取开始地址
     *
     * @return begin_address - 开始地址
     */
    public String getBeginAddress() {
        return beginAddress;
    }

    /**
     * 设置开始地址
     *
     * @param beginAddress 开始地址
     */
    public void setBeginAddress(String beginAddress) {
        this.beginAddress = beginAddress;
    }

    /**
     * 获取结束地址
     *
     * @return end_address - 结束地址
     */
    public String getEndAddress() {
        return endAddress;
    }

    /**
     * 设置结束地址
     *
     * @param endAddress 结束地址
     */
    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    /**
     * 获取出发地经度
     *
     * @return start_longitude - 出发地经度
     */
    public String getStartLongitude() {
        return startLongitude;
    }

    /**
     * 设置出发地经度
     *
     * @param startLongitude 出发地经度
     */
    public void setStartLongitude(String startLongitude) {
        this.startLongitude = startLongitude;
    }

    /**
     * 获取出发地纬度
     *
     * @return start_latitude - 出发地纬度
     */
    public String getStartLatitude() {
        return startLatitude;
    }

    /**
     * 设置出发地纬度
     *
     * @param startLatitude 出发地纬度
     */
    public void setStartLatitude(String startLatitude) {
        this.startLatitude = startLatitude;
    }

    /**
     * 获取目的地经度
     *
     * @return end_longitude - 目的地经度
     */
    public String getEndLongitude() {
        return endLongitude;
    }

    /**
     * 设置目的地经度
     *
     * @param endLongitude 目的地经度
     */
    public void setEndLongitude(String endLongitude) {
        this.endLongitude = endLongitude;
    }

    /**
     * 获取目的地纬度
     *
     * @return end_latitude - 目的地纬度
     */
    public String getEndLatitude() {
        return endLatitude;
    }

    /**
     * 设置目的地纬度
     *
     * @param endLatitude 目的地纬度
     */
    public void setEndLatitude(String endLatitude) {
        this.endLatitude = endLatitude;
    }

    /**
     * 获取状态(1:进行中,2:已完成)
     *
     * @return status - 状态(1:进行中,2:已完成)
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态(1:进行中,2:已完成)
     *
     * @param status 状态(1:进行中,2:已完成)
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取接单开始时间
     *
     * @return begin_time - 接单开始时间
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * 设置接单开始时间
     *
     * @param beginTime 接单开始时间
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
     * 获取订单金额
     *
     * @return money - 订单金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置订单金额
     *
     * @param money 订单金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取平台收益
     *
     * @return profit - 平台收益
     */
    public BigDecimal getProfit() {
        return profit;
    }

    /**
     * 设置平台收益
     *
     * @param profit 平台收益
     */
    public void setProfit(BigDecimal profit) {
        this.profit = profit;
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
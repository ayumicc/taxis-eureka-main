package com.cc.taxis.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "deba_line")
public class DebaLine {
    @Id
    @Column(name = "line_id")
    private String lineId;

    @Column(name = "deba_id")
    private String debaId;

    /**
     * 线路名称
     */
    @Column(name = "line_name")
    private String lineName;

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
     * 出发地
     */
    @Column(name = "start_address")
    private String startAddress;

    /**
     * 目的地
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
     * 有效年限
     */
    @Column(name = "start_valid_date")
    private Date startValidDate;

    /**
     * 有效年限
     */
    @Column(name = "end_valid_date")
    private Date endValidDate;

    /**
     * 每日班次
     */
    @Column(name = "everyday_number")
    private Byte everydayNumber;

    /**
     * 公里
     */
    private Byte kilometre;

    /**
     * 座位数
     */
    @Column(name = "seat_number")
    private Byte seatNumber;

    /**
     * 行程分钟数
     */
    private Byte minute;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 1:新建,2:审批中,3:已通过,4:未通过
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
     * 获取线路名称
     *
     * @return line_name - 线路名称
     */
    public String getLineName() {
        return lineName;
    }

    /**
     * 设置线路名称
     *
     * @param lineName 线路名称
     */
    public void setLineName(String lineName) {
        this.lineName = lineName;
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
     * 获取出发地
     *
     * @return start_address - 出发地
     */
    public String getStartAddress() {
        return startAddress;
    }

    /**
     * 设置出发地
     *
     * @param startAddress 出发地
     */
    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    /**
     * 获取目的地
     *
     * @return end_address - 目的地
     */
    public String getEndAddress() {
        return endAddress;
    }

    /**
     * 设置目的地
     *
     * @param endAddress 目的地
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
     * 获取有效年限
     *
     * @return start_valid_date - 有效年限
     */
    public Date getStartValidDate() {
        return startValidDate;
    }

    /**
     * 设置有效年限
     *
     * @param startValidDate 有效年限
     */
    public void setStartValidDate(Date startValidDate) {
        this.startValidDate = startValidDate;
    }

    /**
     * 获取有效年限
     *
     * @return end_valid_date - 有效年限
     */
    public Date getEndValidDate() {
        return endValidDate;
    }

    /**
     * 设置有效年限
     *
     * @param endValidDate 有效年限
     */
    public void setEndValidDate(Date endValidDate) {
        this.endValidDate = endValidDate;
    }

    /**
     * 获取每日班次
     *
     * @return everyday_number - 每日班次
     */
    public Byte getEverydayNumber() {
        return everydayNumber;
    }

    /**
     * 设置每日班次
     *
     * @param everydayNumber 每日班次
     */
    public void setEverydayNumber(Byte everydayNumber) {
        this.everydayNumber = everydayNumber;
    }

    /**
     * 获取公里
     *
     * @return kilometre - 公里
     */
    public Byte getKilometre() {
        return kilometre;
    }

    /**
     * 设置公里
     *
     * @param kilometre 公里
     */
    public void setKilometre(Byte kilometre) {
        this.kilometre = kilometre;
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
     * 获取行程分钟数
     *
     * @return minute - 行程分钟数
     */
    public Byte getMinute() {
        return minute;
    }

    /**
     * 设置行程分钟数
     *
     * @param minute 行程分钟数
     */
    public void setMinute(Byte minute) {
        this.minute = minute;
    }

    /**
     * 获取单价
     *
     * @return price - 单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置单价
     *
     * @param price 单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取1:新建,2:审批中,3:已通过,4:未通过
     *
     * @return status - 1:新建,2:审批中,3:已通过,4:未通过
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置1:新建,2:审批中,3:已通过,4:未通过
     *
     * @param status 1:新建,2:审批中,3:已通过,4:未通过
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
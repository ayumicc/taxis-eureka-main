package com.cc.taxis.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "bus_scheduling")
public class BusScheduling {
    @Id
    @Column(name = "scheduling_id")
    private String schedulingId;

    @Column(name = "bus_id")
    private String busId;

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
     * 出发时间
     */
    @Column(name = "depart_time")
    private Date departTime;

    /**
     * 乘车地址(车站)
     */
    @Column(name = "begin_site")
    private String beginSite;

    /**
     * 到站地址(车站)
     */
    @Column(name = "end_site")
    private String endSite;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 行程状态(1:启用,2:停用)
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
     * @return bus_id
     */
    public String getBusId() {
        return busId;
    }

    /**
     * @param busId
     */
    public void setBusId(String busId) {
        this.busId = busId;
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
     * 获取乘车地址(车站)
     *
     * @return begin_site - 乘车地址(车站)
     */
    public String getBeginSite() {
        return beginSite;
    }

    /**
     * 设置乘车地址(车站)
     *
     * @param beginSite 乘车地址(车站)
     */
    public void setBeginSite(String beginSite) {
        this.beginSite = beginSite;
    }

    /**
     * 获取到站地址(车站)
     *
     * @return end_site - 到站地址(车站)
     */
    public String getEndSite() {
        return endSite;
    }

    /**
     * 设置到站地址(车站)
     *
     * @param endSite 到站地址(车站)
     */
    public void setEndSite(String endSite) {
        this.endSite = endSite;
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
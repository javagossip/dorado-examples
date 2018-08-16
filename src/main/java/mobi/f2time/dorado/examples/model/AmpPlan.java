package mobi.f2time.dorado.examples.model;

import java.util.Date;

public class AmpPlan {
    private Integer id;

    private String planName;

    private Integer planLimit;

    private Integer limitState;

    private Integer runState;

    private Integer planState;

    private Integer createUser;

    private Date createTime;

    private Date updateTime;

    private Integer opUser;

    private Integer opUserType;

    private Integer deliveryMode;

    private Integer platform;

    private String impMonitorUrl;

    private String clkMonitorUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public Integer getPlanLimit() {
        return planLimit;
    }

    public void setPlanLimit(Integer planLimit) {
        this.planLimit = planLimit;
    }

    public Integer getRunState() {
        return runState;
    }

    public void setRunState(Integer runState) {
        this.runState = runState;
    }

    public Integer getPlanState() {
        return planState;
    }

    public void setPlanState(Integer planState) {
        this.planState = planState;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getOpUser() {
        return opUser;
    }

    public void setOpUser(Integer opUser) {
        this.opUser = opUser;
    }

    public Integer getOpUserType() {
        return opUserType;
    }

    public void setOpUserType(Integer opUserType) {
        this.opUserType = opUserType;
    }

    public Integer getLimitState() {
        return limitState;
    }

    public void setLimitState(Integer limitState) {
        this.limitState = limitState;
    }

    public Integer getDeliveryMode() {
        return deliveryMode;
    }

    public void setDeliveryMode(Integer deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public String getImpMonitorUrl() {
        return impMonitorUrl;
    }

    public void setImpMonitorUrl(String impMonitorUrl) {
        this.impMonitorUrl = impMonitorUrl;
    }

    public String getClkMonitorUrl() {
        return clkMonitorUrl;
    }

    public void setClkMonitorUrl(String clkMonitorUrl) {
        this.clkMonitorUrl = clkMonitorUrl;
    }
}
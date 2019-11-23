package org.dragonli.service.modules.accountservice.entity.models;

import org.dragonli.jpatools.store.AbstractEntity;
import org.dragonli.service.modules.accountservice.entity.enums.DepositStatus;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="deposit")
@Proxy(lazy = false)
public class DepositEntity extends AbstractEntity {

    private static final long serialVersionUID = 2345333395449832562L;

    @Column(name="tx_id",nullable = false)
    private String txId;

    @Column(name="account_id",nullable = false)
    private Long accountId;

    @Column(name="business_id")
    private Long businessId;


    @Column(nullable = false)
    private BigDecimal flowAmount;

    @Column(name="deposit_status",nullable = true)
    @Enumerated(EnumType.STRING)
    private DepositStatus depositStatus;


    @Column(nullable = true)
    private String info;

    @Column(name="extended_info",nullable = true)
    private String extendedInfo;

    @Column(nullable = true)
    private String remark;

    @Column(name="out_time",nullable = true)
    private long outTime;

    @Column(nullable = true)
    private String currency;

    @Column(name="order_id",nullable = false)
    private Long orderId;

//	@Column(name="steps",nullable = false)
//	private int steps;
//
//	@Column(name="current_step",nullable = false)
//	private int currentStep;

    @Column(name="user_id",nullable = false)
    private Long userId;

    @Column(name="reflex_id",nullable = false)
    private String reflexId;

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public BigDecimal getFlowAmount() {
        return flowAmount;
    }

    public void setFlowAmount(BigDecimal flowAmount) {
        this.flowAmount = flowAmount;
    }

    public DepositStatus getDepositStatus() {
        return depositStatus;
    }

    public void setDepositStatus(DepositStatus depositStatus) {
        this.depositStatus = depositStatus;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getExtendedInfo() {
        return extendedInfo;
    }

    public void setExtendedInfo(String extendedInfo) {
        this.extendedInfo = extendedInfo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public long getOutTime() {
        return outTime;
    }

    public void setOutTime(long outTime) {
        this.outTime = outTime;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getReflexId() {
        return reflexId;
    }

    public void setReflexId(String reflexId) {
        this.reflexId = reflexId;
    }
}

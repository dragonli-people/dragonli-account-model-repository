package org.dragonli.service.modules.accountservice.entity.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.dragonli.jpatools.store.AbstractEntity;
import org.dragonli.service.modules.accountservice.entity.enums.AccountAdjustmentStatus;
import org.hibernate.annotations.Proxy;

@Entity
@Table(name="account_adjustment")
@Proxy(lazy=false)
public class AccountAdjustmentEntity extends AbstractEntity {
	
	@Column(name="order_id",nullable = false)
    private String orderId;

	@Column(name="flow_amount",nullable = false)
	private BigDecimal flowAmount;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private AccountAdjustmentStatus status;

	@Column(nullable = false)
	private String info;

	@Column(nullable = false)
	private String remark;

	@Column(name="out_time",nullable = false)
	private Long outTime;

	@Column(nullable = false)
	private String currency;

	@Column(name="reflex_id",nullable = false)
	private String reflexId;

	@Column(name="user_id",nullable = false)
	private Long userId;

    @Column(name="account_id",nullable = false)
	private Long accountId;

    @Column(name="business_id",nullable = false)
    private Long businessId;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public BigDecimal getFlowAmount() {
		return flowAmount;
	}

	public void setFlowAmount(BigDecimal flowAmount) {
		this.flowAmount = flowAmount;
	}

	public AccountAdjustmentStatus getStatus() {
		return status;
	}

	public void setStatus(AccountAdjustmentStatus status) {
		this.status = status;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getOutTime() {
		return outTime;
	}

	public void setOutTime(Long outTime) {
		this.outTime = outTime;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getReflexId() {
		return reflexId;
	}

	public void setReflexId(String reflexId) {
		this.reflexId = reflexId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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
}

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

    /**
     * 拟弃用
     */
    @Column(name="account_version",nullable = false)
    private Integer accountVersion;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getAccountVersion() {
		return accountVersion;
	}

	public void setAccountVersion(Integer accountVersion) {
		this.accountVersion = accountVersion;
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

	public String getTokenUrl() {
		return tokenUrl;
	}

	public void setTokenUrl(String tokenUrl) {
		this.tokenUrl = tokenUrl;
	}

	public String getFlowType() {
		return flowType;
	}

	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public Long getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnuserId() {
		return enuserId;
	}

	public void setEnuserId(String enuserId) {
		this.enuserId = enuserId;
	}

	/**
	 * 拟弃用
	 */
    
    @Column(nullable = false)
    private BigDecimal flowAmount;

    @Column(nullable = true)
    @Enumerated(EnumType.STRING)
    private AccountAdjustmentStatus status;
    
    @Column(nullable = true)
    private String info;
    
    @Column(nullable = true)
    private String remark;
    
    @Column(name="out_time",nullable = true)
    private long outTime;
	
	@Column(nullable = true)
	private String currency;
	
	@Column(name="token_url",nullable = true)
	private String tokenUrl;
	
	@Column(name="flow_type",nullable = true)
	private String flowType;
	
	@Column(name="owner_id",nullable = false)
	private Long ownerId;
	
	@Column(name="enterprise_id",nullable = true)
	private Long enterpriseId;

	@Column(name="application_id",nullable = true)
	private Long applicationId;
	
	@Column(name="enuser_id",nullable = true)
	private String enuserId;
	
	@Column(name="user_id",nullable = true)
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
}

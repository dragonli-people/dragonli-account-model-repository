package org.dragonli.service.modules.accountservice.entity.models;

import java.math.BigDecimal;

import javax.persistence.*;

import org.dragonli.jpatools.store.AbstractEntity;
import org.dragonli.service.modules.accountservice.entity.enums.BusinessFlowType;
import org.dragonli.service.modules.accountservice.entity.enums.BusinessStatus;
import org.hibernate.annotations.Proxy;

@Entity
@Table(name="business")
@Proxy(lazy = false)
public class BusinessEntity extends AbstractEntity {

	
	@Column(name="enterprise_id",nullable = false)
    private Long enterpriseId;
	
	@Column(name="user_id",nullable = false)
    private String userId;
	
	
	@Column(name="steps")
    private int steps;
	
	
	@Column(name="account_version",nullable = false)
    private int accountVersion;
	
	@Column(name="order_id",nullable = false)
    private String orderId;
	
	@Column(name="remark",nullable = false)
	private String remark;
	
	@Column(name="currency",nullable = false)
	private String currency;
	
	
	@Column(name="owner_id",nullable = false)
	private Long ownerId;
	
	@Column(name="current_step",nullable = false)
	private int currentStep;

	//将来应改名为 referenceId
	@Column(name="tran_id",nullable = false)
	private Long tranId;
	
	@Column(name="token_url",nullable = false)
	private String tokenUrl;

	@Enumerated(EnumType.STRING)
	@Column(name="status",nullable = false)
	private BusinessStatus status;
	
	public BusinessStatus getStatus() {
		return status;
	}

	@Enumerated(EnumType.STRING)
	@Column(name="type",nullable = false)
	private BusinessFlowType type;

	public void setStatus(BusinessStatus status) {
		this.status = status;
	}


	public String getTokenUrl() {
		return tokenUrl;
	}


	public void setTokenUrl(String tokenUrl) {
		this.tokenUrl = tokenUrl;
	}


	public Long getTranId() {
		return tranId;
	}


	public void setTranId(Long tranId) {
		this.tranId = tranId;
	}


	public int getCurrentStep() {
		return currentStep;
	}


	public void setCurrentStep(int currentStep) {
		this.currentStep = currentStep;
	}


	public Long getOwnerId() {
		return ownerId;
	}


	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public BigDecimal getAmount() {
		return amount;
	}


	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}


	@Column(name="amount",nullable = false)
	private BigDecimal amount;


	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId2) {
		this.orderId = orderId2;
	}


	public BusinessFlowType getType() {
		return type;
	}


	public void setType(BusinessFlowType type) {
		this.type = type;
	}


	public Long getEnterpriseId() {
		return enterpriseId;
	}


	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public int getSteps() {
		return steps;
	}


	public void setSteps(int steps) {
		this.steps = steps;
	}


	public int getAccountVersion() {
		return accountVersion;
	}


	public void setAccountVersion(int accountVersion) {
		this.accountVersion = accountVersion;
	}
	
}

package org.dragonli.service.modules.accountservice.entity.models;

import org.dragonli.jpatools.store.AbstractEntity;
import org.dragonli.service.modules.accountservice.entity.enums.EvidenceStatus;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="fund_flow_evidence")
@Proxy(lazy = false)
public class FundFlowEvidenceEntity extends AbstractEntity {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Column(name="account_id",nullable = false)
    private Long accountId;
	
	@Column(name="flow_amount",nullable = false)
    private BigDecimal flowAmount;
	
	
	@Column(name="timeout",nullable = false)
    private Long timeout;
	
	
	@Column(name="user_id",nullable = false)
    private Long userId;
	
	@Column(name="currency",nullable = false)
    private String currency;

	@Column(name="call_back_handled",nullable = false)
	private Boolean callBackHandled;
	
	@Column(name="flow_status",nullable = false)
	@Enumerated(EnumType.STRING)
    private EvidenceStatus flowStatus;
	
	@Column(name="order_id",nullable = false)
    private String orderId;

	
	@Column(name="business_id",nullable = false)
    private Long businessId;

	@Column(name="step",nullable = false)
    private int step;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public BigDecimal getFlowAmount() {
		return flowAmount;
	}

	public void setFlowAmount(BigDecimal flowAmount) {
		this.flowAmount = flowAmount;
	}

	public Long getTimeout() {
		return timeout;
	}

	public void setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public EvidenceStatus getFlowStatus() {
		return flowStatus;
	}

	public void setFlowStatus(EvidenceStatus flowStatus) {
		this.flowStatus = flowStatus;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Boolean getCallBackHandled() {
		return callBackHandled;
	}

	public void setCallBackHandled(Boolean callBackHandled) {
		this.callBackHandled = callBackHandled;
	}
}

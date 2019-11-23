package org.dragonli.service.modules.accountservice.entity.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.dragonli.jpatools.store.AbstractEntity;
import org.dragonli.service.modules.accountservice.entity.enums.AccountType;
import org.dragonli.service.modules.accountservice.entity.enums.EvidenceStatus;
import org.hibernate.annotations.Proxy;

@Entity
@Table(name="fund_flow_evidence")
@Proxy(lazy = false)
public class FundFlowEvidenceEntity extends AbstractEntity {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Column(name="accountId",nullable = false)
    private Long accountId;
	
	
	@Column(name="balance",nullable = false)
    private BigDecimal balance;
	
	
	@Column(name="flowAmount",nullable = false)
    private BigDecimal flowAmount;
	
	
	@Column(name="timeout",nullable = false)
    private Long timeout;
	
	
	@Column(name="userId",nullable = false)
    private String userId;
	
	
	@Column(name="account_type",nullable = false)
    private AccountType accountType;
	
	@Column(name="currency",nullable = false)
    private String currency;
	
	@Column(name="flow_status",nullable = false)
	@Enumerated(EnumType.STRING)
    private EvidenceStatus flowStatus;
	
	@Column(name="flow_type",nullable = true)
    private String flowType;
	
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

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
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

	public String getFlowType() {
		return flowType;
	}

	public void setFlowType(String flowType) {
		this.flowType = flowType;
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
}

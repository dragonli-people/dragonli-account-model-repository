package org.dragonli.service.modules.accountservice.entity.models;

import org.dragonli.jpatools.store.AbstractEntity;
import org.dragonli.service.modules.accountservice.entity.enums.AccountAssetsRecordStatus;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author liwenyu
 * 资产变更记录
 */
@Entity
@Table(name="account_assets_record")
@Proxy(lazy = false)
public class AccountAssetsRecordEntity extends AbstractEntity {

	private static final long serialVersionUID = 7092052195929832562L;
	

	
	/**
	 *
	 */
	@Column(name="group_id",nullable = false)
	private Integer groupId;

	/**
	 *
	 */
	@Column(name="order_id",nullable = false)
	private String orderId;

	/**
	 *
	 */
	@Column(name="account_id",nullable = false)
	private Long accountId;

	/**
	 *
	 */
	@Column(name="asset_id",nullable = false)
	private Long assetId;

	/**
	 *
	 */
	@Column(name="flow_amount",nullable = false)
	private BigDecimal flowAmount;

	/**
	 *
	 */
	@Column(name="before_balance",nullable = false)
	private BigDecimal beforeBalance;

	/**
	 *
	 */
	@Column(name="after_balance",nullable = false)
	private BigDecimal afterBalance;

	/**
	 *
	 */
	@Column(name="before_frozen",nullable = false)
	private BigDecimal beforeFrozen;

	/**
	 *
	 */
	@Column(name="after_frozen",nullable = true)
	private BigDecimal afterFrozen;

	/**
	 *
	 */
	@Column(name="account_version",nullable = true)
	private Integer accountVersion;

	/**
	 *
	 */
	@Column(nullable = false)
	private String remark;

	/**
	 *
	 */
	@Column(name = "record_status")
	@Enumerated(EnumType.STRING)
	private AccountAssetsRecordStatus recordStatus;

	
	@Column(name = "user_id",nullable = false)
	private String userId;
	
	@Column(name = "evidence_id",nullable = false)
	private Long evidenceId;
	
	@Column(nullable = false)
	private String currency;
	
	@Column(nullable = false)
	private Boolean status;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getEvidenceId() {
		return evidenceId;
	}

	public void setEvidenceId(Long evidenceId) {
		this.evidenceId = evidenceId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getAssetId() {
		return assetId;
	}

	public void setAssetId(Long assetId) {
		this.assetId = assetId;
	}

	public BigDecimal getFlowAmount() {
		return flowAmount;
	}

	public void setFlowAmount(BigDecimal flowAmount) {
		this.flowAmount = flowAmount;
	}

	public BigDecimal getBeforeBalance() {
		return beforeBalance;
	}

	public void setBeforeBalance(BigDecimal beforeBalance) {
		this.beforeBalance = beforeBalance;
	}

	public BigDecimal getAfterBalance() {
		return afterBalance;
	}

	public void setAfterBalance(BigDecimal afterBalance) {
		this.afterBalance = afterBalance;
	}

	public BigDecimal getBeforeFrozen() {
		return beforeFrozen;
	}

	public void setBeforeFrozen(BigDecimal beforeFrozen) {
		this.beforeFrozen = beforeFrozen;
	}

	public BigDecimal getAfterFrozen() {
		return afterFrozen;
	}

	public void setAfterFrozen(BigDecimal afterFrozen) {
		this.afterFrozen = afterFrozen;
	}

	public Integer getAccountVersion() {
		return accountVersion;
	}

	public void setAccountVersion(Integer accountVersion) {
		this.accountVersion = accountVersion;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public AccountAssetsRecordStatus getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(AccountAssetsRecordStatus recordStatus) {
		this.recordStatus = recordStatus;
	}
}

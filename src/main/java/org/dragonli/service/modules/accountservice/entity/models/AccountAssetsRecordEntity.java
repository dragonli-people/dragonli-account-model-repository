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
	@Column(name="owner_id",nullable = false)
	private Long ownerId;

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
	@Column(name="flow_type_record",nullable = false)
	private String flowTypeRecord;

	/**
	 *
	 */
	@Column(name="owner_type_record",nullable = true)
	private String ownerTypeRecord;

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

	
	@Column(name = "userId",nullable = false)
	private String userId;
	
	@Column(name = "evidenceId",nullable = false)
	private Long evidenceId;
	
	@Column(nullable = false)
	private String currency;
	
	@Column(name = "status",nullable = false)
	private boolean status;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
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

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
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

	public String getFlowTypeRecord() {
		return flowTypeRecord;
	}

	public void setFlowTypeRecord(String flowTypeRecord) {
		this.flowTypeRecord = flowTypeRecord;
	}

	public String getOwnerTypeRecord() {
		return ownerTypeRecord;
	}

	public void setOwnerTypeRecord(String ownerTypeRecord) {
		this.ownerTypeRecord = ownerTypeRecord;
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

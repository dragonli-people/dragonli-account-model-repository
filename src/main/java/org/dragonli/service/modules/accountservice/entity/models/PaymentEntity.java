package org.dragonli.service.modules.accountservice.entity.models;

import org.dragonli.jpatools.store.AbstractEntity;
import org.dragonli.service.modules.accountservice.entity.enums.PaymentStatus;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="payment")
@Proxy(lazy = false)
public class PaymentEntity extends AbstractEntity {
    private static final long serialVersionUID = 2345052195929832562L;

    /**
     *
     */
    @Column(name="order_id",nullable = false)
    private String orderId;

    /**
     *
     */
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;
    
    
    @Column
    private String info;
    
    
    @Column
    private String remark;

//	@Column(name="business_paras",nullable = false)
//    private String businessParas;

    @Column(name="out_time",nullable = false)
    private long outTime;

	@Column(nullable = false)
	private String currency;
	
	@Column(name="extend_info")
	private String extendInfo;

	@Column(name="business_id",nullable = false)
	private Long businessId;

	@Column(name="from_account_id",nullable = false)
	private Long fromAccountId;

	@Column(name="to_account_id",nullable = false)
	private Long toAccountId;

	@Column(name="user_id",nullable = false)
	private Long userId;

	@Column(nullable = false)
	private String target;

	@Column(nullable = false)
	private BigDecimal amount;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public PaymentStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentStatus status) {
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

//	public String getBusinessParas() {
//		return businessParas;
//	}
//
//	public void setBusinessParas(String businessParas) {
//		this.businessParas = businessParas;
//	}

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

	public String getExtendInfo() {
		return extendInfo;
	}

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public Long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	public Long getFromAccountId() {
		return fromAccountId;
	}

	public void setFromAccountId(Long fromAccountId) {
		this.fromAccountId = fromAccountId;
	}

	public Long getToAccountId() {
		return toAccountId;
	}

	public void setToAccountId(Long toAccountId) {
		this.toAccountId = toAccountId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}

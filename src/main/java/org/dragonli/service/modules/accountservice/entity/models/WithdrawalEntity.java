package org.dragonli.service.modules.accountservice.entity.models;

import org.dragonli.jpatools.store.AbstractEntity;
import org.dragonli.service.modules.accountservice.entity.enums.WithdrawalStatus;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="withdrawal")
@Proxy(lazy = false)
public class WithdrawalEntity extends AbstractEntity {
    private static final long serialVersionUID = 23451447789832562L;

    /**
     *
     */
    @Column(name="order_id",nullable = false)
    private String orderId;

    /**
     *
     */
    @Column(name="back_order_id",nullable = false)
    private String backOrderId;


//  withdrawal_account_version_id int(11) NOT NULL,
//  withdrawal_child_account_version_id int(11) ,

    /**
     *
     */
    @Column(name="withdrawal_account_id",nullable = false)
    private Long withdrawalAccountId;

    /**
     *
     */
    @Column(name="withdrawal_business_id",nullable = false)
    private Long withdrawalBusinessId;
    /**
     *
     */
    @Column(name="withdrawal_back_business_id",nullable = false)
    private Long withdrawalBackBusinessId;

    /**
     *
     */
    @Column(name="user_id",nullable = false)
    private Long userId;
    /**
     *
     */
    @Column(name="reflex_id",nullable = false)
    private String reflexId;


    /**
     *
     */
    @Column(name="withdrawal_user_id")
    private Long withdrawalUserId;

    /**
     *
     */
    @Column(nullable = false)
    private BigDecimal amount;
    /**
     *
     */
    @Column(name="final_amount",nullable = false)
    private BigDecimal finalAmount;

    /**
     *
     */
    @Column(nullable = false)
    private String currency;

    /**
     *
     */
    @Column(nullable = false)
    private BigDecimal fees;

    /**
     *
     */
    @Column(name="extended_info")
    private String extendedInfo;

    /**
     *
     */
    @Column
    private String param;

    @Column(name="tp_id")
    private String tpId;

    @Column(name="tx_id")
    private String txId;

    @Column
    private String remark;

    @Column(name="status",nullable = false)
    @Enumerated(EnumType.STRING)
    private WithdrawalStatus status;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBackOrderId() {
        return backOrderId;
    }

    public void setBackOrderId(String backOrderId) {
        this.backOrderId = backOrderId;
    }

    public Long getWithdrawalAccountId() {
        return withdrawalAccountId;
    }

    public void setWithdrawalAccountId(Long withdrawalAccountId) {
        this.withdrawalAccountId = withdrawalAccountId;
    }

    public Long getWithdrawalBusinessId() {
        return withdrawalBusinessId;
    }

    public void setWithdrawalBusinessId(Long withdrawalBusinessId) {
        this.withdrawalBusinessId = withdrawalBusinessId;
    }

    public Long getWithdrawalBackBusinessId() {
        return withdrawalBackBusinessId;
    }

    public void setWithdrawalBackBusinessId(Long withdrawalBackBusinessId) {
        this.withdrawalBackBusinessId = withdrawalBackBusinessId;
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

    public Long getWithdrawalUserId() {
        return withdrawalUserId;
    }

    public void setWithdrawalUserId(Long withdrawalUserId) {
        this.withdrawalUserId = withdrawalUserId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(BigDecimal finalAmount) {
        this.finalAmount = finalAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getFees() {
        return fees;
    }

    public void setFees(BigDecimal fees) {
        this.fees = fees;
    }

    public String getExtendedInfo() {
        return extendedInfo;
    }

    public void setExtendedInfo(String extendedInfo) {
        this.extendedInfo = extendedInfo;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getTpId() {
        return tpId;
    }

    public void setTpId(String tpId) {
        this.tpId = tpId;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public WithdrawalStatus getStatus() {
        return status;
    }

    public void setStatus(WithdrawalStatus status) {
        this.status = status;
    }
}

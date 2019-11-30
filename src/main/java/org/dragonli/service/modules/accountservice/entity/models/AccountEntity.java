package org.dragonli.service.modules.accountservice.entity.models;

import org.dragonli.jpatools.store.AbstractEntity;
import org.dragonli.service.modules.accountservice.entity.enums.AccountsStatus;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="account")
@Proxy(lazy = false)
public class AccountEntity extends AbstractEntity {
    private static final long serialVersionUID = 2345052195929832562L;

    /**
     *
     */
    @Column(name="asset_id",nullable = false)
    private Long assetId;

    /**
     *
     */
    @Column(nullable = false)
    private String currency;

    /**
     *
     */
    @Column(nullable = false)
    private BigDecimal balance;

    /**
     *
     */
    @Column(name="frozen",nullable = false)
    private BigDecimal frozen;

    /**
     *
     */
    @Column(name="user_id",nullable = false)
    private Long userId;

    /**
     *
     */
    @Column(name="application_id",nullable = false)
    private Long applicationId;

    /**
     *
     */
    @Column(name="account_version",nullable = false)
    private Integer accountVersion;
    
    
    @Column(name="reflex_id",nullable = false)
    private String reflexId;
    
    
    @Column(nullable = false)
    private BigDecimal overdraft;

	public String getReflexId() {
		return reflexId;
	}

	public void setReflexId(String reflexId) {
		this.reflexId = reflexId;
	}

	public BigDecimal getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(BigDecimal overdraft) {
		this.overdraft = overdraft;
	}

	/**
     *
     */
    @Column(nullable = true)
    @Enumerated(EnumType.STRING)
    private AccountsStatus status;


    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getFrozen() {
        return frozen;
    }

    public void setFrozen(BigDecimal frozen) {
        this.frozen = frozen;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getAccountVersion() {
        return accountVersion;
    }

    public void setAccountVersion(Integer accountVersion) {
        this.accountVersion = accountVersion;
    }

    public AccountsStatus getStatus() {
        return status;
    }

    public void setStatus(AccountsStatus status) {
        this.status = status;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }
}

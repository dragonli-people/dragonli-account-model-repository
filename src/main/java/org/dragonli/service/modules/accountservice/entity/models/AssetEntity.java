package org.dragonli.service.modules.accountservice.entity.models;


import org.dragonli.jpatools.store.AbstractEntity;
import org.dragonli.service.modules.accountservice.entity.enums.AssetType;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="asset")
@Proxy(lazy = false)
public class AssetEntity extends AbstractEntity {
    private static final long serialVersionUID = 2345112235929832562L;


    /**
     *
     */
    @Column(nullable = false)
    private String currency;

    /**
     *
     */
    @Column(nullable = false)
    private Boolean status;

    /**
     *
     */
    @Column(name="disable_status",nullable = false)
    private Boolean disableStatus;


    /**
     *
     */
    @Column(name="asset_type",nullable = false)
    @Enumerated(EnumType.STRING)
    private AssetType assetType;

    @Column(name="disable_deposite")
    private Boolean disableDeposite;

    @Column(name="disable_withdrawal")
    private Boolean disableWithdrawal;

    @Column(name="cny_rate")
    private BigDecimal cnyRate;

    @Column
    private BigDecimal fee;

    @Column(name="withdrawal_min")
    private BigDecimal withdrawalMin;

    @Column(name="withdrawal_day_limit")
    private BigDecimal withdrawalDayLimit;
    
    @Column(name="keep_decimal")
    private BigDecimal keepDecimal;
    
    @Column(name="contract_address")
    private String contractAddress;

    public String getContractAddress() {
		return contractAddress;
	}

	public void setContractAddress(String contractAddress) {
		this.contractAddress = contractAddress;
	}

	public BigDecimal getKeepDecimal() {
		return keepDecimal;
	}

	public void setKeepDecimal(BigDecimal keepDecimal) {
		this.keepDecimal = keepDecimal;
	}

	public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getDisableStatus() {
        return disableStatus;
    }

    public void setDisableStatus(Boolean disableStatus) {
        this.disableStatus = disableStatus;
    }

    public AssetType getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetType assetType) {
        this.assetType = assetType;
    }

    public Boolean getDisableDeposite() {
        return disableDeposite;
    }

    public void setDisableDeposite(Boolean disableDeposite) {
        this.disableDeposite = disableDeposite;
    }

    public Boolean getDisableWithdrawal() {
        return disableWithdrawal;
    }

    public void setDisableWithdrawal(Boolean disableWithdrawal) {
        this.disableWithdrawal = disableWithdrawal;
    }

    public BigDecimal getCnyRate() {
        return cnyRate;
    }

    public void setCnyRate(BigDecimal cnyRate) {
        this.cnyRate = cnyRate;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getWithdrawalMin() {
        return withdrawalMin;
    }

    public void setWithdrawalMin(BigDecimal withdrawalMin) {
        this.withdrawalMin = withdrawalMin;
    }

    public BigDecimal getWithdrawalDayLimit() {
        return withdrawalDayLimit;
    }

    public void setWithdrawalDayLimit(BigDecimal withdrawalDayLimit) {
        this.withdrawalDayLimit = withdrawalDayLimit;
    }
}

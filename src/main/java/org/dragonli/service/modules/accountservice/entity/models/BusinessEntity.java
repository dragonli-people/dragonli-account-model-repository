package org.dragonli.service.modules.accountservice.entity.models;

import javax.persistence.*;

import org.dragonli.jpatools.store.AbstractEntity;
import org.dragonli.service.modules.accountservice.entity.enums.BusinessFlowType;
import org.dragonli.service.modules.accountservice.entity.enums.BusinessStatus;
import org.hibernate.annotations.Proxy;

@Entity
@Table(name="business")
@Proxy(lazy = false)
public class BusinessEntity extends AbstractEntity {
	
	@Column(name="steps")
    private int steps;
	
	@Column(name="order_id",nullable = false)
    private String orderId;
	
	@Column(name="remark",nullable = false)
	private String remark;

	@Column(name="current_step",nullable = false)
	private int currentStep;

	@Column(name="reference_id",nullable = false)
	private Long referenceId;

	@Enumerated(EnumType.STRING)
	@Column(name="status",nullable = false)
	private BusinessStatus status;
	
	public BusinessStatus getStatus() {
		return status;
	}

	@Enumerated(EnumType.STRING)
	@Column(name="type",nullable = false)
	private BusinessFlowType type;

	@Column(name="step_parameter",nullable = false)
	private String stepParameter;

	public void setStatus(BusinessStatus status) {
		this.status = status;
	}

	public Long getReferenceId() {
		return referenceId;
	}


	public void setReferenceId(Long referenceId) {
		this.referenceId = referenceId;
	}


	public int getCurrentStep() {
		return currentStep;
	}


	public void setCurrentStep(int currentStep) {
		this.currentStep = currentStep;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


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


	public int getSteps() {
		return steps;
	}


	public void setSteps(int steps) {
		this.steps = steps;
	}

	public String getStepParameter() {
		return stepParameter;
	}

	public void setStepParameter(String stepParameter) {
		this.stepParameter = stepParameter;
	}
}

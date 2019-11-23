package org.dragonli.service.modules.accountservice.repository;

import java.util.List;

import org.dragonli.service.modules.accountservice.entity.models.FundFlowEvidenceEntity;
import org.dragonli.service.modules.accountservice.repository.expand.IAccountRepositoryExpand;

public interface FundFlowEvidenceRepository extends IAccountRepositoryExpand<FundFlowEvidenceEntity,Long> {
	FundFlowEvidenceEntity findByAccountIdAndAccountVersion(long accountId, int version);
	FundFlowEvidenceEntity findByBusinessIdAndStep(long businessId, int step);
	List<FundFlowEvidenceEntity> findByBusinessIdAndStepAfter(long businessId, int step);
	
}

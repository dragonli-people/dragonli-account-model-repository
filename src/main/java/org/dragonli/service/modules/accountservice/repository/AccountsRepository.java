package org.dragonli.service.modules.accountservice.repository;

import org.dragonli.service.modules.accountservice.entity.models.AccountEntity;
import org.dragonli.service.modules.accountservice.repository.expand.IAccountRepositoryExpand;

import java.util.List;

public interface AccountsRepository extends IAccountRepositoryExpand<AccountEntity,Long>
{
	AccountEntity findByUserIdAndReflexIdAndCurrency(long userId, String reflexId, String currency);

//	AccountEntity findByApplicationIdAndReflexIdAndCurrency(long applicationId, String reflexId, String currency);

	List<AccountEntity> findByUserIdAndReflexId(long userId, String reflexId);
//	List<AccountEntity> findAllByApplicationIdAndReflexId(long applicationId, String reflexId);
	
	List<AccountEntity> findByUserId(long userId);
}

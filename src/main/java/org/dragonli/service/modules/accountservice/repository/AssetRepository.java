package org.dragonli.service.modules.accountservice.repository;

import org.dragonli.service.modules.accountservice.entity.models.AssetEntity;
import org.dragonli.service.modules.accountservice.repository.expand.IAccountRepositoryExpand;

public interface AssetRepository extends IAccountRepositoryExpand<AssetEntity,Long> {
	AssetEntity findByCode(String code);
}

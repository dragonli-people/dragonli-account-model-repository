package org.dragonli.service.modules.accountservice.utils;

import org.dragonli.service.modules.accountservice.entity.enums.EvidenceStatus;
import org.dragonli.service.modules.accountservice.entity.models.AccountEntity;
import org.dragonli.service.modules.accountservice.entity.models.AssetEntity;
import org.dragonli.service.modules.accountservice.entity.models.FundFlowEvidenceEntity;
import org.dragonli.service.modules.accountservice.repository.AccountsRepository;
import org.dragonli.service.modules.accountservice.repository.AssetRepository;
import org.dragonli.service.modules.accountservice.repository.FundFlowEvidenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Component
public class FundFlowEvidenceTool {

    @Autowired
    AssetRepository assetRepository;

    @Autowired
    AccountsRepository accountsRepository;

    @Autowired
    FundFlowEvidenceRepository fundFlowEvidenceRepository;

    @Transactional
    public FundFlowEvidenceEntity initFundFlowEvidenceEntity(Object assetInfo,Long businesId, Long accountId, BigDecimal amount,
            String orderId, int step){
        return initFundFlowEvidenceEntity( assetInfo, businesId, accountId, amount,  orderId, step,true);
    }

    @Transactional
    public FundFlowEvidenceEntity initFundFlowEvidenceEntity(Object assetInfo,Long businesId, Long accountId, BigDecimal amount,
            String orderId, int step,boolean save) {
        AssetEntity asset = assetInfo instanceof String ? assetRepository.findByCurrency(
                assetInfo.toString()) : assetRepository.get((Long) assetInfo);
        AccountEntity account = accountsRepository.get(accountId);

        FundFlowEvidenceEntity evidence = new FundFlowEvidenceEntity();
        evidence.setAccountId(accountId);
        evidence.setBusinessId(businesId);
        evidence.setCurrency(asset.getCurrency());
        evidence.setFlowAmount(amount);
        evidence.setFlowStatus(EvidenceStatus.INIT);
        evidence.setOrderId(orderId+"@"+step);
        evidence.setStep(step);
        evidence.setTimeout(System.currentTimeMillis() + 3000);
        evidence.setUserId(account.getUserId());
        evidence.setCreatedAt(System.currentTimeMillis());
        evidence.setUpdatedAt(System.currentTimeMillis());
        evidence.setVersion(0);

        if(save)evidence = fundFlowEvidenceRepository.save(evidence);
        return evidence;
    }

}

package org.dragonli.service.modules.accountservice.repository.config;

import org.dragonli.service.modules.accountservice.jpaconfig.AccountJpaConfig;
import org.dragonli.service.modules.accountservice.repository.expand.AccountRepositoryExpand;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan("org.dragonli.service.modules.accountservice.entity.models.*.*")
@EnableJpaRepositories(
        entityManagerFactoryRef = AccountJpaConfig.ENTITY_MANAGER_FACTORY_ACCOUNT,
        transactionManagerRef = AccountJpaConfig.TRANSACTION_MANAGER_ACCOUNT,
//        repositoryFactoryBeanClass=AssetRepositoryRepositoryFactoryBean.class,
        repositoryBaseClass= AccountRepositoryExpand.class,
        basePackages = {"org.dragonli.service.modules.accountservice.repository"})//repository的目录
public class AccountRepositoryConfig {
}

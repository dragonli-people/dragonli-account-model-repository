package org.dragonli.service.modules.accountservice.jpaconfig;

import org.dragonli.tools.configuration.DataSourceConfigurationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class AccountJpaConfig {
    public static final String DATASOURCE_ACCOUNT = "DATASOURCE_ACCOUNT";
    public static final String ENTITY_MANAGER_ACCOUNT = "ENTITY_MANAGER_ACCOUNT";
    public static final String ENTITY_MANAGER_FACTORY_ACCOUNT = "ENTITY_MANAGER_FACTORY_ACCOUNT";
    public static final String TRANSACTION_MANAGER_ACCOUNT = "TRANSACTION_MANAGER_ACCOUNT";

    @Autowired
    @Qualifier(DATASOURCE_ACCOUNT)
    private DataSource dataSource;

    @Primary
    @ConditionalOnProperty(value = "DS_ACCOUNT_IS_PRIMARY")
    @Bean
    DataSource primaryDatasource(@Autowired @Qualifier(DATASOURCE_ACCOUNT) DataSource ds){
        return ds;
    }

    @Primary
    @ConditionalOnProperty(value = "DS_ACCOUNT_IS_PRIMARY")
    @Bean
    public EntityManager primaryEntityManage(
            @Autowired @Qualifier(ENTITY_MANAGER_ACCOUNT) EntityManager em){
        return em;
    }

    @Primary
    @ConditionalOnProperty(value = "DS_ACCOUNT_IS_PRIMARY")
    @Bean
    public PlatformTransactionManager primaryTransactionManagerBar(
            @Autowired @Qualifier(TRANSACTION_MANAGER_ACCOUNT) PlatformTransactionManager pm ) {
        return pm;
    }

//    @Primary
    @Bean(name= DATASOURCE_ACCOUNT)
//    @ConfigurationProperties("spring.assets-datasource")
    DataSource createAssetsDataSource(
        @Autowired DataSourceConfigurationUtil dataSourceConfigurationUtil,
        @Value("${ACCOUNT_DATA_SOURCE_CONFIG_LOCAL}") String pathLocal,
        @Value("${ACCOUNT_DATA_SOURCE_CONFIG}") String path) {
        if(null != pathLocal && !"".equals(pathLocal=pathLocal.trim()))
            path = pathLocal;
        return dataSourceConfigurationUtil.getDataSource(path);
    }

//    Parameter 0 of method entityManagerFactory in com.chainxservice.crypto.datasourceconfigs.AssetsJpaConfig required a bean of type 'org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder' that could not be found.

            //数据源已有，开始配置jpa要素：LocalContainerEntityManagerFactoryBean，EntityManager，PlatformTransactionManager

    @Bean(name = ENTITY_MANAGER_ACCOUNT)
    public EntityManager entityManager(
//            @Autowired //不需要？？
                    EntityManagerFactoryBuilder builder ){
//            ,@Autowired @Qualifier("entityManagerFactory") LocalContainerEntityManagerFactoryBean eb) {

        return entityManagerFactory(builder).getObject().createEntityManager();
    }

//    @Primary
    @Bean(name = ENTITY_MANAGER_FACTORY_ACCOUNT)
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder) {
        //按网上，参数类型有问题。直接换成这种形式试试
        Map<String,Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", "none");
        properties.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
        properties.put("hibernate.show-sql",false);
        properties.put("hibernate.format_sql",false);
        properties.put("hibernate.naming.physical-strategy","org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl");

        return builder
                .dataSource(dataSource)
                .packages("org.dragonli.service.modules.accountservice.entity.models")//实体类的目录
//                .persistenceUnit("PersistenceUnit") 原本有，应该是单元测试用的
                .properties(properties)//原本是(getVendorProperties())
                .build();
    }
//    @Primary
    @Bean(name = TRANSACTION_MANAGER_ACCOUNT)
    public PlatformTransactionManager transactionManagerBar(
            EntityManagerFactoryBuilder builder){
//            @Autowired @Qualifier("entityManagerFactory") LocalContainerEntityManagerFactoryBean eb) {
        return new JpaTransactionManager(entityManagerFactory(builder).getObject());
    }


}

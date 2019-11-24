package org.dragonli.service.modules.accountservice.redis;

import org.dragonli.service.modules.accountservice.constants.AccountConstants;
import org.dragonli.tools.redis.RedisConfiguration;
import org.dragonli.tools.redis.redisson.RedisClientBuilder;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountRedisConfig {

    @Bean(name=AccountConstants.ACCOUNT_REDIS_CONFIG)
    @ConfigurationProperties("ACCOUNT_REDIS_CONFIG_PATH")
    public RedisConfiguration creatRedisConfigurationAccount() {
        return new RedisConfiguration();
    }

    @Bean(name=AccountConstants.ACCOUNT_REDIS)
    public RedissonClient createRedisClientAccount(
            @Autowired RedisClientBuilder redisClientBuilder,
            @Autowired @Qualifier(AccountConstants.ACCOUNT_REDIS_CONFIG) RedisConfiguration rc)   {
        return redisClientBuilder.buildRedissionClient(rc);
    }

}

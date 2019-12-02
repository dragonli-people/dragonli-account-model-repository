package org.dragonli.service.modules.accountservice.redis;

import org.dragonli.service.modules.accountservice.constants.AccountConstants;
import org.dragonli.tools.redis.RedisConfiguration;
import org.dragonli.tools.redis.redisson.RedisClientBuilder;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class AccountRedisConfig {

    @Bean(name=AccountConstants.ACCOUNT_REDIS_CONFIG)
    @ConditionalOnProperty(value = "ACCOUNT_REDIS_CONFIG_ON")
    @ConfigurationProperties("service.module.account.redis-config.jedis-pool-config")
    public JedisPoolConfig creatRedisConfigurationAccount() {
        return new JedisPoolConfig();
    }

    @Bean(name=AccountConstants.ACCOUNT_REDIS)
    @ConditionalOnProperty(value = "ACCOUNT_REDIS_CONFIG_ON")
    public JedisPool createRedisClientAccount(
            @Value("${service.module.account.redis-config.host}") String host,
            @Value("${service.module.account.redis-config.port}") Integer port,
            @Value("${service.module.account.redis-config.timeout}") Integer timeout,
            @Value("${service.module.account.redis-config.password}") String password,
            @Autowired @Qualifier(AccountConstants.ACCOUNT_REDIS_CONFIG) JedisPoolConfig jedisPoolConfig)   {
        if( password != null && "".equals(password.trim()) )password = null;
        return new JedisPool(jedisPoolConfig, host, port, timeout, password);
    }

    /*
    @Bean(name=AccountConstants.ACCOUNT_REDIS_CONFIG)
    @ConditionalOnProperty(value = "ACCOUNT_REDIS_CONFIG_ON")
    @ConfigurationProperties("service.module.account.redis-config")
    public RedisConfiguration creatRedisConfigurationAccount() {
        return new RedisConfiguration();
    }

    @Bean(name=AccountConstants.ACCOUNT_REDIS)
    @ConditionalOnProperty(value = "ACCOUNT_REDIS_CONFIG_ON")
    public RedissonClient createRedisClientAccount(
            @Autowired RedisClientBuilder redisClientBuilder,
            @Autowired @Qualifier(AccountConstants.ACCOUNT_REDIS_CONFIG) RedisConfiguration rc)   {
        return redisClientBuilder.buildRedissionClient(rc);
    }
    */

}

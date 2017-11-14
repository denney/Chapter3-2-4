package com.didispace.configClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef="entityManagerFactoryWso2Social",
        transactionManagerRef="transactionManagerWso2Social",
        basePackages= {"com.didispace.entityAndDao.Wso2SOCIAL"}) //设置Repository所在位置
public class WSO2_SOCIAL_DB_Config {

    @Autowired @Qualifier("wso2SocialDataSource")
    private DataSource wso2SocialDataSource;


    @Bean(name = "entityManagerWso2Social")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryWso2Social(builder).getObject().createEntityManager();
    }


    @Bean(name = "entityManagerFactoryWso2Social")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryWso2Social (EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(wso2SocialDataSource)
                .properties(getVendorProperties(wso2SocialDataSource))
                .packages("com.didispace.entityAndDao.Wso2SOCIAL") //设置实体类所在位置
                .persistenceUnit("wso2SocialPersistenceUnit")
                .build();
    }

    @Autowired
    private JpaProperties jpaProperties;

    private Map<String, String> getVendorProperties(DataSource dataSource) {
        return jpaProperties.getHibernateProperties(dataSource);
    }


    @Bean(name = "transactionManagerWso2Social")
    public PlatformTransactionManager transactionManagerWso2Social(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryWso2Social(builder).getObject());
    }

}
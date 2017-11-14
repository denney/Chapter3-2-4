package com.didispace.configClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
        entityManagerFactoryRef="entityManagerFactoryEsStorange",
        transactionManagerRef="transactionManagerEsStorange",
        basePackages= { "com.didispace.configClass" }) //设置Repository所在位置
public class ES_STORAGE_Config {

    @Autowired @Qualifier("esStorangeDataSource")
    private DataSource esStorangeDataSource;
    @Primary
    @Bean(name = "entityManagerEsStorange")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryEsStorange(builder).getObject().createEntityManager();
    }
    @Primary
    @Bean(name = "entityManagerFactoryEsStorange")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryEsStorange (EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(esStorangeDataSource)
                .properties(getVendorProperties(esStorangeDataSource))
                .packages("com.didispace.configClass") //设置实体类所在位置
                .persistenceUnit("esStorangePersistenceUnit")
                .build();
    }

    @Autowired
    public JpaProperties jpaProperties;

    private Map<String, String> getVendorProperties(DataSource dataSource) {
        return jpaProperties.getHibernateProperties(dataSource);
    }
    @Primary
    @Bean(name = "transactionManagerEsStorange")
    PlatformTransactionManager transactionManagerEsStorange(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryEsStorange(builder).getObject());
    }

}
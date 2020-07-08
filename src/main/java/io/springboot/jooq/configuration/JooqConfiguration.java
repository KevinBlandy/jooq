//package io.springboot.jooq.configuration;
//
//
//import javax.sql.DataSource;
//
//import org.jooq.DSLContext;
//import org.jooq.SQLDialect;
//import org.jooq.impl.DataSourceConnectionProvider;
//import org.jooq.impl.DefaultConfiguration;
//import org.jooq.impl.DefaultDSLContext;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
//
//@Configuration
//public class JooqConfiguration {
//	
//	@Bean
//	public DSLContext dslContext(@Autowired org.jooq.Configuration configuration) {
//		DSLContext dslContext = new DefaultDSLContext(configuration);
//		return dslContext;
//	}
//	
//	@Bean
//	public org.jooq.Configuration configuration () {
//		DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
//		defaultConfiguration.setSQLDialect(SQLDialect.MYSQL);
//		return defaultConfiguration;
//	}
//	
//	
//	@Bean
//	public DataSourceConnectionProvider dataSourceConnectionProvider(@Autowired TransactionAwareDataSourceProxy transactionAwareDataSourceProxy) {
//		System.err.println("proxy=" + transactionAwareDataSourceProxy);
//		DataSourceConnectionProvider dataSourceConnectionProvider = new DataSourceConnectionProvider(transactionAwareDataSourceProxy);
//		return dataSourceConnectionProvider;
//	}
//	
//	@Bean
//	public TransactionAwareDataSourceProxy transactionAwareDataSourceProxy (@Autowired DataSource dataSource) {
//		TransactionAwareDataSourceProxy transactionAwareDataSourceProxy = new TransactionAwareDataSourceProxy(dataSource);
//		return transactionAwareDataSourceProxy;
//	}
//}

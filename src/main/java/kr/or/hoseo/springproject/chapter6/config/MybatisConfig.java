package kr.or.hoseo.springproject.chapter6.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Repository;

@Configuration
@MapperScan(value="kr.or.hoseo.springproject.chapter6", annotationClass = Repository.class)
public class MybatisConfig {
	
	
	@Bean
    public SqlSessionFactoryBean sqlSessionFactory(@Autowired DataSource ds) throws Exception {
      SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
      sqlSessionFactory.setDataSource(ds);
      sqlSessionFactory.setTypeAliasesPackage("kr.or.hoseo.springproject.chapter6.vo");
      sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
      return sqlSessionFactory;
    }

}
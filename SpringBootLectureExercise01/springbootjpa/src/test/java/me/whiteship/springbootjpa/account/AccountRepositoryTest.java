package me.whiteship.springbootjpa.account;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.SQLException;
import java.util.Optional;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
// @DataJpaTest를 사용하면 slicing test가 된다. 어지간하면 이런 테스트 방식을 추천한다.
@DataJpaTest
// @SpringBootTest를 사용하면 integration test가 된다. 이 테스트를 사용하면 본 DB의 데이터까지 바꿔버리곤 한다.
public class AccountRepositoryTest {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	AccountRepository accountRepository;
	
	@Test
	public void di() throws SQLException {
		
		Account account = new Account();
		account.setUsername("taehyun");
		account.setPassword("1234");
		
		Account newAccount = accountRepository.save(account);
		
		assertThat(newAccount).isNotNull();
		
		Optional<Account> existingAccount = accountRepository.findByUsername(newAccount.getUsername());
		assertThat(existingAccount).isNotNull();
		
		Optional<Account> nonExistingAccount = accountRepository.findByUsername("whiteship");
		assertThat(nonExistingAccount).isNull();
		
		/*
		try (Connection connection = dataSource.getConnection()) {
			DatabaseMetaData metaData = connection.getMetaData();
			System.out.println(metaData.getURL());
			System.out.println(metaData.getDriverName());
			System.out.println(metaData.getUserName());
		}
		*/
	}
	
}

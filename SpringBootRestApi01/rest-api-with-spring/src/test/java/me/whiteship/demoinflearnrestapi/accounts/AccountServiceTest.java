package me.whiteship.demoinflearnrestapi.accounts;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class AccountServiceTest {

    @Autowired
    AccountService accountService;

    /*@Test
    public void findByUsername() {
        // given
        String password = "keesun";

        Account account = Account.builder()
                .email("keesun@email.com")
                .password(password)
                .roles(Set.of(AccountRole.ADMIN, AccountRole.USER))
                .build();

        // when
        UserDetailsService userDetailsService =
                (UserDetailsService) accountService;
        UserDetails userDetails = userDetailsService.loadUserByUsername("keesun");

        // then
        assertThat(userDetails.getPassword()).isEqualTo(password);

    }*/

}

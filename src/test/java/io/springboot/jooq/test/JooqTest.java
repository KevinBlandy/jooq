package io.springboot.jooq.test;

import org.jooq.DSLContext;
import org.jooq.types.UByte;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import io.springboot.jooq.JooqApplication;
import io.springboot.jooq.generated.tables.pojos.User;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = JooqApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class JooqTest {
	
	@Autowired
	DSLContext dslContext;
	
	@Test
	public void test () throws Exception {
		User user = new User();
		user.setGender(UByte.MAX);
	}
}

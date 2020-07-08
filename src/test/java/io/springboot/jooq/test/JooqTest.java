package io.springboot.jooq.test;

import org.jooq.DSLContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import io.springboot.jooq.JooqApplication;
import static io.springboot.jooq.generated.Tables.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = JooqApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class JooqTest {
	
	@Autowired
	private DSLContext dslContext;
	
	@Test
	public void test () throws Exception {
		dslContext.select(AUTHOR.ID).from(AUTHOR).where(AUTHOR.FIRST_NAME.like("%v%", '%')).fetch();
	}
}

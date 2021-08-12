package bankApplication.testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import bankApplication.AccountUtil;

class AccountUtilTest {

	@Test
	void testAccountUtil_getAccountTypeName_checkingAccount() {
		
		String EXPECTED_VALUE = "Checking";
		
		assertEquals( EXPECTED_VALUE , AccountUtil.getAccountTypeName(1));
	}
	
	@Test
	void testAccountUtil_getAccountTypeName_savingAccount() {
		
		String EXPECTED_VALUE = "Saving";
		
		assertEquals( EXPECTED_VALUE , AccountUtil.getAccountTypeName(2));
	}

}

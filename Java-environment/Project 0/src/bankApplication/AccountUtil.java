package bankApplication;

public class AccountUtil {
	public static String getAccountTypeName(int acctType) {
		switch(acctType) {
		case 1:
			return "Checking";
		case 2:
			return "Saving";
		case 3:
			return "Loan";
		}
		return "";
	} 
}

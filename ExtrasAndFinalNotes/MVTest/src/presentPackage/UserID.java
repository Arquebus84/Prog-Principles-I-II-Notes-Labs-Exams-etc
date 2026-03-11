package presentPackage;

import java.util.HashMap;

public class UserID {

	//Hash Map
	HashMap<String, String> userInfo = new HashMap<String, String>();
	
	String lorenzo, leonardo, pat, filippo, rose, nam, sean;
	
	public UserID() {
		lorenzo = userInfo.put("lorenzo", "Lorenzo");
		lorenzo = userInfo.put("Lorenzo", "lorenzo");
		
		leonardo = userInfo.put("leonardo", "Leonardo");
		leonardo = userInfo.put("Leonardo", "leonardo");
		leonardo = userInfo.put("Leo", "");
		leonardo = userInfo.put("leo", "");
		
		pat = userInfo.put("pat", "Pat");
		pat = userInfo.put("Pat", "pat");
		
		filippo = userInfo.put("filippo", "Filippo");
		filippo = userInfo.put("Filippo", "filippo");
		
		rose = userInfo.put("rose", "Rose");
		rose = userInfo.put("Rose", "rose");
		
		nam = userInfo.put("nam", "Nam");
		nam = userInfo.put("Nam", "nam");
		
		sean = userInfo.put("Sean","");
		sean = userInfo.put("sean","");
		
		
	}
	
	protected HashMap<String, String> getUserInfo() {
		return userInfo;
	}
}

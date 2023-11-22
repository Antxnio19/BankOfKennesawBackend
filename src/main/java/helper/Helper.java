package helper;

import jakarta.servlet.http.HttpSession;

public class Helper {
	
	public static boolean isLoggedOn(HttpSession session) {
		if(session.getAttribute("user") != null) {
			return true;
		}
		return false;
	}


}

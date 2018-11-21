package cn.songlin.common.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionUtils {

	public static void writeSession(HttpServletRequest request, String sessionId, Object sessionData,
			int maxInactiveInterval) {
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(maxInactiveInterval);// 设置30s
		session.setAttribute(sessionId, sessionData);
	}

	public static void clearBySessionId(HttpServletRequest request, String sessionId) {
		writeSession(request, sessionId, null, 0);
	}
}

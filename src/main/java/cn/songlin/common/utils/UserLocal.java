package cn.songlin.common.utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.songlin.common.dto.LocalUser;

public class UserLocal {

	public static LocalUser getLocalUser() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		Object attribute = request.getSession().getAttribute("sessionId");
		System.out.println(attribute);
		LocalUser userAccount = (LocalUser) request.getSession().getAttribute("sessionId");

		return userAccount == null ? new LocalUser() : userAccount;
	}

}

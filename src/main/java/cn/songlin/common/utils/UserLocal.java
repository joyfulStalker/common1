package cn.songlin.common.utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.songlin.common.dto.UserAccount;

public class UserLocal {

	public static UserAccount getLocalUser() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		UserAccount userAccount = (UserAccount) request.getSession().getAttribute("sessionId");

		return userAccount == null ? new UserAccount() : userAccount;
	}

}

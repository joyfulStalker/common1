package cn.songlin.common.utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.songlin.common.constant.ConstantUtil;
import cn.songlin.common.dto.LocalUser;

@Component
public class UserLocal {

	@Autowired
	private RedisUtil redisUtil;

	public LocalUser getLocalUser() {

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		String token = request.getHeader("Authorization");
		LocalUser userAccount = (LocalUser) redisUtil.hget(ConstantUtil.REDIS_USER_SESSIONID, token);
		return userAccount == null ? new LocalUser() : userAccount;
	}

}

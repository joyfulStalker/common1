package cn.songlin.common.conf;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import cn.songlin.common.dto.base.BaseCode;
import cn.songlin.common.dto.base.BaseResponseResult;
import cn.songlin.common.exception.BizException;

/**
 * 包含@ResponseBody 不加该注解，返回给浏览器的值是默认的
 * 
 * @author liusonglin
 * @date 2019年2月15日
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * @author liusonglin
	 * @date 2018年10月31日
	 * @param response
	 * @param ex
	 * @return
	 */

	@ExceptionHandler(BizException.class)
	public BaseResponseResult baseExceptionHandler(HttpServletResponse response, BizException ex) {
		ex.printStackTrace();
		return new BaseResponseResult(ex.getMessage(), ex.getCode());
	}

	@ExceptionHandler(Exception.class)
	public BaseResponseResult otherExceptionHandler(HttpServletResponse response, Exception ex) {
		ex.printStackTrace();
		return new BaseResponseResult(ex.getMessage(), BaseCode.ERROR_UNKNOWN);
	}
}

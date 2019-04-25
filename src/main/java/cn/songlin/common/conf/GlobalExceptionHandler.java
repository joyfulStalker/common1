package cn.songlin.common.conf;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	/**
	 * @author liusonglin
	 * @date 2018年10月31日
	 * @param response
	 * @param ex
	 * @return
	 */

	@ExceptionHandler(BizException.class)
	public BaseResponseResult baseExceptionHandler(HttpServletResponse response, BizException ex) {
		logger.info(getErrorMsg(ex));
		return new BaseResponseResult(ex.getMessage(), ex.getCode());
	}

	@ExceptionHandler(Exception.class)
	public BaseResponseResult otherExceptionHandler(HttpServletResponse response, Exception ex) {
		logger.info(getErrorMsg(ex));
		return new BaseResponseResult(ex.getMessage(), BaseCode.ERROR_UNKNOWN);
	}

	/**
	 * 从异常中获取异常详细信息的字符串
	 * @param e
	 * @return
	 */
	private String getErrorMsg(Exception e) {
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw, false));
		return sw.toString();
	}
}

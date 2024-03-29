package cn.songlin.common.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

import cn.songlin.common.dto.base.BaseCode;
import cn.songlin.common.dto.base.BaseResponseResult;

/**
 * @author liusonglin
 * @date 2018年8月1日
 */

@Component
@Aspect
@Order(5)
public class MonitorAspect {
	private static final Logger logger = LoggerFactory.getLogger(MonitorAspect.class);

	@Around("@annotation(cn.songlin.common.anno.Monitor)")
	public Object logServiceAccess(ProceedingJoinPoint pjp) throws Throwable {

		/**
		 * 记录切面的信息
		 */
		String className = pjp.getTarget().getClass().getName();
		String methodName = pjp.getSignature().getName();
		String fullMethodName = className + "." + methodName;
		logger.info(fullMethodName + "将被调用");
		// 请求参数 打印
		Object[] args = pjp.getArgs();// 参数
		for (Object parm : args) {

			// 过滤request
			if (!"org.apache.catalina.connector.RequestFacade".equals(parm.getClass().getName())) {
				logger.info("请求参数：" + parm);
			}
		}

		long start = System.currentTimeMillis();
		Object result = null;
		result = pjp.proceed();
		long end = System.currentTimeMillis();
		long elapsedMilliseconds = end - start;

		if (result != null && result instanceof BaseResponseResult) {
			((BaseResponseResult) result).setResultCode(BaseCode.SUCCESS);
			((BaseResponseResult) result).setErrMsg("");
			((BaseResponseResult) result).setElapsedMilliseconds(elapsedMilliseconds);
		}
		if (result != null) {// 响应结果打印
			logger.info("响应数据:"+JSON.toJSONString(result));
		}

		logger.info(fullMethodName + "调用结束," + "执行耗时:" + elapsedMilliseconds + " 毫秒");

		return result;
	}
}
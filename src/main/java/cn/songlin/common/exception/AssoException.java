package cn.songlin.common.exception;

public class AssoException extends BizException {

	private static final long serialVersionUID = 3252856823627098049L;

	public static final BizException SYSTEM_ERR = new BizException(10010000, "系统错误");
	public static final BizException NICK_EXIST = new BizException(10010001, "该昵称已存在");
	public static final BizException NOT_MOBLIEPHONE = new BizException(10010002, "手机号输入不正确");
	public static final BizException NOT_EMAIL = new BizException(10010003, "邮箱输入不正确");
	public static final BizException HIT_SENSITIVEWORD = new BizException(10010004, "请遵守社群规范");

	// 10021开头的为错误收集功能相关的
	public static final BizException NO_ERR_DESCRIPTION = new BizException(10021001, "请填写错误描述");
	public static final BizException NO_ERR_CATEGORY = new BizException(10021002, "请选择类别");
	public static final BizException NO_REFER_SOURCEDESC = new BizException(10021003, "请填写参考来源");

	// 10022开头的为订单相关
	public static final BizException ORDER_CREATE_FAILE = new BizException(10022001, "单号创建失败，请联系管理员");

	// 10023 权限菜单相关
	public static final BizException PLE_CONF_MENU = new BizException(10023001, "还没有该菜单，请配置！");
	public static final BizException DUPLICATE_PATH = new BizException(10023002, "路径重复，请修改！");
	public static final BizException NO_PATH = new BizException(10023003, "路径不能为空！");
	public static final BizException NO_NAME = new BizException(10023004, "名称不能为空！");
	public static final BizException NO_COMPONENT = new BizException(10023005, "组件名不能为空！");
}

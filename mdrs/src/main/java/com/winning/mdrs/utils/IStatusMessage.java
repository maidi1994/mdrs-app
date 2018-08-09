package com.winning.mdrs.utils;

/**
 * @类名称： IStatusMessage
 * @类描述：响应状态信息
 * @创建时间： 2018年1月4日11:04:17
 * @version:
 */
public interface IStatusMessage {
	
	String getCode();

	String getMessage();
	
	public enum SystemStatus implements IStatusMessage{

		SUCCESS("1000","SUCCESS"), //请求成功
		ERROR("1001","ERROR"),	   //请求失败
		PARAM_ERROR("1002","PARAM_ERROR"), //请求参数有误
		SUCCESS_MATCH("1003","SUCCESS_MATCH"), //表示成功匹配
		NO_LOGIN("1100","NO_LOGIN"), //未登录
		LOCK("1111","LOCK"); //用户已锁定
		private String code;
		private String message;

		private SystemStatus(String code,String message){
			this.code = code;
			this.message = message;
		}

		public String getCode(){
			return this.code;
		}

		public String getMessage(){
			return this.message;
		}
	}
}
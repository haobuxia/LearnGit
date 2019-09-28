package edu.thss.platform.exception;

import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("serial")
public class PlatformException extends RuntimeException{

	private static Code defaultCode = Code.Ejb;

	public static void setDefaultCode(Code code) {
		defaultCode = code;
	}

	public enum Code  {
		Auth("服务器端", "超时异常"), Client("客户端", "客户端异常"), Servlet("Web服务器",
				"服务器端异常"), Ejb("应用服务器", "远程服务异常"), Other("未知位置", "不确定异常");

		String defaultMessage;

		String typeDescription;

		Code(String desc, String msg) {
			this.typeDescription = desc;
			this.defaultMessage = msg;
		}

		public String getTypeDescription() {
			return typeDescription;
		}

		public String getDefaultMessage() {
			return defaultMessage;
		}
	}

	protected Code code;

	protected String message;

	private List<String> stackInfo = new ArrayList<String>();

	public enum Type {
		Error, Warning, Info, None;
	}

	Type type = Type.Error;

	public enum Style  {
		MsgBox, Bubble
	}

	Style style = Style.MsgBox;

	protected PlatformException() {

	}

	protected void initCode() {
			this.code = defaultCode;
	}

	public PlatformException(Code code, String message) {
		super(message);
		this.code = code;
		this.message = message;
	}

	public PlatformException(String message) {
		super(message);
		initCode();
		this.message = message;
	}

	public PlatformException(Exception ex) {
		initCode();
		this.message = ex.getLocalizedMessage();
	}

	public Code getCode() {
		return code;
	}

	public String getErrorMessage() {
		return message;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	public void setErrorMessage(String message) {
		this.message = message;
	}

	public void addStackInfo(String info) {
		this.stackInfo.add(info);
	}

	public List<String> getStackInfo() {
		return stackInfo;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	
}

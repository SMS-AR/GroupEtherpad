package com.swu.grouppad.common.dto;

public class BaseDto {
	// TODO 传输类待完善
	// 状态
	private int status;
	// 信息
	private String message;
	// 内容体
	private Object content;

	public BaseDto() {
	}

	public BaseDto(int status, String message, Object content) {
		super();
		this.status = status;
		this.message = message;
		this.content = content;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

}

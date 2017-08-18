package com.wutao.bridge.impl;

public class AppMessageSendImpl implements MessageSendImpl {

	@Override
	public void sendMessage() {
		System.out.println("通过app发送app推送消息");
	}

}

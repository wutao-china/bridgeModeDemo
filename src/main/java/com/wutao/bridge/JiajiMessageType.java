package com.wutao.bridge;

import com.wutao.bridge.impl.MessageSendImpl;

public class JiajiMessageType extends MessageTypeAbstract {

	public JiajiMessageType(MessageSendImpl messageSendImpl) {
		super(messageSendImpl);
		// TODO Auto-generated constructor stub
	}

	@Override
	void setMessageType() {
		System.out.println("���üӼ���Ϣ");
		messageSendImpl.sendMessage();
	}

}

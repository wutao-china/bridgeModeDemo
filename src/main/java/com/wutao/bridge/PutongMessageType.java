package com.wutao.bridge;

import com.wutao.bridge.impl.MessageSendImpl;

public class PutongMessageType extends MessageTypeAbstract {

	public PutongMessageType(MessageSendImpl messageSendImpl) {
		super(messageSendImpl);
	}

	@Override
	void setMessageType() {
		System.out.println("������ͨ��Ϣ");
		messageSendImpl.sendMessage();
	}

}

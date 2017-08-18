package com.wutao.bridge;

import com.wutao.bridge.impl.MessageSendImpl;

abstract class MessageTypeAbstract {
	public MessageSendImpl messageSendImpl;
	
	public MessageTypeAbstract(MessageSendImpl messageSendImpl){
		this.messageSendImpl = messageSendImpl;
	}
	
	abstract void setMessageType();
}

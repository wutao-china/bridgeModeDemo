package com.wutao.bridge;

import com.wutao.bridge.impl.AppMessageSendImpl;
import com.wutao.bridge.impl.DuanxinMessageSendImpl;

public class BriageTest {

	public static void main(String[] args) {
		AppMessageSendImpl appMessageSendImpl = new AppMessageSendImpl();
		DuanxinMessageSendImpl duanxinMessageSendImpl = new DuanxinMessageSendImpl();
		
		JiajiMessageType jiajiApp = new JiajiMessageType(appMessageSendImpl);
		JiajiMessageType jiajiDuanxin = new JiajiMessageType(duanxinMessageSendImpl);
		
		jiajiApp.setMessageType();
	}

}

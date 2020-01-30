package com.iotyun.manager.netty;

import io.netty.buffer.ByteBuf;

public interface NotifyModbusProcess {

	void notify(ByteBuf msg);
}

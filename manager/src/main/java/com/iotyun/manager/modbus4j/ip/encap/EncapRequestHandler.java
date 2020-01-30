/*
 * ============================================================================
 * GNU General Public License
 * ============================================================================
 *
 * Copyright (C) 2006-2011 Serotonin Software Technologies Inc. http://serotoninsoftware.com
 * @author Matthew Lohbihler
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.iotyun.manager.modbus4j.ip.encap;

import com.iotyun.manager.modbus4j.ModbusSlaveSet;
import com.iotyun.manager.modbus4j.base.BaseRequestHandler;
import com.iotyun.manager.modbus4j.msg.ModbusRequest;
import com.iotyun.manager.modbus4j.msg.ModbusResponse;
import com.iotyun.manager.modbus4j.sero.messaging.IncomingRequestMessage;
import com.iotyun.manager.modbus4j.sero.messaging.OutgoingResponseMessage;

/**
 * <p>EncapRequestHandler class.</p>
 *
 * @author Matthew Lohbihler
 * @version 5.0.0
 */
public class EncapRequestHandler extends BaseRequestHandler {
    /**
     * <p>Constructor for EncapRequestHandler.</p>
     *
     * @param slave a {@link com.iotyun.manager.modbus4j.ModbusSlaveSet} object.
     */
    public EncapRequestHandler(ModbusSlaveSet slave) {
        super(slave);
    }

    /** {@inheritDoc} */
    public OutgoingResponseMessage handleRequest(IncomingRequestMessage req) throws Exception {
        EncapMessageRequest tcpRequest = (EncapMessageRequest) req;
        ModbusRequest request = tcpRequest.getModbusRequest();
        ModbusResponse response = handleRequestImpl(request);
        if (response == null)
            return null;
        return new EncapMessageResponse(response);
    }
}
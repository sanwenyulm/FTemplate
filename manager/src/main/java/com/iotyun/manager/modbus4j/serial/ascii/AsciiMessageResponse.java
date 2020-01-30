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
package com.iotyun.manager.modbus4j.serial.ascii;

import com.iotyun.manager.modbus4j.exception.ModbusTransportException;
import com.iotyun.manager.modbus4j.msg.ModbusMessage;
import com.iotyun.manager.modbus4j.msg.ModbusResponse;
import com.iotyun.manager.modbus4j.sero.messaging.IncomingResponseMessage;
import com.iotyun.manager.modbus4j.sero.messaging.OutgoingResponseMessage;
import com.iotyun.manager.modbus4j.sero.util.queue.ByteQueue;

/**
 * <p>AsciiMessageResponse class.</p>
 *
 * @author Matthew Lohbihler
 * @version 5.0.0
 */
public class AsciiMessageResponse extends AsciiMessage implements OutgoingResponseMessage, IncomingResponseMessage {
    static AsciiMessageResponse createAsciiMessageResponse(ByteQueue queue) throws ModbusTransportException {
        ByteQueue msgQueue = getUnasciiMessage(queue);
        ModbusResponse response = ModbusResponse.createModbusResponse(msgQueue);
        AsciiMessageResponse asciiResponse = new AsciiMessageResponse(response);

        // Return the data.
        return asciiResponse;
    }

    /**
     * <p>Constructor for AsciiMessageResponse.</p>
     *
     * @param modbusMessage a {@link com.iotyun.manager.modbus4j.msg.ModbusMessage} object.
     */
    public AsciiMessageResponse(ModbusMessage modbusMessage) {
        super(modbusMessage);
    }

    /**
     * <p>getModbusResponse.</p>
     *
     * @return a {@link com.iotyun.manager.modbus4j.msg.ModbusResponse} object.
     */
    public ModbusResponse getModbusResponse() {
        return (ModbusResponse) modbusMessage;
    }
}

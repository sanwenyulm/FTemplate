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
package com.iotyun.manager.modbus4j;

import com.iotyun.manager.modbus4j.base.ModbusUtils;
import com.iotyun.manager.modbus4j.code.RegisterRange;
import com.iotyun.manager.modbus4j.exception.ModbusIdException;
import com.iotyun.manager.modbus4j.exception.ModbusTransportException;
import com.iotyun.manager.modbus4j.ip.IpParameters;
 
import com.iotyun.manager.modbus4j.ip.tcp.TcpMaster;
 
import com.iotyun.manager.modbus4j.ip.udp.UdpMaster;
import com.iotyun.manager.modbus4j.ip.udp.UdpSlave;
import com.iotyun.manager.modbus4j.msg.ModbusRequest;
import com.iotyun.manager.modbus4j.msg.ReadCoilsRequest;
import com.iotyun.manager.modbus4j.msg.ReadDiscreteInputsRequest;
import com.iotyun.manager.modbus4j.msg.ReadHoldingRegistersRequest;
import com.iotyun.manager.modbus4j.msg.ReadInputRegistersRequest;
import com.iotyun.manager.modbus4j.serial.SerialPortWrapper;
import com.iotyun.manager.modbus4j.serial.ascii.AsciiMaster;
import com.iotyun.manager.modbus4j.serial.ascii.AsciiSlave;
import com.iotyun.manager.modbus4j.serial.rtu.RtuMaster;
import com.iotyun.manager.modbus4j.serial.rtu.RtuSlave;
import com.iotyun.manager.netty.DtuServerHandler;

/**
 * <p>ModbusFactory class.</p>
 *
 * @author Matthew Lohbihler
 * @version 5.0.0
 */
public class ModbusFactory {
    //
    // Modbus masters
    //
    /**
     * <p>createRtuMaster.</p>
     *
     * @param wrapper a {@link com.iotyun.manager.modbus4j.serial.SerialPortWrapper} object.
     * @return a {@link com.iotyun.manager.modbus4j.ModbusMaster} object.
     */
    public ModbusMaster createRtuMaster(SerialPortWrapper wrapper) {
        return new RtuMaster(wrapper);
    }
    
    /**
     * <p>createAsciiMaster.</p>
     *
     * @param wrapper a {@link com.iotyun.manager.modbus4j.serial.SerialPortWrapper} object.
     * @return a {@link com.iotyun.manager.modbus4j.ModbusMaster} object.
     */
    public ModbusMaster createAsciiMaster(SerialPortWrapper wrapper) {
        return new AsciiMaster(wrapper);
    }

    /**
     * <p>createTcpMaster.</p>
     *
     * @param params a {@link com.iotyun.manager.modbus4j.ip.IpParameters} object.
     * @param keepAlive a boolean.
     * @return a {@link com.iotyun.manager.modbus4j.ModbusMaster} object.
     */
    public ModbusMaster createTcpMaster(DtuServerHandler mDtuServerHandler) {
    	 IpParameters tcpParameters = new IpParameters();
    	 tcpParameters.setEncapsulated(true);
        return new TcpMaster(tcpParameters, true,mDtuServerHandler);
    }

    /**
     * <p>createUdpMaster.</p>
     *
     * @param params a {@link com.iotyun.manager.modbus4j.ip.IpParameters} object.
     * @return a {@link com.iotyun.manager.modbus4j.ModbusMaster} object.
     */
    public ModbusMaster createUdpMaster(IpParameters params) {
        return new UdpMaster(params);
    }

 

    //
    // Modbus slaves
    //
    /**
     * <p>createRtuSlave.</p>
     *
     * @param wrapper a {@link com.iotyun.manager.modbus4j.serial.SerialPortWrapper} object.
     * @return a {@link com.iotyun.manager.modbus4j.ModbusSlaveSet} object.
     */
    public ModbusSlaveSet createRtuSlave(SerialPortWrapper wrapper) {
        return new RtuSlave(wrapper);
    }

    /**
     * <p>createAsciiSlave.</p>
     *
     * @param wrapper a {@link com.iotyun.manager.modbus4j.serial.SerialPortWrapper} object.
     * @return a {@link com.iotyun.manager.modbus4j.ModbusSlaveSet} object.
     */
    public ModbusSlaveSet createAsciiSlave(SerialPortWrapper wrapper) {
        return new AsciiSlave(wrapper);
    }

 

    /**
     * <p>createUdpSlave.</p>
     *
     * @param encapsulated a boolean.
     * @return a {@link com.iotyun.manager.modbus4j.ModbusSlaveSet} object.
     */
    public ModbusSlaveSet createUdpSlave(boolean encapsulated) {
        return new UdpSlave(encapsulated);
    }

    //
    // Modbus requests
    //
    /**
     * <p>createReadRequest.</p>
     *
     * @param slaveId a int.
     * @param range a int.
     * @param offset a int.
     * @param length a int.
     * @return a {@link com.iotyun.manager.modbus4j.msg.ModbusRequest} object.
     * @throws com.iotyun.manager.modbus4j.exception.ModbusTransportException if any.
     * @throws com.iotyun.manager.modbus4j.exception.ModbusIdException if any.
     */
    public ModbusRequest createReadRequest(int slaveId, int range, int offset, int length)
            throws ModbusTransportException, ModbusIdException {
        ModbusUtils.validateRegisterRange(range);

        if (range == RegisterRange.COIL_STATUS)
            return new ReadCoilsRequest(slaveId, offset, length);

        if (range == RegisterRange.INPUT_STATUS)
            return new ReadDiscreteInputsRequest(slaveId, offset, length);

        if (range == RegisterRange.INPUT_REGISTER)
            return new ReadInputRegistersRequest(slaveId, offset, length);

        return new ReadHoldingRegistersRequest(slaveId, offset, length);
    }
}

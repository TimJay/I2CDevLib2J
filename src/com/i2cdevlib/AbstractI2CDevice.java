package com.i2cdevlib;

import java.io.IOException;

import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.impl.I2CBusImpl;
import com.pi4j.io.i2c.impl.I2CDeviceImpl;

public abstract class AbstractI2CDevice extends I2CDeviceImpl {

	public static int getMask(int startBit, int length) {
		int mask = ((1 << length) - 1) << (startBit - (length - 1));
		return mask;
	}

	public AbstractI2CDevice(I2CBus bus, int address) {
		super((I2CBusImpl) bus, address);
		// clean up when we leave
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				AbstractI2CDevice.this.close();
			}
		});
	}

	public abstract void close();

	public boolean readBit(int address, int bit) throws IOException {
		if (this.readBits(address, bit, 1) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public int readBits(int address, int startBit, int length) throws IOException {
		if ((length < 1) || (length > 8) || (startBit < 0) || (startBit > 7) || ((startBit - (length - 1)) < 0)) {
			throw new RuntimeException("Invalid startBit/length combination.");
		}
		int buffer = this.readByte(address);
		int mask = AbstractI2CDevice.getMask(startBit, length);
		buffer &= mask;
		return (buffer >> (startBit - (length - 1)));
	}

	public int readBitsW(int address, int startBit, int length) throws IOException {
		if ((length < 1) || (length > 16) || (startBit < 0) || (startBit > 15) || ((startBit - (length - 1)) < 0)) {
			throw new RuntimeException("Invalid startBit/length combination.");
		}
		int buffer = this.readWord(address);
		int mask = AbstractI2CDevice.getMask(startBit, length);
		buffer &= mask;
		return (buffer >> (startBit - (length - 1)));
	}

	public boolean readBitW(int address, int bit) throws IOException {
		if (this.readBitsW(address, bit, 1) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public int readByte(int address) throws IOException {
		return 0xff & this.read(address);
	}

	public int[] readBytes(int address, int length) throws IOException {
		byte[] buffer = new byte[length];
		this.read(address, buffer, 0, length);
		int[] intBuffer = new int[length];
		for (int i = 0; i < length; i++) {
			intBuffer[i] = 0xff & buffer[i];
		}
		return intBuffer;
	}

	public int readSignedByte(int address) throws IOException {
		return (byte) (0xff & this.read(address));
	}

	public int[] readSignedBytes(int address, int length) throws IOException {
		byte[] buffer = new byte[length];
		this.read(address, buffer, 0, length);
		int[] intBuffer = new int[length];
		for (int i = 0; i < length; i++) {
			intBuffer[i] = (byte) (0xff & buffer[i]);
		}
		return intBuffer;
	}

	public int readSignedWord(int address) throws IOException {
		byte[] buffer = new byte[2];
		this.read(address, buffer, 0, buffer.length);
		return (short) ((0xff & buffer[0]) << 8) | (0xff & buffer[1]);
	}

	public int[] readSignedWords(int address, int length) throws IOException {
		byte[] buffer = new byte[length * 2];
		this.read(address, buffer, 0, buffer.length);
		int[] wordBuffer = new int[length];
		for (int i = 0; i < length; i++) {
			wordBuffer[i] = (short) ((0xff & buffer[i * 2]) << 8) | (0xff & buffer[(i * 2) + 1]);
		}
		return wordBuffer;
	}

	public int readWord(int address) throws IOException {
		byte[] buffer = new byte[2];
		this.read(address, buffer, 0, buffer.length);
		return ((0xff & buffer[0]) << 8) | (0xff & buffer[1]);
	}

	public int[] readWords(int address, int length) throws IOException {
		byte[] buffer = new byte[length * 2];
		this.read(address, buffer, 0, buffer.length);
		int[] wordBuffer = new int[length];
		for (int i = 0; i < length; i++) {
			wordBuffer[i] = ((0xff & buffer[i * 2]) << 8) | (0xff & buffer[(i * 2) + 1]);
		}
		return wordBuffer;
	}

	public void writeBit(int address, int bit, boolean value) throws IOException {
		if (value) {
			this.writeBits(address, bit, 1, 1);
		}
		else {
			this.writeBits(address, bit, 1, 0);
		}
	}

	public void writeBits(int address, int startBit, int length, int value) throws IOException {
		if ((length < 1) || (length > 8) || (startBit < 0) || (startBit > 7) || ((startBit - (length - 1)) < 0) || (value < 0) || (value > (Math.pow(2.0, length) - 1))) {
			throw new RuntimeException("Invalid startBit/length combination.");
		}
		int buffer = this.readByte(address);
		int mask = AbstractI2CDevice.getMask(startBit, length);
		value <<= (startBit - (length - 1));
		value &= mask;
		buffer &= ~mask;
		buffer |= value;
		this.writeByte(address, buffer);
	}

	public void writeBitsW(int address, int startBit, int length, int value) throws IOException {
		if ((length < 1) || (length > 16) || (startBit < 0) || (startBit > 15) || ((startBit - (length - 1)) < 0) || (value < 0) || (value > (Math.pow(2.0, length) - 1))) {
			throw new RuntimeException("Invalid startBit/length combination.");
		}
		int buffer = this.readWord(address);
		int mask = AbstractI2CDevice.getMask(startBit, length);
		value <<= (startBit - (length - 1));
		value &= mask;
		buffer &= ~mask;
		buffer |= value;
		this.writeWord(address, buffer);
	}

	public void writeBitW(int address, int bit, boolean value) throws IOException {
		if (value) {
			this.writeBitsW(address, bit, 1, 1);
		}
		else {
			this.writeBitsW(address, bit, 1, 0);
		}
	}

	public void writeByte(int address, int value) throws IOException {
		this.write(address, (byte) (0xff & value));
	}

	public void writeBytes(int address, int[] values) throws IOException {
		byte[] buffer = new byte[values.length];
		for (int i = 0; i < values.length; i++) {
			buffer[i] = (byte) (0xff & values[i]);
		}
		this.write(address, buffer, 0, buffer.length);
	}

	public void writeWord(int address, int value) throws IOException {
		byte[] buffer = new byte[2];
		buffer[0] = (byte) ((0xff00 & value) >> 8);
		buffer[1] = (byte) (0xff & value);
		this.write(address, buffer, 0, buffer.length);
	}

	public void writeWords(int address, int[] values) throws IOException {
		byte[] buffer = new byte[values.length * 2];
		for (int i = 0; i < values.length; i++) {
			buffer[i * 2] = (byte) ((0xff00 & values[i]) >> 8);
			buffer[(i * 2) + 1] = (byte) (0xff & values[i]);
		}
		this.write(address, buffer, 0, buffer.length);
	}

}

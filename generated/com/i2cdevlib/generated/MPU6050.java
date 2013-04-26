package com.i2cdevlib.generated;

import java.io.IOException;
import com.pi4j.io.i2c.I2CBus;
import com.i2cdevlib.AbstractI2CDevice;

public abstract class MPU6050 extends AbstractI2CDevice {

	private static final int RA_AUX_VDDIO = 0;
	private static final int RA_YG_OFFS_TC = 1;
	private static final int RA_ZG_OFFS_TC = 2;
	private static final int RA_X_FINE_GAIN = 3;
	private static final int RA_Y_FINE_GAIN = 4;
	private static final int RA_Z_FINE_GAIN = 5;
	private static final int RA_XA_OFFS_H = 6;
	private static final int RA_XA_OFFS_L_TC = 7;
	private static final int RA_YA_OFFS_H = 8;
	private static final int RA_YA_OFFS_L_TC = 9;
	private static final int RA_ZA_OFFS_H = 10;
	private static final int RA_ZA_OFFS_L_TC = 11;
	private static final int RA_XG_OFFS_USRH = 19;
	private static final int RA_XG_OFFS_USRL = 20;
	private static final int RA_YG_OFFS_USRH = 21;
	private static final int RA_YG_OFFS_USRL = 22;
	private static final int RA_ZG_OFFS_USRH = 23;
	private static final int RA_ZG_OFFS_USRL = 24;
	private static final int RA_SMPLRT_DIV = 25;
	private static final int RA_CONFIG = 26;
	private static final int RA_GYRO_CONFIG = 27;
	private static final int RA_ACCEL_CONFIG = 28;
	private static final int RA_FF_THR = 29;
	private static final int RA_FF_DUR = 30;
	private static final int RA_MOT_THR = 31;
	private static final int RA_MOT_DUR = 32;
	private static final int RA_ZRMOT_THR = 33;
	private static final int RA_ZRMOT_DUR = 34;
	private static final int RA_FIFO_EN = 35;
	private static final int RA_I2C_MST_CTRL = 36;
	private static final int RA_I2C_SLV0_ADDR = 37;
	private static final int RA_I2C_SLV0_REG = 38;
	private static final int RA_I2C_SLV0_CTRL = 39;
	private static final int RA_I2C_SLV1_ADDR = 40;
	private static final int RA_I2C_SLV1_REG = 41;
	private static final int RA_I2C_SLV1_CTRL = 42;
	private static final int RA_I2C_SLV2_ADDR = 43;
	private static final int RA_I2C_SLV2_REG = 44;
	private static final int RA_I2C_SLV2_CTRL = 45;
	private static final int RA_I2C_SLV3_ADDR = 46;
	private static final int RA_I2C_SLV3_REG = 47;
	private static final int RA_I2C_SLV3_CTRL = 48;
	private static final int RA_I2C_SLV4_ADDR = 49;
	private static final int RA_I2C_SLV4_REG = 50;
	private static final int RA_I2C_SLV4_DO = 51;
	private static final int RA_I2C_SLV4_CTRL = 52;
	private static final int RA_I2C_SLV4_DI = 53;
	private static final int RA_I2C_MST_STATUS = 54;
	private static final int RA_INT_PIN_CFG = 55;
	private static final int RA_INT_ENABLE = 56;
	private static final int RA_DMP_INT_STATUS = 57;
	private static final int RA_INT_STATUS = 58;
	private static final int RA_ACCEL_XOUT_H = 59;
	private static final int RA_ACCEL_XOUT_L = 60;
	private static final int RA_ACCEL_YOUT_H = 61;
	private static final int RA_ACCEL_YOUT_L = 62;
	private static final int RA_ACCEL_ZOUT_H = 63;
	private static final int RA_ACCEL_ZOUT_L = 64;
	private static final int RA_TEMP_OUT_H = 65;
	private static final int RA_TEMP_OUT_L = 66;
	private static final int RA_GYRO_XOUT_H = 67;
	private static final int RA_GYRO_XOUT_L = 68;
	private static final int RA_GYRO_YOUT_H = 69;
	private static final int RA_GYRO_YOUT_L = 70;
	private static final int RA_GYRO_ZOUT_H = 71;
	private static final int RA_GYRO_ZOUT_L = 72;
	private static final int RA_EXT_SENS_DATA_00 = 73;
	private static final int RA_EXT_SENS_DATA_01 = 74;
	private static final int RA_EXT_SENS_DATA_02 = 75;
	private static final int RA_EXT_SENS_DATA_03 = 76;
	private static final int RA_EXT_SENS_DATA_04 = 77;
	private static final int RA_EXT_SENS_DATA_05 = 78;
	private static final int RA_EXT_SENS_DATA_06 = 79;
	private static final int RA_EXT_SENS_DATA_07 = 80;
	private static final int RA_EXT_SENS_DATA_08 = 81;
	private static final int RA_EXT_SENS_DATA_09 = 82;
	private static final int RA_EXT_SENS_DATA_10 = 83;
	private static final int RA_EXT_SENS_DATA_11 = 84;
	private static final int RA_EXT_SENS_DATA_12 = 85;
	private static final int RA_EXT_SENS_DATA_13 = 86;
	private static final int RA_EXT_SENS_DATA_14 = 87;
	private static final int RA_EXT_SENS_DATA_15 = 88;
	private static final int RA_EXT_SENS_DATA_16 = 89;
	private static final int RA_EXT_SENS_DATA_17 = 90;
	private static final int RA_EXT_SENS_DATA_18 = 91;
	private static final int RA_EXT_SENS_DATA_19 = 92;
	private static final int RA_EXT_SENS_DATA_20 = 93;
	private static final int RA_EXT_SENS_DATA_21 = 94;
	private static final int RA_EXT_SENS_DATA_22 = 95;
	private static final int RA_EXT_SENS_DATA_23 = 96;
	private static final int RA_MOT_DETECT_STATUS = 97;
	private static final int RA_I2C_SLV0_DO = 99;
	private static final int RA_I2C_SLV1_DO = 100;
	private static final int RA_I2C_SLV2_DO = 101;
	private static final int RA_I2C_SLV3_DO = 102;
	private static final int RA_I2C_MST_DELAY_CTRL = 103;
	private static final int RA_SIGNAL_PATH_RESET = 104;
	private static final int RA_MOT_DETECT_CTRL = 105;
	private static final int RA_USER_CTRL = 106;
	private static final int RA_PWR_MGMT_1 = 107;
	private static final int RA_PWR_MGMT_2 = 108;
	private static final int RA_BANK_SEL = 109;
	private static final int RA_MEM_START_ADDR = 110;
	private static final int RA_MEM_R_W = 111;
	private static final int RA_DMP_CFG_1 = 112;
	private static final int RA_DMP_CFG_2 = 113;
	private static final int RA_FIFO_COUNTH = 114;
	private static final int RA_FIFO_COUNTL = 115;
	private static final int RA_FIFO_R_W = 116;
	private static final int RA_WHO_AM_I = 117;

	public MPU6050(I2CBus bus, int address) {
	    super(bus, address);
    }

	public boolean getAuxVddio() throws IOException {
		return this.readBit(RA_AUX_VDDIO, 7);
	}

	public int getXgOffsTc() throws IOException {
		return this.readBits(RA_AUX_VDDIO, 6, 6);
	}

	public boolean getOtpBnkVld() throws IOException {
		return this.readBit(RA_AUX_VDDIO, 0);
	}

	public int getYgOffsTc() throws IOException {
		return this.readBits(RA_YG_OFFS_TC, 6, 6);
	}

	public int getZgOffsTc() throws IOException {
		return this.readBits(RA_ZG_OFFS_TC, 6, 6);
	}

	public int getXFineGain() throws IOException {
		return this.readBits(RA_X_FINE_GAIN, 7, 8);
	}

	public int getYFineGain() throws IOException {
		return this.readBits(RA_Y_FINE_GAIN, 7, 8);
	}

	public int getZFineGain() throws IOException {
		return this.readBits(RA_Z_FINE_GAIN, 7, 8);
	}

	public int getSmplrtDiv() throws IOException {
		return this.readBits(RA_SMPLRT_DIV, 7, 8);
	}

	public int getExtSyncSet() throws IOException {
		return this.readBits(RA_CONFIG, 5, 3);
	}

	public int getDlpfCfg() throws IOException {
		return this.readBits(RA_CONFIG, 2, 3);
	}

	public boolean getXgSt() throws IOException {
		return this.readBit(RA_GYRO_CONFIG, 7);
	}

	public boolean getYgSt() throws IOException {
		return this.readBit(RA_GYRO_CONFIG, 6);
	}

	public boolean getZgSt() throws IOException {
		return this.readBit(RA_GYRO_CONFIG, 5);
	}

	public int getFsSel() throws IOException {
		return this.readBits(RA_GYRO_CONFIG, 4, 2);
	}

	public boolean getXaSt() throws IOException {
		return this.readBit(RA_ACCEL_CONFIG, 7);
	}

	public boolean getYaSt() throws IOException {
		return this.readBit(RA_ACCEL_CONFIG, 6);
	}

	public boolean getZaSt() throws IOException {
		return this.readBit(RA_ACCEL_CONFIG, 5);
	}

	public int getAfsSel() throws IOException {
		return this.readBits(RA_ACCEL_CONFIG, 4, 2);
	}

	public int getAccelHpf() throws IOException {
		return this.readBits(RA_ACCEL_CONFIG, 2, 3);
	}

	public int getFfThr() throws IOException {
		return this.readBits(RA_FF_THR, 7, 8);
	}

	public int getFfDur() throws IOException {
		return this.readBits(RA_FF_DUR, 7, 8);
	}

	public int getMotThr() throws IOException {
		return this.readBits(RA_MOT_THR, 7, 8);
	}

	public int getMotDur() throws IOException {
		return this.readBits(RA_MOT_DUR, 7, 8);
	}

	public int getZrmotThr() throws IOException {
		return this.readBits(RA_ZRMOT_THR, 7, 8);
	}

	public int getZrmotDur() throws IOException {
		return this.readBits(RA_ZRMOT_DUR, 7, 8);
	}

	public boolean getTempFifoEn() throws IOException {
		return this.readBit(RA_FIFO_EN, 7);
	}

	public boolean getXgFifoEn() throws IOException {
		return this.readBit(RA_FIFO_EN, 6);
	}

	public boolean getYgFifoEn() throws IOException {
		return this.readBit(RA_FIFO_EN, 5);
	}

	public boolean getZgFifoEn() throws IOException {
		return this.readBit(RA_FIFO_EN, 4);
	}

	public boolean getAccelFifoEn() throws IOException {
		return this.readBit(RA_FIFO_EN, 3);
	}

	public boolean getSlv2FifoEn() throws IOException {
		return this.readBit(RA_FIFO_EN, 2);
	}

	public boolean getSlv1FifoEn() throws IOException {
		return this.readBit(RA_FIFO_EN, 1);
	}

	public boolean getSlv0FifoEn() throws IOException {
		return this.readBit(RA_FIFO_EN, 0);
	}

	public boolean getMultMstEn() throws IOException {
		return this.readBit(RA_I2C_MST_CTRL, 7);
	}

	public boolean getWaitForEs() throws IOException {
		return this.readBit(RA_I2C_MST_CTRL, 6);
	}

	public boolean getSlv3FifoEn() throws IOException {
		return this.readBit(RA_I2C_MST_CTRL, 5);
	}

	public boolean getI2cMstPNsr() throws IOException {
		return this.readBit(RA_I2C_MST_CTRL, 4);
	}

	public int getI2cMstClk() throws IOException {
		return this.readBits(RA_I2C_MST_CTRL, 3, 4);
	}

	public boolean getI2cSlv0Rw() throws IOException {
		return this.readBit(RA_I2C_SLV0_ADDR, 7);
	}

	public int getI2cSlv0Addr() throws IOException {
		return this.readBits(RA_I2C_SLV0_ADDR, 6, 7);
	}

	public int getI2cSlv0Reg() throws IOException {
		return this.readBits(RA_I2C_SLV0_REG, 7, 8);
	}

	public boolean getI2cSlv0En() throws IOException {
		return this.readBit(RA_I2C_SLV0_CTRL, 7);
	}

	public boolean getI2cSlv0ByteSw() throws IOException {
		return this.readBit(RA_I2C_SLV0_CTRL, 6);
	}

	public boolean getI2cSlv0RegDis() throws IOException {
		return this.readBit(RA_I2C_SLV0_CTRL, 5);
	}

	public boolean getI2cSlv0Grp() throws IOException {
		return this.readBit(RA_I2C_SLV0_CTRL, 4);
	}

	public int getI2cSlv0Len() throws IOException {
		return this.readBits(RA_I2C_SLV0_CTRL, 3, 4);
	}

	public boolean getI2cSlv1Rw() throws IOException {
		return this.readBit(RA_I2C_SLV1_ADDR, 7);
	}

	public int getI2cSlv1Addr() throws IOException {
		return this.readBits(RA_I2C_SLV1_ADDR, 6, 7);
	}

	public int getI2cSlv1Reg() throws IOException {
		return this.readBits(RA_I2C_SLV1_REG, 7, 8);
	}

	public boolean getI2cSlv1En() throws IOException {
		return this.readBit(RA_I2C_SLV1_CTRL, 7);
	}

	public boolean getI2cSlv1ByteSw() throws IOException {
		return this.readBit(RA_I2C_SLV1_CTRL, 6);
	}

	public boolean getI2cSlv1RegDis() throws IOException {
		return this.readBit(RA_I2C_SLV1_CTRL, 5);
	}

	public boolean getI2cSlv1Grp() throws IOException {
		return this.readBit(RA_I2C_SLV1_CTRL, 4);
	}

	public int getI2cSlv1Len() throws IOException {
		return this.readBits(RA_I2C_SLV1_CTRL, 3, 4);
	}

	public boolean getI2cSlv2Rw() throws IOException {
		return this.readBit(RA_I2C_SLV2_ADDR, 7);
	}

	public int getI2cSlv2Addr() throws IOException {
		return this.readBits(RA_I2C_SLV2_ADDR, 6, 7);
	}

	public int getI2cSlv2Reg() throws IOException {
		return this.readBits(RA_I2C_SLV2_REG, 7, 8);
	}

	public boolean getI2cSlv2En() throws IOException {
		return this.readBit(RA_I2C_SLV2_CTRL, 7);
	}

	public boolean getI2cSlv2ByteSw() throws IOException {
		return this.readBit(RA_I2C_SLV2_CTRL, 6);
	}

	public boolean getI2cSlv2RegDis() throws IOException {
		return this.readBit(RA_I2C_SLV2_CTRL, 5);
	}

	public boolean getI2cSlv2Grp() throws IOException {
		return this.readBit(RA_I2C_SLV2_CTRL, 4);
	}

	public int getI2cSlv2Len() throws IOException {
		return this.readBits(RA_I2C_SLV2_CTRL, 3, 4);
	}

	public boolean getI2cSlv3Rw() throws IOException {
		return this.readBit(RA_I2C_SLV3_ADDR, 7);
	}

	public int getI2cSlv3Addr() throws IOException {
		return this.readBits(RA_I2C_SLV3_ADDR, 6, 7);
	}

	public int getI2cSlv3Reg() throws IOException {
		return this.readBits(RA_I2C_SLV3_REG, 7, 8);
	}

	public boolean getI2cSlv3En() throws IOException {
		return this.readBit(RA_I2C_SLV3_CTRL, 7);
	}

	public boolean getI2cSlv3ByteSw() throws IOException {
		return this.readBit(RA_I2C_SLV3_CTRL, 6);
	}

	public boolean getI2cSlv3RegDis() throws IOException {
		return this.readBit(RA_I2C_SLV3_CTRL, 5);
	}

	public boolean getI2cSlv3Grp() throws IOException {
		return this.readBit(RA_I2C_SLV3_CTRL, 4);
	}

	public int getI2cSlv3Len() throws IOException {
		return this.readBits(RA_I2C_SLV3_CTRL, 3, 4);
	}

	public boolean getI2cSlv4Rw() throws IOException {
		return this.readBit(RA_I2C_SLV4_ADDR, 7);
	}

	public int getI2cSlv4Addr() throws IOException {
		return this.readBits(RA_I2C_SLV4_ADDR, 6, 7);
	}

	public int getI2cSlv4Reg() throws IOException {
		return this.readBits(RA_I2C_SLV4_REG, 7, 8);
	}

	public int getI2cSlv4Do() throws IOException {
		return this.readBits(RA_I2C_SLV4_DO, 7, 8);
	}

	public boolean getI2cSlv4En() throws IOException {
		return this.readBit(RA_I2C_SLV4_CTRL, 7);
	}

	public boolean getI2cSlv4IntEn() throws IOException {
		return this.readBit(RA_I2C_SLV4_CTRL, 6);
	}

	public boolean getI2cSlv4RegDis() throws IOException {
		return this.readBit(RA_I2C_SLV4_CTRL, 5);
	}

	public int getI2cMstDly() throws IOException {
		return this.readBits(RA_I2C_SLV4_CTRL, 4, 5);
	}

	public int getI2cSlv4Di() throws IOException {
		return this.readBits(RA_I2C_SLV4_DI, 7, 8);
	}

	public boolean getPassThrough() throws IOException {
		return this.readBit(RA_I2C_MST_STATUS, 7);
	}

	public boolean getI2cSlv4Done() throws IOException {
		return this.readBit(RA_I2C_MST_STATUS, 6);
	}

	public boolean getI2cLostArb() throws IOException {
		return this.readBit(RA_I2C_MST_STATUS, 5);
	}

	public boolean getI2cSlv4Nack() throws IOException {
		return this.readBit(RA_I2C_MST_STATUS, 4);
	}

	public boolean getI2cSlv3Nack() throws IOException {
		return this.readBit(RA_I2C_MST_STATUS, 3);
	}

	public boolean getI2cSlv2Nack() throws IOException {
		return this.readBit(RA_I2C_MST_STATUS, 2);
	}

	public boolean getI2cSlv1Nack() throws IOException {
		return this.readBit(RA_I2C_MST_STATUS, 1);
	}

	public boolean getI2cSlv0Nack() throws IOException {
		return this.readBit(RA_I2C_MST_STATUS, 0);
	}

	public boolean getIntLevel() throws IOException {
		return this.readBit(RA_INT_PIN_CFG, 7);
	}

	public boolean getIntOpen() throws IOException {
		return this.readBit(RA_INT_PIN_CFG, 6);
	}

	public boolean getLatchIntEn() throws IOException {
		return this.readBit(RA_INT_PIN_CFG, 5);
	}

	public boolean getIntRdClear() throws IOException {
		return this.readBit(RA_INT_PIN_CFG, 4);
	}

	public boolean getFsyncIntLevel() throws IOException {
		return this.readBit(RA_INT_PIN_CFG, 3);
	}

	public boolean getFsyncIntEn() throws IOException {
		return this.readBit(RA_INT_PIN_CFG, 2);
	}

	public boolean getI2cBypassEn() throws IOException {
		return this.readBit(RA_INT_PIN_CFG, 1);
	}

	public boolean getClkoutEn() throws IOException {
		return this.readBit(RA_INT_PIN_CFG, 0);
	}

	public boolean getFfEn() throws IOException {
		return this.readBit(RA_INT_ENABLE, 7);
	}

	public boolean getMotEn() throws IOException {
		return this.readBit(RA_INT_ENABLE, 6);
	}

	public boolean getZmotEn() throws IOException {
		return this.readBit(RA_INT_ENABLE, 5);
	}

	public boolean getFifoOflowEn() throws IOException {
		return this.readBit(RA_INT_ENABLE, 4);
	}

	public boolean getI2cMstIntEn() throws IOException {
		return this.readBit(RA_INT_ENABLE, 3);
	}

	public boolean getPllRdyIntEn() throws IOException {
		return this.readBit(RA_INT_ENABLE, 2);
	}

	public boolean getDmpIntEn() throws IOException {
		return this.readBit(RA_INT_ENABLE, 1);
	}

	public boolean getRawRdyEn() throws IOException {
		return this.readBit(RA_INT_ENABLE, 0);
	}

	public boolean getDmpInt5() throws IOException {
		return this.readBit(RA_DMP_INT_STATUS, 5);
	}

	public boolean getDmpInt4() throws IOException {
		return this.readBit(RA_DMP_INT_STATUS, 4);
	}

	public boolean getDmpInt3() throws IOException {
		return this.readBit(RA_DMP_INT_STATUS, 3);
	}

	public boolean getDmpInt2() throws IOException {
		return this.readBit(RA_DMP_INT_STATUS, 2);
	}

	public boolean getDmpInt1() throws IOException {
		return this.readBit(RA_DMP_INT_STATUS, 1);
	}

	public boolean getDmpInt0() throws IOException {
		return this.readBit(RA_DMP_INT_STATUS, 0);
	}

	public boolean getFfInt() throws IOException {
		return this.readBit(RA_INT_STATUS, 7);
	}

	public boolean getMotInt() throws IOException {
		return this.readBit(RA_INT_STATUS, 6);
	}

	public boolean getZmotInt() throws IOException {
		return this.readBit(RA_INT_STATUS, 5);
	}

	public boolean getFifoOflowInt() throws IOException {
		return this.readBit(RA_INT_STATUS, 4);
	}

	public boolean getI2cMstInt() throws IOException {
		return this.readBit(RA_INT_STATUS, 3);
	}

	public boolean getPllRdyInt() throws IOException {
		return this.readBit(RA_INT_STATUS, 2);
	}

	public boolean getDmpInt() throws IOException {
		return this.readBit(RA_INT_STATUS, 1);
	}

	public boolean getRawRdyInt() throws IOException {
		return this.readBit(RA_INT_STATUS, 0);
	}

	public int getExtSensData00() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_00, 7, 8);
	}

	public int getExtSensData01() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_01, 7, 8);
	}

	public int getExtSensData02() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_02, 7, 8);
	}

	public int getExtSensData03() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_03, 7, 8);
	}

	public int getExtSensData04() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_04, 7, 8);
	}

	public int getExtSensData05() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_05, 7, 8);
	}

	public int getExtSensData06() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_06, 7, 8);
	}

	public int getExtSensData07() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_07, 7, 8);
	}

	public int getExtSensData08() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_08, 7, 8);
	}

	public int getExtSensData09() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_09, 7, 8);
	}

	public int getExtSensData10() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_10, 7, 8);
	}

	public int getExtSensData11() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_11, 7, 8);
	}

	public int getExtSensData12() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_12, 7, 8);
	}

	public int getExtSensData13() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_13, 7, 8);
	}

	public int getExtSensData14() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_14, 7, 8);
	}

	public int getExtSensData15() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_15, 7, 8);
	}

	public int getExtSensData16() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_16, 7, 8);
	}

	public int getExtSensData17() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_17, 7, 8);
	}

	public int getExtSensData18() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_18, 7, 8);
	}

	public int getExtSensData19() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_19, 7, 8);
	}

	public int getExtSensData20() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_20, 7, 8);
	}

	public int getExtSensData21() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_21, 7, 8);
	}

	public int getExtSensData22() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_22, 7, 8);
	}

	public int getExtSensData23() throws IOException {
		return this.readBits(RA_EXT_SENS_DATA_23, 7, 8);
	}

	public boolean getMotXneg() throws IOException {
		return this.readBit(RA_MOT_DETECT_STATUS, 7);
	}

	public boolean getMotXpos() throws IOException {
		return this.readBit(RA_MOT_DETECT_STATUS, 6);
	}

	public boolean getMotYneg() throws IOException {
		return this.readBit(RA_MOT_DETECT_STATUS, 5);
	}

	public boolean getMotYpos() throws IOException {
		return this.readBit(RA_MOT_DETECT_STATUS, 4);
	}

	public boolean getMotZneg() throws IOException {
		return this.readBit(RA_MOT_DETECT_STATUS, 3);
	}

	public boolean getMotZpos() throws IOException {
		return this.readBit(RA_MOT_DETECT_STATUS, 2);
	}

	public boolean getMotZrmot() throws IOException {
		return this.readBit(RA_MOT_DETECT_STATUS, 0);
	}

	public int getI2cSlv0Do() throws IOException {
		return this.readBits(RA_I2C_SLV0_DO, 7, 8);
	}

	public int getI2cSlv1Do() throws IOException {
		return this.readBits(RA_I2C_SLV1_DO, 7, 8);
	}

	public int getI2cSlv2Do() throws IOException {
		return this.readBits(RA_I2C_SLV2_DO, 7, 8);
	}

	public int getI2cSlv3Do() throws IOException {
		return this.readBits(RA_I2C_SLV3_DO, 7, 8);
	}

	public boolean getDelayEsShadow() throws IOException {
		return this.readBit(RA_I2C_MST_DELAY_CTRL, 7);
	}

	public boolean getI2cSlv4DlyEn() throws IOException {
		return this.readBit(RA_I2C_MST_DELAY_CTRL, 4);
	}

	public boolean getI2cSlv3DlyEn() throws IOException {
		return this.readBit(RA_I2C_MST_DELAY_CTRL, 3);
	}

	public boolean getI2cSlv2DlyEn() throws IOException {
		return this.readBit(RA_I2C_MST_DELAY_CTRL, 2);
	}

	public boolean getI2cSlv1DlyEn() throws IOException {
		return this.readBit(RA_I2C_MST_DELAY_CTRL, 1);
	}

	public boolean getI2cSlv0DlyEn() throws IOException {
		return this.readBit(RA_I2C_MST_DELAY_CTRL, 0);
	}

	public boolean getGyroReset() throws IOException {
		return this.readBit(RA_SIGNAL_PATH_RESET, 2);
	}

	public boolean getAccelReset() throws IOException {
		return this.readBit(RA_SIGNAL_PATH_RESET, 1);
	}

	public boolean getTempReset() throws IOException {
		return this.readBit(RA_SIGNAL_PATH_RESET, 0);
	}

	public int getAccelOnDelay() throws IOException {
		return this.readBits(RA_MOT_DETECT_CTRL, 5, 2);
	}

	public int getFfCount() throws IOException {
		return this.readBits(RA_MOT_DETECT_CTRL, 3, 2);
	}

	public int getMotCount() throws IOException {
		return this.readBits(RA_MOT_DETECT_CTRL, 1, 2);
	}

	public boolean getDmpEn() throws IOException {
		return this.readBit(RA_USER_CTRL, 7);
	}

	public boolean getFifoEn() throws IOException {
		return this.readBit(RA_USER_CTRL, 6);
	}

	public boolean getI2cMstEn() throws IOException {
		return this.readBit(RA_USER_CTRL, 5);
	}

	public boolean getI2cIfDis() throws IOException {
		return this.readBit(RA_USER_CTRL, 4);
	}

	public boolean getDmpReset() throws IOException {
		return this.readBit(RA_USER_CTRL, 3);
	}

	public boolean getFifoReset() throws IOException {
		return this.readBit(RA_USER_CTRL, 2);
	}

	public boolean getI2cMstReset() throws IOException {
		return this.readBit(RA_USER_CTRL, 1);
	}

	public boolean getSigCondReset() throws IOException {
		return this.readBit(RA_USER_CTRL, 0);
	}

	public boolean getDeviceReset() throws IOException {
		return this.readBit(RA_PWR_MGMT_1, 7);
	}

	public boolean getSleep() throws IOException {
		return this.readBit(RA_PWR_MGMT_1, 6);
	}

	public boolean getCycle() throws IOException {
		return this.readBit(RA_PWR_MGMT_1, 5);
	}

	public boolean getTempDis() throws IOException {
		return this.readBit(RA_PWR_MGMT_1, 3);
	}

	public int getClkSel() throws IOException {
		return this.readBits(RA_PWR_MGMT_1, 2, 3);
	}

	public boolean getLpWakeCtrl() throws IOException {
		return this.readBit(RA_PWR_MGMT_2, 7);
	}

	public boolean getStbyXa() throws IOException {
		return this.readBit(RA_PWR_MGMT_2, 5);
	}

	public boolean getStbyYa() throws IOException {
		return this.readBit(RA_PWR_MGMT_2, 4);
	}

	public boolean getStbyZa() throws IOException {
		return this.readBit(RA_PWR_MGMT_2, 3);
	}

	public boolean getStbyXg() throws IOException {
		return this.readBit(RA_PWR_MGMT_2, 2);
	}

	public boolean getStbyYg() throws IOException {
		return this.readBit(RA_PWR_MGMT_2, 1);
	}

	public boolean getStbyZg() throws IOException {
		return this.readBit(RA_PWR_MGMT_2, 0);
	}

	public boolean getPrftchEn() throws IOException {
		return this.readBit(RA_BANK_SEL, 6);
	}

	public boolean getCfgUserBank() throws IOException {
		return this.readBit(RA_BANK_SEL, 5);
	}

	public int getMemSel() throws IOException {
		return this.readBits(RA_BANK_SEL, 4, 5);
	}

	public int getStartAddr() throws IOException {
		return this.readBits(RA_MEM_START_ADDR, 7, 8);
	}

	public int getMemRW() throws IOException {
		return this.readBits(RA_MEM_R_W, 7, 8);
	}

	public int getFifoRW() throws IOException {
		return this.readBits(RA_FIFO_R_W, 7, 8);
	}

	public int getWhoAmI() throws IOException {
		return this.readBits(RA_WHO_AM_I, 6, 6);
	}

}
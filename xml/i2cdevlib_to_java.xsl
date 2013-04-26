<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:i2c="http://www.i2cdevlib.com">
	<xsl:output method="text" omit-xml-declaration="yes" indent="no" media-type="text/plain" />

	<xsl:template match="//i2c:Device[1]">
		<xsl:call-template name="preamble" />
		<xsl:call-template name="registers" />
		<xsl:call-template name="constructor" />
		<xsl:call-template name="accessors" />
		<xsl:call-template name="postamble" />
	</xsl:template>

	<xsl:template name="preamble">
		<xsl:text>package com.i2cdevlib.generated;

import java.io.IOException;
import com.pi4j.io.i2c.I2CBus;
import com.i2cdevlib.AbstractI2CDevice;

public abstract class </xsl:text>
		<xsl:value-of select="./i2c:ShortName" />
		<xsl:text> extends AbstractI2CDevice {

</xsl:text>
	</xsl:template>

	<xsl:template name="registers">
		<xsl:for-each select="./i2c:Registers/i2c:Register">
			<xsl:text>	private static final int RA_</xsl:text>
			<xsl:value-of select="./i2c:ShortName" />
			<xsl:text> = </xsl:text>
			<xsl:value-of select="./i2c:Address" />
			<xsl:text>;
</xsl:text>
		</xsl:for-each>
	</xsl:template>

	<xsl:template name="constructor">
		<xsl:text>
	public </xsl:text>
		<xsl:value-of select="./i2c:ShortName" />
		<xsl:text>(I2CBus bus, int address) {
	    super(bus, address);
    }
</xsl:text>
	</xsl:template>

	<xsl:template name="accessors">
		<xsl:for-each select="./i2c:Registers/i2c:Register">
			<xsl:for-each select="./i2c:Fields/i2c:Field">
				<xsl:variable name="shortName">
					<xsl:call-template name="Pascalize">
						<xsl:with-param name="pText" select="concat(lower-case(./i2c:ShortName/text()), '_')" />
					</xsl:call-template>
				</xsl:variable>
				<xsl:choose>
					<xsl:when test="./i2c:BitLength = 1">
						<xsl:text>
	public boolean get</xsl:text>
						<xsl:value-of select="$shortName" />
						<xsl:text>() throws IOException {
		return this.readBit(RA_</xsl:text>
						<xsl:value-of select="../../i2c:ShortName" />
						<xsl:text>, </xsl:text>
						<xsl:value-of select="./i2c:StartBit" />
						<xsl:text>);
	}
</xsl:text>
					</xsl:when>
					<xsl:when test="./i2c:BitLength &gt; 1 and ./i2c:BitLength &lt;= 8">
						<xsl:text>
	public int get</xsl:text>
						<xsl:value-of select="$shortName" />
						<xsl:text>() throws IOException {
		return this.readBits(RA_</xsl:text>
						<xsl:value-of select="../../i2c:ShortName" />
						<xsl:text>, </xsl:text>
						<xsl:value-of select="./i2c:StartBit" />
						<xsl:text>, </xsl:text>
						<xsl:value-of select="./i2c:BitLength" />
						<xsl:text>);
	}
</xsl:text>
					</xsl:when>
				</xsl:choose>
			</xsl:for-each>
		</xsl:for-each>
	</xsl:template>

	<xsl:template name="postamble">
		<xsl:text>
}</xsl:text>
	</xsl:template>

	<xsl:variable name="vLower" select="'abcdefghijklmnopqrstuvwxyz'" />

	<xsl:variable name="vUpper" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'" />

	<xsl:template name="Pascalize">
		<xsl:param name="pText" />

		<xsl:if test="$pText">
			<xsl:value-of select="translate(substring($pText,1,1), $vLower, $vUpper)" />

			<xsl:value-of select="substring-before(substring($pText,2), '_')" />

			<xsl:call-template name="Pascalize">
				<xsl:with-param name="pText" select="substring-after(substring($pText,2), '_')" />
			</xsl:call-template>
		</xsl:if>
	</xsl:template>

</xsl:stylesheet>
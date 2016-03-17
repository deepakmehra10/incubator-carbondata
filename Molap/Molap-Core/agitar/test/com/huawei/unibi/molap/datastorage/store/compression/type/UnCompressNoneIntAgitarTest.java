/**
 * Generated by Agitar build: AgitarOne Version 5.3.0.000022 (Build date: Jan 04, 2012) [5.3.0.000022]
 * JDK Version: 1.6.0_14
 *
 * Generated on 29 Jul, 2013 2:35:32 PM
 * Time to generate: 00:16.679 seconds
 *
 */

package com.huawei.unibi.molap.datastorage.store.compression.type;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.iweb.platform.logging.LogService;
import com.huawei.unibi.molap.datastorage.store.compression.Compressor;
import com.huawei.unibi.molap.datastorage.store.compression.ValueCompressionUtil;
import com.huawei.unibi.molap.datastorage.store.compression.ValueCompressonHolder;
import com.huawei.unibi.molap.util.MolapCoreLogEvent;
import java.nio.ByteBuffer;

public class UnCompressNoneIntAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return UnCompressNoneInt.class;
    }
    
    public void testConstructor() throws Throwable {
        new UnCompressNoneInt();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testCompressWithAggressiveMocks() throws Throwable {
        storeStaticField(UnCompressNoneInt.class, "intCompressor");
        UnCompressNoneInt unCompressNoneInt = (UnCompressNoneInt) Mockingbird.getProxyObject(UnCompressNoneInt.class, true);
        int[] ints = new int[0];
        Mockingbird.enterRecordingMode();
        Mockingbird.replaceObjectForRecording(UnCompressNoneByte.class, "<init>()", new UnCompressNoneByte());
        Compressor compressor = (Compressor) Mockingbird.getProxyObject(Compressor.class);
        byte[] bytes = new byte[0];
        Mockingbird.enterNormalMode();
        unCompressNoneInt.setValue(ints);
        setPrivateField(UnCompressNoneInt.class, "intCompressor", compressor);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(compressor.compress(ints), bytes);
        Mockingbird.enterTestMode(UnCompressNoneInt.class);
        ValueCompressonHolder.UnCompressValue result = unCompressNoneInt.compress();
        assertEquals("result.getBackArrayData().length", 0, result.getBackArrayData().length);
        assertNotNull("unCompressNoneIntUnCompressNoneInt.intCompressor", getPrivateField(UnCompressNoneInt.class, "intCompressor"));
    }
    
    public void testGetBackArrayData() throws Throwable {
        int[] value = new int[2];
        UnCompressNoneInt unCompressNoneInt = new UnCompressNoneInt();
        unCompressNoneInt.setValue(value);
        byte[] result = unCompressNoneInt.getBackArrayData();
        assertEquals("result.length", 8, result.length);
        assertEquals("result[0]", (byte)0, result[0]);
    }
    
    public void testGetBackArrayData1() throws Throwable {
        UnCompressNoneInt unCompressNoneInt = new UnCompressNoneInt();
        int[] value = new int[0];
        unCompressNoneInt.setValue(value);
        byte[] result = unCompressNoneInt.getBackArrayData();
        assertEquals("result.length", 0, result.length);
    }
    
    public void testGetCompressorObject() throws Throwable {
        UnCompressNoneByte result = (UnCompressNoneByte) new UnCompressNoneInt().getCompressorObject();
        assertNull("result.getBackArrayData()", result.getBackArrayData());
    }
    
    public void testGetNew() throws Throwable {
        UnCompressNoneInt result = (UnCompressNoneInt) new UnCompressNoneInt().getNew();
        assertNotNull("result", result);
    }
    
    public void testGetNewWithAggressiveMocks() throws Throwable {
        storeStaticField(MolapCoreLogEvent.class, "UNIBI_MOLAPCORE_MSG");
        storeStaticField(UnCompressNoneInt.class, "LOGGER");
        UnCompressNoneInt unCompressNoneInt = (UnCompressNoneInt) Mockingbird.getProxyObject(UnCompressNoneInt.class, true);
        CloneNotSupportedException cloneNotSupportedException = (CloneNotSupportedException) Mockingbird.getProxyObject(CloneNotSupportedException.class);
        LogService logService = (LogService) Mockingbird.getProxyObject(LogService.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(false, unCompressNoneInt, "clone", "()java.lang.Object", new Object[] {}, cloneNotSupportedException, 1);
        setPrivateField(UnCompressNoneInt.class, "LOGGER", logService);
        setPrivateField(MolapCoreLogEvent.class, "UNIBI_MOLAPCORE_MSG", null);
        Mockingbird.setReturnValue(false, cloneNotSupportedException, "getMessage", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, logService, "error", "(com.huawei.iweb.platform.logging.LogEvent,java.lang.Throwable,java.lang.Object[])void", null, 1);
        Mockingbird.enterTestMode(UnCompressNoneInt.class);
        ValueCompressonHolder.UnCompressValue result = unCompressNoneInt.getNew();
        assertNull("result", result);
    }
    
    public void testGetValue() throws Throwable {
        UnCompressNoneInt unCompressNoneInt = new UnCompressNoneInt();
        int[] value = new int[1];
        value[0] = -7;
        unCompressNoneInt.setValue(value);
        double result = unCompressNoneInt.getValue(0, 100, 100.0);
        assertEquals("result", -7.0, result, 1.0E-6);
    }
    
    public void testGetValue1() throws Throwable {
        UnCompressNoneInt unCompressNoneInt = new UnCompressNoneInt();
        int[] value = new int[1];
        unCompressNoneInt.setValue(value);
        double result = unCompressNoneInt.getValue(0, 100, 100.0);
        assertEquals("result", 0.0, result, 1.0E-6);
    }
    
    public void testSetValue() throws Throwable {
        int[] value = new int[2];
        UnCompressNoneInt unCompressNoneInt = new UnCompressNoneInt();
        unCompressNoneInt.setValue(value);
        assertEquals("unCompressNoneInt.getBackArrayData().length", 8, unCompressNoneInt.getBackArrayData().length);
    }
    
    public void testSetValueInBytes() throws Throwable {
        UnCompressNoneInt unCompressNoneInt = new UnCompressNoneInt();
        byte[] value = new byte[3];
        unCompressNoneInt.setValueInBytes(value);
        assertEquals("unCompressNoneInt.getBackArrayData().length", 0, unCompressNoneInt.getBackArrayData().length);
    }
    
    public void testUncompress() throws Throwable {
        ValueCompressonHolder.UnCompressValue result = new UnCompressNoneInt().uncompress(ValueCompressionUtil.DataType.DATA_INT);
        assertNull("result", result);
    }
    
    public void testGetBackArrayDataThrowsNullPointerException() throws Throwable {
        try {
            new UnCompressNoneInt().getBackArrayData();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ValueCompressionUtil.class, ex);
        }
    }
    
    public void testGetValueThrowsArrayIndexOutOfBoundsException() throws Throwable {
        UnCompressNoneInt unCompressNoneInt = new UnCompressNoneInt();
        byte[] value = new byte[3];
        unCompressNoneInt.setValueInBytes(value);
        try {
            unCompressNoneInt.getValue(100, 1000, 100.0);
            fail("Expected ArrayIndexOutOfBoundsException to be thrown");
        } catch (ArrayIndexOutOfBoundsException ex) {
            assertEquals("ex.getMessage()", "100", ex.getMessage());
            assertThrownBy(UnCompressNoneInt.class, ex);
        }
    }
    
    public void testGetValueThrowsNullPointerException() throws Throwable {
        try {
            new UnCompressNoneInt().getValue(100, 1000, 100.0);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(UnCompressNoneInt.class, ex);
        }
    }
    
    public void testSetValueInBytesThrowsNullPointerException() throws Throwable {
        UnCompressNoneInt unCompressNoneInt = new UnCompressNoneInt();
        try {
            unCompressNoneInt.setValueInBytes((byte[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ByteBuffer.class, ex);
            assertNull("unCompressNoneInt.value", getPrivateField(unCompressNoneInt, "value"));
        }
    }
}

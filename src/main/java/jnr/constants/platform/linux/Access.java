// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2015-05-05 13:44:58 -0400
package jnr.constants.platform.linux;
public enum Access implements jnr.constants.Constant {
F_OK(0L),
R_OK(4L),
W_OK(2L),
X_OK(1L);
private final long value;
private Access(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 4L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}

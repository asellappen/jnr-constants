// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 23:19:36 +0000 2009
package jnr.constants.platform.sunos;
public enum WaitFlags implements jnr.constants.Constant {
WNOHANG(0x40),
WUNTRACED(0x4),
WSTOPPED(0x4),
WEXITED(0x1),
WCONTINUED(0x8),
WNOWAIT(0x80);
private final int value;
private WaitFlags(int value) { this.value = value; }
public static final long MIN_VALUE = 0x1;
public static final long MAX_VALUE = 0x80;

public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}

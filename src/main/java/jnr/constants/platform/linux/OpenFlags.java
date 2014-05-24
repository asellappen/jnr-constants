// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Tue Feb 24 09:44:03 +1000 2009
package jnr.constants.platform.linux;
public enum OpenFlags implements jnr.constants.Constant {
O_RDONLY(0),
O_WRONLY(1),
O_RDWR(2),
O_ACCMODE(3),
O_NONBLOCK(2048),
O_APPEND(1024),
O_SYNC(4096),
// O_SHLOCK not defined
// O_EXLOCK not defined
O_ASYNC(8192),
O_FSYNC(4096),
// O_NOFOLLOW not defined
O_CREAT(64),
O_TRUNC(512),
O_EXCL(128);
// O_EVTONLY not defined
// O_DIRECTORY not defined
// O_SYMLINK not defined
private final int value;
private OpenFlags(int value) { this.value = value; }
public static final long MIN_VALUE = 0;
public static final long MAX_VALUE = 8192;

public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}

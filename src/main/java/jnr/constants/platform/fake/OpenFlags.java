// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-11 17:01:28 -0500
package jnr.constants.platform.fake;
public enum OpenFlags implements jnr.constants.Constant {
O_RDONLY(0x1),
O_WRONLY(0x2),
O_RDWR(0x4),
O_ACCMODE(0x8),
O_NONBLOCK(0x10),
O_APPEND(0x20),
O_SYNC(0x40),
O_SHLOCK(0x80),
O_EXLOCK(0x100),
O_ASYNC(0x200),
O_FSYNC(0x400),
O_NOFOLLOW(0x800),
O_CREAT(0x1000),
O_TRUNC(0x2000),
O_EXCL(0x4000),
O_EVTONLY(0x8000),
O_DIRECTORY(0x10000),
O_SYMLINK(0x20000),
O_BINARY(0x40000),
O_NOCTTY(0x80000),
O_TMPFILE(0x100000),
O_CLOEXEC(0x200000);
private final long value;
private OpenFlags(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 0x200000L;
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}

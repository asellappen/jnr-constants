// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Sat May 02 18:23:29 +1000 2009
package com.kenai.constantine.platform;
@Deprecated
public enum OpenFlags implements com.kenai.constantine.Constant {
O_RDONLY,
O_WRONLY,
O_RDWR,
O_ACCMODE,
O_NONBLOCK,
O_APPEND,
O_SYNC,
O_SHLOCK,
O_EXLOCK,
O_ASYNC,
O_FSYNC,
O_NOFOLLOW,
O_CREAT,
O_TRUNC,
O_EXCL,
O_EVTONLY,
O_DIRECTORY,
O_SYMLINK,
O_BINARY,
O_NOCTTY,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<OpenFlags> resolver = 
ConstantResolver.getBitmaskResolver(OpenFlags.class);
public final int value() { return resolver.intValue(this); }
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final boolean defined() { return true; }
public final String toString() { return description(); }
public final static OpenFlags valueOf(int value) { 
    return resolver.valueOf(value);
}
}

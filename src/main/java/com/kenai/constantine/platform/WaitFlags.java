// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Sat May 02 18:23:28 +1000 2009
package com.kenai.constantine.platform;
@Deprecated
public enum WaitFlags implements com.kenai.constantine.Constant {
WNOHANG,
WUNTRACED,
WSTOPPED,
WEXITED,
WCONTINUED,
WNOWAIT,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<WaitFlags> resolver = 
ConstantResolver.getBitmaskResolver(WaitFlags.class);
public final int value() { return resolver.intValue(this); }
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final boolean defined() { return true; }
public final String toString() { return description(); }
public final static WaitFlags valueOf(int value) { 
    return resolver.valueOf(value);
}
}

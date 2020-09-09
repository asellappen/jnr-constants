// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-03 01:01:45 +0200
package jnr.constants.platform;
public enum SocketControlMessage implements jnr.constants.Constant {
SCM_RIGHTS,
SCM_TIMESTAMP,
SCM_TIMESTAMPNS,
SCM_TIMESTAMPING,
SCM_BINTIME,
SCM_CREDENTIALS,
SCM_CREDS,
SCM_UCRED,
SCM_WIFI_STATUS,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<SocketControlMessage> resolver = 
ConstantResolver.getResolver(SocketControlMessage.class, 20000, 29999);
public final int value() { return (int) resolver.longValue(this); }
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final boolean defined() { return resolver.defined(this); }
public final String toString() { return description(); }
public static SocketControlMessage valueOf(long value) { 
    return resolver.valueOf(value);
}
}

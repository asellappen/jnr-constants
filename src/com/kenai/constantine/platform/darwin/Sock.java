// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Fri Nov 14 22:41:55 +1000 2008
package com.kenai.constantine.platform.darwin;
public enum Sock implements com.kenai.constantine.Constant {
SOCK_STREAM(1),
SOCK_DGRAM(2),
SOCK_RAW(3),
SOCK_RDM(4),
SOCK_SEQPACKET(5),
SOCK_MAXADDRLEN(255);
private final int value;
private Sock(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 255;

public final int value() { return value; }
}

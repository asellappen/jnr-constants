// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Wed Feb 25 18:33:12 +1000 2009
package jnr.constants.platform.openbsd;
public enum PRIO implements jnr.constants.Constant {
PRIO_MIN(-20),
PRIO_PROCESS(0),
PRIO_PGRP(1),
PRIO_USER(2),
PRIO_MAX(20);
private final int value;
private PRIO(int value) { this.value = value; }
public static final long MIN_VALUE = -20;
public static final long MAX_VALUE = 20;

public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}

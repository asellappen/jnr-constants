// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Fri Nov 28 12:42:01 +1000 2008
package com.kenai.constantine.platform.fake;
public enum PRIO implements com.kenai.constantine.Constant {
PRIO_MIN(1),
PRIO_PROCESS(2),
PRIO_PGRP(3),
PRIO_USER(4),
PRIO_MAX(5);
private final int value;
private PRIO(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 5;
public final int value() { return value; }
}

// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 23:19:31 +0000 2009
package jnr.constants.platform.sunos;
public enum IPProto implements jnr.constants.Constant {
IPPROTO_IP(0),
IPPROTO_HOPOPTS(0),
IPPROTO_ICMP(1),
IPPROTO_IGMP(2),
// IPPROTO_IPIP not defined
IPPROTO_TCP(6),
IPPROTO_EGP(8),
IPPROTO_PUP(12),
IPPROTO_UDP(17),
IPPROTO_IDP(22),
// IPPROTO_TP not defined
IPPROTO_IPV6(41),
IPPROTO_ROUTING(43),
IPPROTO_FRAGMENT(44),
IPPROTO_RSVP(46),
// IPPROTO_GRE not defined
IPPROTO_ESP(50),
IPPROTO_AH(51),
IPPROTO_ICMPV6(58),
IPPROTO_NONE(59),
IPPROTO_DSTOPTS(60),
// IPPROTO_MTP not defined
IPPROTO_ENCAP(4),
IPPROTO_PIM(103),
// IPPROTO_COMP not defined
IPPROTO_SCTP(132),
IPPROTO_RAW(255),
IPPROTO_MAX(256);
private final int value;
private IPProto(int value) { this.value = value; }
public static final long MIN_VALUE = 0;
public static final long MAX_VALUE = 256;

public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}

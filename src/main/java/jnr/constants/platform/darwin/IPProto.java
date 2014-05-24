// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2010-07-31 18:57:12 +1000
package jnr.constants.platform.darwin;
public enum IPProto implements jnr.constants.Constant {
IPPROTO_IP(0L),
IPPROTO_HOPOPTS(0L),
IPPROTO_ICMP(1L),
IPPROTO_IGMP(2L),
IPPROTO_IPIP(4L),
IPPROTO_TCP(6L),
IPPROTO_EGP(8L),
IPPROTO_PUP(12L),
IPPROTO_UDP(17L),
IPPROTO_IDP(22L),
IPPROTO_TP(29L),
IPPROTO_IPV6(41L),
IPPROTO_ROUTING(43L),
IPPROTO_FRAGMENT(44L),
IPPROTO_RSVP(46L),
IPPROTO_GRE(47L),
IPPROTO_ESP(50L),
IPPROTO_AH(51L),
IPPROTO_ICMPV6(58L),
IPPROTO_NONE(59L),
IPPROTO_DSTOPTS(60L),
IPPROTO_MTP(92L),
IPPROTO_ENCAP(98L),
IPPROTO_PIM(103L),
// IPPROTO_COMP not defined
// IPPROTO_SCTP not defined
IPPROTO_RAW(255L),
IPPROTO_MAX(256L);
private final long value;
private IPProto(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 256L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}

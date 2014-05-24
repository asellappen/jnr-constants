// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2010-07-31 18:57:12 +1000
package jnr.constants.platform.darwin;
public enum AddressFamily implements jnr.constants.Constant {
AF_UNSPEC(0L),
AF_LOCAL(1L),
AF_UNIX(1L),
AF_INET(2L),
AF_IMPLINK(3L),
AF_PUP(4L),
AF_CHAOS(5L),
AF_NS(6L),
AF_ISO(7L),
AF_OSI(7L),
AF_ECMA(8L),
AF_DATAKIT(9L),
AF_CCITT(10L),
AF_SNA(11L),
AF_DECnet(12L),
AF_DLI(13L),
AF_LAT(14L),
AF_HYLINK(15L),
AF_APPLETALK(16L),
AF_ROUTE(17L),
AF_LINK(18L),
pseudo_AF_XTP(19L),
AF_COIP(20L),
AF_CNT(21L),
pseudo_AF_RTIP(22L),
AF_IPX(23L),
AF_SIP(24L),
pseudo_AF_PIP(25L),
AF_NDRV(27L),
AF_ISDN(28L),
AF_E164(28L),
pseudo_AF_KEY(29L),
AF_INET6(30L),
AF_NATM(31L),
AF_SYSTEM(32L),
AF_NETBIOS(33L),
AF_PPP(34L),
// AF_ATM not defined
pseudo_AF_HDRCMPLT(35L),
// AF_NETGRAPH not defined
// AF_AX25 not defined
AF_MAX(38L);
private final long value;
private AddressFamily(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 38L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}

// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-08-29 20:48:08 +0200
package jnr.constants.platform.solaris;
public enum TCP implements jnr.constants.Constant {
TCP_MSS(536L),
// TCP_MAX_SACK not defined
// TCP_MINMSS not defined
// TCP_MINMSSOVERLOAD not defined
// TCP_MAXWIN not defined
// TCP_MAX_WINSHIFT not defined
// TCP_MAXBURST not defined
// TCP_MAXHLEN not defined
// TCP_MAXOLEN not defined
TCP_NODELAY(1L),
TCP_MAXSEG(2L),
// TCP_NOPUSH not defined
// TCP_NOOPT not defined
TCP_KEEPALIVE(8L),
// TCP_NSTATES not defined
// TCP_RETRANSHZ not defined
TCP_CORK(24L),
// TCP_DEFER_ACCEPT not defined
TCP_INFO(34L),
TCP_KEEPCNT(31L),
TCP_KEEPIDLE(29L),
TCP_KEEPINTVL(30L),
TCP_LINGER2(28L),
TCP_MD5SIG(36L),
// TCP_QUICKACK not defined
// TCP_SYNCNT not defined
// TCP_WINDOW_CLAMP not defined
// TCP_FASTOPEN not defined
TCP_CONGESTION(35L);
// TCP_COOKIE_TRANSACTIONS not defined
// TCP_QUEUE_SEQ not defined
// TCP_REPAIR not defined
// TCP_REPAIR_OPTIONS not defined
// TCP_REPAIR_QUEUE not defined
// TCP_THIN_DUPACK not defined
// TCP_THIN_LINEAR_TIMEOUTS not defined
// TCP_TIMESTAMP not defined
// TCP_USER_TIMEOUT not defined
private final long value;
private TCP(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 536L;

static final class StringTable {
  public static final java.util.Map<TCP, String> descriptions = generateTable();
  public static final java.util.Map<TCP, String> generateTable() {
    java.util.Map<TCP, String> map = new java.util.EnumMap<TCP, String>(TCP.class);
  map.put(TCP_MSS, "TCP_MSS");
  map.put(TCP_NODELAY, "TCP_NODELAY");
  map.put(TCP_MAXSEG, "TCP_MAXSEG");
  map.put(TCP_KEEPALIVE, "TCP_KEEPALIVE");
  map.put(TCP_CORK, "TCP_CORK");
  map.put(TCP_INFO, "TCP_INFO");
  map.put(TCP_KEEPCNT, "TCP_KEEPCNT");
  map.put(TCP_KEEPIDLE, "TCP_KEEPIDLE");
  map.put(TCP_KEEPINTVL, "TCP_KEEPINTVL");
  map.put(TCP_LINGER2, "TCP_LINGER2");
  map.put(TCP_MD5SIG, "TCP_MD5SIG");
  map.put(TCP_CONGESTION, "TCP_CONGESTION");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}

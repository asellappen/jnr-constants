// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 23:19:36 +0000 2009
package jnr.constants.platform.sunos;
public enum Signal implements jnr.constants.Constant {
SIGHUP(1),
SIGINT(2),
SIGQUIT(3),
SIGILL(4),
SIGTRAP(5),
SIGABRT(6),
SIGIOT(6),
SIGBUS(10),
SIGFPE(8),
SIGKILL(9),
SIGUSR1(16),
SIGSEGV(11),
SIGUSR2(17),
SIGPIPE(13),
SIGALRM(14),
SIGTERM(15),
// SIGSTKFLT not defined
SIGCLD(18),
SIGCHLD(18),
SIGCONT(25),
SIGSTOP(23),
SIGTSTP(24),
SIGTTIN(26),
SIGTTOU(27),
SIGURG(21),
SIGXCPU(30),
SIGXFSZ(31),
SIGVTALRM(28),
SIGPROF(29),
SIGWINCH(20),
SIGPOLL(22),
SIGIO(22),
SIGPWR(19),
SIGSYS(12),
// SIGUNUSED not defined
SIGRTMIN(41),
SIGRTMAX(48),
NSIG(49);
private final int value;
private Signal(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 49;

public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}

// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2010-07-31 18:57:14 +1000
package jnr.constants.platform;
public enum Signal implements jnr.constants.Constant {
SIGHUP,
SIGINT,
SIGQUIT,
SIGILL,
SIGTRAP,
SIGABRT,
SIGIOT,
SIGBUS,
SIGFPE,
SIGKILL,
SIGUSR1,
SIGSEGV,
SIGUSR2,
SIGPIPE,
SIGALRM,
SIGTERM,
SIGSTKFLT,
SIGCLD,
SIGCHLD,
SIGCONT,
SIGSTOP,
SIGTSTP,
SIGTTIN,
SIGTTOU,
SIGURG,
SIGXCPU,
SIGXFSZ,
SIGVTALRM,
SIGPROF,
SIGWINCH,
SIGPOLL,
SIGIO,
SIGPWR,
SIGSYS,
SIGUNUSED,
SIGRTMIN,
SIGRTMAX,
NSIG,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<Signal> resolver = 
ConstantResolver.getResolver(Signal.class, 20000, 29999);
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final boolean defined() { return resolver.defined(this); }
public final String toString() { return description(); }
public static Signal valueOf(long value) { 
    return resolver.valueOf(value);
}
}

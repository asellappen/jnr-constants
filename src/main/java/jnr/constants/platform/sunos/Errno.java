// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 23:19:31 +0000 2009
package jnr.constants.platform.sunos;
public enum Errno implements jnr.constants.Constant {
EPERM(1),
ENOENT(2),
ESRCH(3),
EINTR(4),
EIO(5),
ENXIO(6),
E2BIG(7),
ENOEXEC(8),
EBADF(9),
ECHILD(10),
EDEADLK(45),
ENOMEM(12),
EACCES(13),
EFAULT(14),
ENOTBLK(15),
EBUSY(16),
EEXIST(17),
EXDEV(18),
ENODEV(19),
ENOTDIR(20),
EISDIR(21),
EINVAL(22),
ENFILE(23),
EMFILE(24),
ENOTTY(25),
ETXTBSY(26),
EFBIG(27),
ENOSPC(28),
ESPIPE(29),
EROFS(30),
EMLINK(31),
EPIPE(32),
EDOM(33),
ERANGE(34),
EWOULDBLOCK(11),
EAGAIN(11),
EINPROGRESS(150),
EALREADY(149),
ENOTSOCK(95),
EDESTADDRREQ(96),
EMSGSIZE(97),
EPROTOTYPE(98),
ENOPROTOOPT(99),
EPROTONOSUPPORT(120),
ESOCKTNOSUPPORT(121),
EOPNOTSUPP(122),
EPFNOSUPPORT(123),
EAFNOSUPPORT(124),
EADDRINUSE(125),
EADDRNOTAVAIL(126),
ENETDOWN(127),
ENETUNREACH(128),
ENETRESET(129),
ECONNABORTED(130),
ECONNRESET(131),
ENOBUFS(132),
EISCONN(133),
ENOTCONN(134),
ESHUTDOWN(143),
ETOOMANYREFS(144),
ETIMEDOUT(145),
ECONNREFUSED(146),
ELOOP(90),
ENAMETOOLONG(78),
EHOSTDOWN(147),
EHOSTUNREACH(148),
ENOTEMPTY(93),
EUSERS(94),
EDQUOT(49),
ESTALE(151),
EREMOTE(66),
ENOLCK(46),
ENOSYS(89),
EOVERFLOW(79),
EIDRM(36),
ENOMSG(35),
EILSEQ(88),
EBADMSG(77),
EMULTIHOP(74),
ENODATA(61),
ENOLINK(67),
ENOSR(63),
ENOSTR(60),
EPROTO(71),
ETIME(62);
private final int value;
private Errno(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 151;

static final class StringTable {
  public static final java.util.Map<Errno, String> descriptions = generateTable();
  public static final java.util.Map<Errno, String> generateTable() {
    java.util.Map<Errno, String> map = new java.util.EnumMap<Errno, String>(Errno.class);
  map.put(EPERM, "Not owner");
  map.put(ENOENT, "No such file or directory");
  map.put(ESRCH, "No such process");
  map.put(EINTR, "Interrupted system call");
  map.put(EIO, "I/O error");
  map.put(ENXIO, "No such device or address");
  map.put(E2BIG, "Arg list too long");
  map.put(ENOEXEC, "Exec format error");
  map.put(EBADF, "Bad file number");
  map.put(ECHILD, "No child processes");
  map.put(EDEADLK, "Deadlock situation detected/avoided");
  map.put(ENOMEM, "Not enough space");
  map.put(EACCES, "Permission denied");
  map.put(EFAULT, "Bad address");
  map.put(ENOTBLK, "Block device required");
  map.put(EBUSY, "Device busy");
  map.put(EEXIST, "File exists");
  map.put(EXDEV, "Cross-device link");
  map.put(ENODEV, "No such device");
  map.put(ENOTDIR, "Not a directory");
  map.put(EISDIR, "Is a directory");
  map.put(EINVAL, "Invalid argument");
  map.put(ENFILE, "File table overflow");
  map.put(EMFILE, "Too many open files");
  map.put(ENOTTY, "Inappropriate ioctl for device");
  map.put(ETXTBSY, "Text file busy");
  map.put(EFBIG, "File too large");
  map.put(ENOSPC, "No space left on device");
  map.put(ESPIPE, "Illegal seek");
  map.put(EROFS, "Read-only file system");
  map.put(EMLINK, "Too many links");
  map.put(EPIPE, "Broken pipe");
  map.put(EDOM, "Argument out of domain");
  map.put(ERANGE, "Result too large");
  map.put(EWOULDBLOCK, "Resource temporarily unavailable");
  map.put(EAGAIN, "Resource temporarily unavailable");
  map.put(EINPROGRESS, "Operation now in progress");
  map.put(EALREADY, "Operation already in progress");
  map.put(ENOTSOCK, "Socket operation on non-socket");
  map.put(EDESTADDRREQ, "Destination address required");
  map.put(EMSGSIZE, "Message too long");
  map.put(EPROTOTYPE, "Protocol wrong type for socket");
  map.put(ENOPROTOOPT, "Option not supported by protocol");
  map.put(EPROTONOSUPPORT, "Protocol not supported");
  map.put(ESOCKTNOSUPPORT, "Socket type not supported");
  map.put(EOPNOTSUPP, "Operation not supported on transport endpoint");
  map.put(EPFNOSUPPORT, "Protocol family not supported");
  map.put(EAFNOSUPPORT, "Address family not supported by protocol family");
  map.put(EADDRINUSE, "Address already in use");
  map.put(EADDRNOTAVAIL, "Cannot assign requested address");
  map.put(ENETDOWN, "Network is down");
  map.put(ENETUNREACH, "Network is unreachable");
  map.put(ENETRESET, "Network dropped connection because of reset");
  map.put(ECONNABORTED, "Software caused connection abort");
  map.put(ECONNRESET, "Connection reset by peer");
  map.put(ENOBUFS, "No buffer space available");
  map.put(EISCONN, "Transport endpoint is already connected");
  map.put(ENOTCONN, "Transport endpoint is not connected");
  map.put(ESHUTDOWN, "Cannot send after socket shutdown");
  map.put(ETOOMANYREFS, "Too many references: cannot splice");
  map.put(ETIMEDOUT, "Connection timed out");
  map.put(ECONNREFUSED, "Connection refused");
  map.put(ELOOP, "Number of symbolic links encountered during path name traversal exceeds MAXSYMLINKS");
  map.put(ENAMETOOLONG, "File name too long");
  map.put(EHOSTDOWN, "Host is down");
  map.put(EHOSTUNREACH, "No route to host");
  map.put(ENOTEMPTY, "Directory not empty");
  map.put(EUSERS, "Too many users");
  map.put(EDQUOT, "Disc quota exceeded");
  map.put(ESTALE, "Stale NFS file handle");
  map.put(EREMOTE, "Object is remote");
  map.put(ENOLCK, "No record locks available");
  map.put(ENOSYS, "Operation not applicable");
  map.put(EOVERFLOW, "Value too large for defined data type");
  map.put(EIDRM, "Identifier removed");
  map.put(ENOMSG, "No message of desired type");
  map.put(EILSEQ, "Illegal byte sequence");
  map.put(EBADMSG, "Not a data message");
  map.put(EMULTIHOP, "Multihop attempted");
  map.put(ENODATA, "No data available");
  map.put(ENOLINK, "Link has been severed");
  map.put(ENOSR, "Out of stream resources");
  map.put(ENOSTR, "Not a stream device");
  map.put(EPROTO, "Protocol error");
  map.put(ETIME, "Timer expired");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}

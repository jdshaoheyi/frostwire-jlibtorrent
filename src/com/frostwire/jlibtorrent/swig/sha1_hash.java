/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class sha1_hash {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected sha1_hash(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(sha1_hash obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_sha1_hash(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public sha1_hash() {
    this(libtorrent_jni.new_sha1_hash__SWIG_0(), true);
  }

  public static sha1_hash max() {
    return new sha1_hash(libtorrent_jni.sha1_hash_max(), true);
  }

  public static sha1_hash min() {
    return new sha1_hash(libtorrent_jni.sha1_hash_min(), true);
  }

  public sha1_hash(String s) {
    this(libtorrent_jni.new_sha1_hash__SWIG_1(s), true);
  }

  public void assign(String s) {
    libtorrent_jni.sha1_hash_assign__SWIG_0(swigCPtr, this, s);
  }

  public void clear() {
    libtorrent_jni.sha1_hash_clear(swigCPtr, this);
  }

  public boolean is_all_zeros() {
    return libtorrent_jni.sha1_hash_is_all_zeros(swigCPtr, this);
  }

  public boolean op_eq(sha1_hash n) {
    return libtorrent_jni.sha1_hash_op_eq(swigCPtr, this, sha1_hash.getCPtr(n), n);
  }

  public boolean op_neq(sha1_hash n) {
    return libtorrent_jni.sha1_hash_op_neq(swigCPtr, this, sha1_hash.getCPtr(n), n);
  }

  public boolean op_lt(sha1_hash n) {
    return libtorrent_jni.sha1_hash_op_lt(swigCPtr, this, sha1_hash.getCPtr(n), n);
  }

  public SWIGTYPE_p_unsigned_char op_get_at(int i) {
    return new SWIGTYPE_p_unsigned_char(libtorrent_jni.sha1_hash_op_get_at__SWIG_0(swigCPtr, this, i), false);
  }

  public SWIGTYPE_p_unsigned_char begin() {
    long cPtr = libtorrent_jni.sha1_hash_begin__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public SWIGTYPE_p_unsigned_char end() {
    long cPtr = libtorrent_jni.sha1_hash_end__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public String to_string() {
    return libtorrent_jni.sha1_hash_to_string(swigCPtr, this);
  }

  public final static int size = libtorrent_jni.sha1_hash_size_get();
}
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class error_code {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected error_code(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(error_code obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_error_code(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public error_code() {
    this(libtorrent_jni.new_error_code(), true);
  }

  public void clear() {
    libtorrent_jni.error_code_clear(swigCPtr, this);
  }

  public int value() {
    return libtorrent_jni.error_code_value(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.error_code_message(swigCPtr, this);
  }

}

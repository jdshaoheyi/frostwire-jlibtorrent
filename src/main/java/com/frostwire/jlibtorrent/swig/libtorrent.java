/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class libtorrent implements libtorrentConstants {
  public static boolean op_eq(error_code lhs, error_code rhs) {
    return libtorrent_jni.op_eq__SWIG_1(error_code.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static boolean op_lt(error_code lhs, error_code rhs) {
    return libtorrent_jni.op_lt__SWIG_1(error_code.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static boolean op_ne(error_code lhs, error_code rhs) {
    return libtorrent_jni.op_ne(error_code.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static error_code make_error_code(errc_t e) {
    return new error_code(libtorrent_jni.make_error_code(e.swigValue()), true);
  }

  public static String version() {
    return libtorrent_jni.version();
  }

  public static stats_metric_vector session_stats_metrics() {
    return new stats_metric_vector(libtorrent_jni.session_stats_metrics(), true);
  }

  public static int find_metric_idx(String name) {
    return libtorrent_jni.find_metric_idx(name);
  }

  public static String operation_name(int op) {
    return libtorrent_jni.operation_name(op);
  }

  public static int setting_by_name(String name) {
    return libtorrent_jni.setting_by_name(name);
  }

  public static String name_for_setting(int s) {
    return libtorrent_jni.name_for_setting(s);
  }

  public static dht_state read_dht_state(bdecode_node e) {
    return new dht_state(libtorrent_jni.read_dht_state(bdecode_node.getCPtr(e), e), true);
  }

  public static entry save_dht_state(dht_state state) {
    return new entry(libtorrent_jni.save_dht_state(dht_state.getCPtr(state), state), true);
  }

  public static settings_pack min_memory_usage() {
    return new settings_pack(libtorrent_jni.min_memory_usage(), true);
  }

  public static settings_pack high_performance_seed() {
    return new settings_pack(libtorrent_jni.high_performance_seed(), true);
  }

  public static session_params read_session_params(bdecode_node e, long flags) {
    return new session_params(libtorrent_jni.read_session_params__SWIG_0(bdecode_node.getCPtr(e), e, flags), true);
  }

  public static session_params read_session_params(bdecode_node e) {
    return new session_params(libtorrent_jni.read_session_params__SWIG_1(bdecode_node.getCPtr(e), e), true);
  }

  public static boolean op_lte(address lhs, address rhs) {
    return libtorrent_jni.op_lte(address.getCPtr(lhs), lhs, address.getCPtr(rhs), rhs);
  }

  public static String make_magnet_uri(torrent_handle handle) {
    return libtorrent_jni.make_magnet_uri__SWIG_0(torrent_handle.getCPtr(handle), handle);
  }

  public static String make_magnet_uri(torrent_info info) {
    return libtorrent_jni.make_magnet_uri__SWIG_1(torrent_info.getCPtr(info), info);
  }

  public static void parse_magnet_uri(String uri, add_torrent_params p, error_code ec) {
    libtorrent_jni.parse_magnet_uri(uri, add_torrent_params.getCPtr(p), p, error_code.getCPtr(ec), ec);
  }

  public static void add_files(file_storage fs, String file, long flags) {
    libtorrent_jni.add_files__SWIG_0(file_storage.getCPtr(fs), fs, file, flags);
  }

  public static void add_files(file_storage fs, String file) {
    libtorrent_jni.add_files__SWIG_1(file_storage.getCPtr(fs), fs, file);
  }

  public static void set_piece_hashes(create_torrent t, String p, error_code ec) {
    libtorrent_jni.set_piece_hashes(create_torrent.getCPtr(t), t, p, error_code.getCPtr(ec), ec);
  }

  public static byte_vector ed25519_create_seed() {
    return new byte_vector(libtorrent_jni.ed25519_create_seed(), true);
  }

  public static byte_vectors_pair ed25519_create_keypair(byte_vector seed) {
    return new byte_vectors_pair(libtorrent_jni.ed25519_create_keypair(byte_vector.getCPtr(seed), seed), true);
  }

  public static byte_vector ed25519_sign(byte_vector msg, byte_vector pk, byte_vector sk) {
    return new byte_vector(libtorrent_jni.ed25519_sign(byte_vector.getCPtr(msg), msg, byte_vector.getCPtr(pk), pk, byte_vector.getCPtr(sk), sk), true);
  }

  public static boolean ed25519_verify(byte_vector sig, byte_vector msg, byte_vector pk) {
    return libtorrent_jni.ed25519_verify(byte_vector.getCPtr(sig), sig, byte_vector.getCPtr(msg), msg, byte_vector.getCPtr(pk), pk);
  }

  public static byte_vector ed25519_add_scalar_public(byte_vector pk, byte_vector scalar) {
    return new byte_vector(libtorrent_jni.ed25519_add_scalar_public(byte_vector.getCPtr(pk), pk, byte_vector.getCPtr(scalar), scalar), true);
  }

  public static byte_vector ed25519_add_scalar_secret(byte_vector sk, byte_vector scalar) {
    return new byte_vector(libtorrent_jni.ed25519_add_scalar_secret(byte_vector.getCPtr(sk), sk, byte_vector.getCPtr(scalar), scalar), true);
  }

  public static byte_vector ed25519_key_exchange(byte_vector pk, byte_vector sk) {
    return new byte_vector(libtorrent_jni.ed25519_key_exchange(byte_vector.getCPtr(pk), pk, byte_vector.getCPtr(sk), sk), true);
  }

  public static boolean default_storage_disk_write_access_log() {
    return libtorrent_jni.default_storage_disk_write_access_log__SWIG_0();
  }

  public static void default_storage_disk_write_access_log(boolean enable) {
    libtorrent_jni.default_storage_disk_write_access_log__SWIG_1(enable);
  }

  public static void add_files(file_storage fs, String file, add_files_listener listener, long flags) {
    libtorrent_jni.add_files(file_storage.getCPtr(fs), fs, file, add_files_listener.getCPtr(listener), listener, flags);
  }

  public static void set_piece_hashes_ex(create_torrent t, String p, set_piece_hashes_listener listener, error_code ec) {
    libtorrent_jni.set_piece_hashes_ex(create_torrent.getCPtr(t), t, p, set_piece_hashes_listener.getCPtr(listener), listener, error_code.getCPtr(ec), ec);
  }

  public static int boost_version() {
    return libtorrent_jni.boost_version();
  }

  public static String boost_lib_version() {
    return libtorrent_jni.boost_lib_version();
  }

  public static int openssl_version_number() {
    return libtorrent_jni.openssl_version_number();
  }

  public static String openssl_version_text() {
    return libtorrent_jni.openssl_version_text();
  }

  public static void set_posix_wrapper(posix_wrapper obj) {
    libtorrent_jni.set_posix_wrapper(posix_wrapper.getCPtr(obj), obj);
  }

  public static boolean is_utp_stream_logging() {
    return libtorrent_jni.is_utp_stream_logging();
  }

  public static void set_utp_stream_logging(boolean enable) {
    libtorrent_jni.set_utp_stream_logging(enable);
  }

}

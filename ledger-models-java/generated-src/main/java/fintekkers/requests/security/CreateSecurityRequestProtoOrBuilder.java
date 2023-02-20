// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fintekkers/requests/security/create_security_request.proto

package fintekkers.requests.security;

public interface CreateSecurityRequestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:fintekkers.requests.security.CreateSecurityRequestProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string object_class = 1;</code>
   * @return The objectClass.
   */
  java.lang.String getObjectClass();
  /**
   * <code>string object_class = 1;</code>
   * @return The bytes for objectClass.
   */
  com.google.protobuf.ByteString
      getObjectClassBytes();

  /**
   * <code>string version = 2;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   *A fully formed security object to be created or updated. Validations may be applied
   *before creating. For example creating an equity security with bond fields may be invalid and
   *therefore rejected.
   * </pre>
   *
   * <code>.fintekkers.models.security.SecurityProto security_input = 20;</code>
   * @return Whether the securityInput field is set.
   */
  boolean hasSecurityInput();
  /**
   * <pre>
   *A fully formed security object to be created or updated. Validations may be applied
   *before creating. For example creating an equity security with bond fields may be invalid and
   *therefore rejected.
   * </pre>
   *
   * <code>.fintekkers.models.security.SecurityProto security_input = 20;</code>
   * @return The securityInput.
   */
  fintekkers.models.security.SecurityProto getSecurityInput();
  /**
   * <pre>
   *A fully formed security object to be created or updated. Validations may be applied
   *before creating. For example creating an equity security with bond fields may be invalid and
   *therefore rejected.
   * </pre>
   *
   * <code>.fintekkers.models.security.SecurityProto security_input = 20;</code>
   */
  fintekkers.models.security.SecurityProtoOrBuilder getSecurityInputOrBuilder();
}
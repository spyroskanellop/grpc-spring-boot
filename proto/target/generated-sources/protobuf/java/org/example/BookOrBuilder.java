// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package org.example;

public interface BookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.example.Book)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 book_id = 1;</code>
   */
  int getBookId();

  /**
   * <code>string title = 2;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 2;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>float price = 3;</code>
   */
  float getPrice();

  /**
   * <code>int32 pages = 4;</code>
   */
  int getPages();

  /**
   * <code>int32 author_id = 5;</code>
   */
  int getAuthorId();
}

/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

public interface ListDataSourcesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of supported data sources and their transfer settings.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
   */
  java.util.List<com.google.cloud.bigquery.datatransfer.v1.DataSource> getDataSourcesList();
  /**
   *
   *
   * <pre>
   * List of supported data sources and their transfer settings.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSource getDataSources(int index);
  /**
   *
   *
   * <pre>
   * List of supported data sources and their transfer settings.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
   */
  int getDataSourcesCount();
  /**
   *
   *
   * <pre>
   * List of supported data sources and their transfer settings.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.DataSourceOrBuilder>
      getDataSourcesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of supported data sources and their transfer settings.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSource data_sources = 1;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSourceOrBuilder getDataSourcesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The next-pagination token. For multiple-page list results,
   * this token can be used as the
   * `ListDataSourcesRequest.page_token`
   * to request the next page of list results.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Output only. The next-pagination token. For multiple-page list results,
   * this token can be used as the
   * `ListDataSourcesRequest.page_token`
   * to request the next page of list results.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}

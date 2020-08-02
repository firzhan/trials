package org.example.trials;

import com.google.gson.annotations.SerializedName;

public class JedisConfig {

    @SerializedName("primary_redis_endpoint")
    private String writerEndpoint = null;

    @SerializedName("primary_redis_endpoint_port")
    private int writerEndpointPort;

    @SerializedName("reader_redis_endpoint")
    private String readerEndpoint;

    @SerializedName("reader_redis_endpoint_port")
    private int readerEndpointPort;

    @SerializedName("connection_timeout_ms")
    private int connectionTimeoutMillis;

    @SerializedName("allowed_max_conn_count")
    private int maxConnection;

    @SerializedName("idle_max_conn_count")
    private int idleMaxConnection;

    @SerializedName("idle_min_conn_count")
    private int idleMinConnection;

    @SerializedName("test_on_borrow")
    private boolean testOnBorrow;

    @SerializedName("test_on_return")
    private boolean testOnReturn;

    @SerializedName("test_while_idle")
    private boolean testWhileIdle;

    @SerializedName("eviction_test_run_count")
    private int evictionTestRunCount;

    @SerializedName("eviction_run_interval_ms")
    private int evictionRunIntervalMillis;

    @SerializedName("password")
    private String password;

    @SerializedName("ssl")
    private boolean isSSLEnabled;


    public String getWriterEndpoint() {
        return writerEndpoint;
    }

    public void setWriterEndpoint(String writerEndpoint) {
        this.writerEndpoint = writerEndpoint;
    }

    public int getWriterEndpointPort() {
        return writerEndpointPort;
    }

    public void setWriterEndpointPort(int writerEndpointPort) {
        this.writerEndpointPort = writerEndpointPort;
    }

    public String getReaderEndpoint() {
        return readerEndpoint;
    }

    public void setReaderEndpoint(String readerEndpoint) {
        this.readerEndpoint = readerEndpoint;
    }

    public int getReaderEndpointPort() {
        return readerEndpointPort;
    }

    public void setReaderEndpointPort(int readerEndpointPort) {
        this.readerEndpointPort = readerEndpointPort;
    }

    public int getConnectionTimeoutMillis() {
        return connectionTimeoutMillis;
    }

    public void setConnectionTimeoutMillis(int connectionTimeoutMillis) {
        this.connectionTimeoutMillis = connectionTimeoutMillis;
    }

    public int getMaxConnection() {
        return maxConnection;
    }

    public void setMaxConnection(int maxConnection) {
        this.maxConnection = maxConnection;
    }

    public int getIdleMaxConnection() {
        return idleMaxConnection;
    }

    public void setIdleMaxConnection(int idleMaxConnection) {
        this.idleMaxConnection = idleMaxConnection;
    }

    public int getIdleMinConnection() {
        return idleMinConnection;
    }

    public void setIdleMinConnection(int idleMinConnection) {
        this.idleMinConnection = idleMinConnection;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public boolean isTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    public boolean isTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    public int getEvictionTestRunCount() {
        return evictionTestRunCount;
    }

    public void setEvictionTestRunCount(int evictionTestRunCount) {
        this.evictionTestRunCount = evictionTestRunCount;
    }

    public int getEvictionRunIntervalMillis() {
        return evictionRunIntervalMillis;
    }

    public void setEvictionRunIntervalMillis(int evictionRunIntervalMillis) {
        this.evictionRunIntervalMillis = evictionRunIntervalMillis;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSSLEnabled() {
        return isSSLEnabled;
    }

    public void setSSLEnabled(boolean SSLEnabled) {
        isSSLEnabled = SSLEnabled;
    }
}

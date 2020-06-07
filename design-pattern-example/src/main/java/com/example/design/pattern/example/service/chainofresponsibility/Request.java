package com.example.design.pattern.example.service.chainofresponsibility;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/1
 * @Description:
 */
public class Request {
    private boolean isLoginOk;
    private boolean isFrequentOK;
    private boolean isPermits;
    private boolean containsSensitiveWords;
    private String requestBody;

    public Request(boolean isLoginOk, boolean isFrequentOK, boolean isPermits, boolean containsSensitiveWords) {
        this.isLoginOk = isLoginOk;
        this.isFrequentOK = isFrequentOK;
        this.isPermits = isPermits;
        this.containsSensitiveWords = containsSensitiveWords;
    }

    static class RequestBuilder {
        private boolean isLoginOk;
        private boolean isFrequentOK;
        private boolean isPermits;
        private boolean containsSensitiveWords;

        RequestBuilder isLoginOk(boolean isLoginOk) {
            this.isLoginOk = isLoginOk;
            return this;
        }

        RequestBuilder isFrequentOK(boolean isFrequentOK) {
            this.isFrequentOK = isFrequentOK;
            return this;
        }

        RequestBuilder isPermits(boolean isPermits) {
            this.isPermits = isPermits;
            return this;
        }

        RequestBuilder containsSensitiveWords(boolean containsSensitiveWords) {
            this.containsSensitiveWords = containsSensitiveWords;
            return this;
        }

        public Request build() {
            Request request = new Request(isLoginOk, isFrequentOK, isPermits, containsSensitiveWords);
            return request;
        }
    }

    public boolean isLoginOk() {
        return isLoginOk;
    }

    public boolean isFrequentOK() {
        return isFrequentOK;
    }

    public boolean isPermits() {
        return isPermits;
    }

    public boolean containsSensitiveWords() {
        return containsSensitiveWords;
    }
}

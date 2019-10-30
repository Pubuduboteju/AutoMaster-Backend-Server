package com.ragul.car.payload;

import com.ragul.car.util.Status;

public class ApiResponse<T> {

    private String statusCode;
    private String statusDescription;
    private T content;

    public ApiResponse() {
        this.statusCode = Status.ERROR.getStatusCode();
        this.statusDescription = Status.ERROR.getStatusDescription();
    }

    public ApiResponse(Status status, String statusDescription, T content) {
        this.statusCode = status.getStatusCode();
        this.statusDescription = statusDescription;
        this.content = content;

    }


    public ApiResponse(String statusCode, String statusDescription) {
        this.statusCode = statusCode;
        this.statusDescription = statusDescription;
    }

    public ApiResponse(Status DIAStatus) {
        this.statusCode = DIAStatus.getStatusCode();
        this.statusDescription = DIAStatus.getStatusDescription();
    }

    public ApiResponse(Status status, String statusDescription) {
        this.statusCode = status.getStatusCode();
        this.statusDescription = statusDescription;
    }

    public ApiResponse(T save) {
        this.statusCode = Status.SUCCESS.getStatusCode();
        this.statusDescription = Status.SUCCESS.getStatusDescription();
        this.content = save;
    }

    public void setStatus(Status status) {
        this.statusCode = status.getStatusCode();
        this.statusDescription = status.getStatusDescription();
    }

    public void setContentWithSuccess(T content) {
        this.statusCode = Status.SUCCESS.getStatusCode();
        this.statusDescription = Status.SUCCESS.getStatusDescription();
        this.content = content;
    }


    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public boolean hasContent() {
        return content != null;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

}


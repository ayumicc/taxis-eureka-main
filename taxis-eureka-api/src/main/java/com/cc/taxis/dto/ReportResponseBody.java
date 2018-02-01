package com.cc.taxis.dto;

public class ReportResponseBody {

    private Integer resultCode;

    private String resultMessage;

    private Object data;

    public ReportResponseBody() {
    }

    public ReportResponseBody(Integer resultCode, Object data) {
        this.resultCode = resultCode;
        this.data = data;
    }


    public ReportResponseBody(Integer resultCode, String resultMessage) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }

    public ReportResponseBody(Integer resultCode, String resultMessage, Object data) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.data = data;
    }


    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public static ReportResponseBody succeeResult(Object data) {
        return new ReportResponseBody(0, data);
    }

    public static ReportResponseBody succeeResult() {
        return new ReportResponseBody(0, null);
    }

    public static ReportResponseBody failedResult(Integer resultCode, String resultMessage) {
        return new ReportResponseBody(resultCode, resultMessage);
    }

}

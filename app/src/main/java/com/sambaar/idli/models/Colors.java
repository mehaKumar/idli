package com.sambaar.idli.models;

/**
 * Created by Meha on 11/4/2017.
 */

public enum Colors {
    RED("#FF0000", "#CD0000", "#F20000"),
    BLUE("#0000FF", "#0000CD", "#0000F2");


    private String normalCode;
    private String urgentCode;
    private String doneCode;

    Colors(String normalCode, String urgentCode, String doneCode) {
        this.normalCode = normalCode;
        this.urgentCode = urgentCode;
        this.doneCode = doneCode;
    }

    public String getNormalCode() {
        return normalCode;
    }

    public String getUrgentCode() {
        return urgentCode;
    }

    public String getDoneCode() {
        return doneCode;
    }
}

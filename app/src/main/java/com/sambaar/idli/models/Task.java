package com.sambaar.idli.models;
import java.util.Date;

/**
 * Created by Meha on 11/4/2017.
 */

public class Task {
    private String title;
    private Date startDate;
    private Date endDate;
    private boolean isUrgent;
    private String note;
    private Colors color;

    public Task(String title, Date startDate, Date endDate, boolean isUrgent, String note, Colors color) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isUrgent = isUrgent;
        this.note = note;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }


}

package mx.edu.utdev.models;

import java.sql.Timestamp;

public class Logs {

    // VARIABLES GLOBALES
    private int id;
    private Timestamp eventDateTime;
    private String eventLevel;
    private String userName;
    private String machineName;
    private String eventMessage;
    private String errorSource;
    private String errorClass;
    private String errorMethod;
    private String errorMessage;
    private String innerErrorMessage;

    // CONSTRUCTORES
    public Logs(){}

    public Logs(int id, Timestamp eventDateTime, String eventLevel, String userName, String machineName, String eventMessage, String errorSource, String errorClass, String errorMethod, String errorMessage, String innerErrorMessage) {
        this.id = id;
        this.eventDateTime = eventDateTime;
        this.eventLevel = eventLevel;
        this.userName = userName;
        this.machineName = machineName;
        this.eventMessage = eventMessage;
        this.errorSource = errorSource;
        this.errorClass = errorClass;
        this.errorMethod = errorMethod;
        this.errorMessage = errorMessage;
        this.innerErrorMessage = innerErrorMessage;
    }

    // SETTERS & GETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(Timestamp eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public String getEventLevel() {
        return eventLevel;
    }

    public void setEventLevel(String eventLevel) {
        this.eventLevel = eventLevel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getEventMessage() {
        return eventMessage;
    }

    public void setEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
    }

    public String getErrorSource() {
        return errorSource;
    }

    public void setErrorSource(String errorSource) {
        this.errorSource = errorSource;
    }

    public String getErrorClass() {
        return errorClass;
    }

    public void setErrorClass(String errorClass) {
        this.errorClass = errorClass;
    }

    public String getErrorMethod() {
        return errorMethod;
    }

    public void setErrorMethod(String errorMethod) {
        this.errorMethod = errorMethod;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getInnerErrorMessage() {
        return innerErrorMessage;
    }

    public void setInnerErrorMessage(String innerErrorMessage) {
        this.innerErrorMessage = innerErrorMessage;
    }
}

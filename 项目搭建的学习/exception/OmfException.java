package edu.thss.platform.exception;


import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class OmfException extends PlatformException {

    public static final String NOT_NULLABLE = "该值不能为空";

    Map<String, String> errors = new HashMap<String, String>();

    String className;

    String oid;



    protected OmfException() {
        super(Code.Ejb, null);

    }

    public OmfException(String className, String oid) {
        this();
        this.className = className;
        this.oid = oid;
    }

    public void setNotNullableError(String field) {
        errors.put(field, NOT_NULLABLE);
    }

    public void setFieldError(String field, String message) {
        errors.put(field, message);
    }

    public Map<String, String> getFieldErrors() {
        return errors;
    }

    public boolean hasError() {
        return !errors.isEmpty() || message != null;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }



}

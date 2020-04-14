package com.spring.common.util;

public class ErrorCode {
    public static final Integer OK = 200;
    public static final Integer FAILED = 500;
    public static final Integer BUSSINESS_FAILED = 550;
    public static final Integer FORBIDDEN_FAILED = 403; //无业务权限
    public static final Integer UNAUTHENTICATION = 401; //未登录
    public static final Integer NOTFOUND = 404;
    public static final Integer BADREQUEST = 400;
}

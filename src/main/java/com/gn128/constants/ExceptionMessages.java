package com.gn128.constants;

import lombok.experimental.UtilityClass;

/**
 * Author - rohit
 * Project - java-backend
 * Package - com.gn128.constants
 * Created_on - November 10 - 2024
 * Created_at - 20:52
 */

@UtilityClass
public class ExceptionMessages {

    public static final String USER_NOT_FOUND_ID = "User not found for given Id";
    public static final String USER_ALREADY_ENABLED = "User email is already verified";
    public static final String PROVIDER_NOT_EMAIL = "User registered with SSO";
    public static final String OTP_RESENT_LIMIT_EXCEED = "OTP Resend limit exceeded. Please contact support team";
    public static final String USER_ALREADY_LOGGED_OUT = "USer is already logged out";
    public static final String LOGIN_AGAIN = "Login again";
    public static final String EXPIRED_JWT_TOKEN = "Token Expired";
    public static final String BAD_JWT_TOKEN = "Malformed Token";
}

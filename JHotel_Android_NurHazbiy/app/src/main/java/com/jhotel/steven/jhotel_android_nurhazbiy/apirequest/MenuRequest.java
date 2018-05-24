package com.jhotel.steven.jhotel_android_nurhazbiy.apirequest;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

/**
 *  This class is used for creating Vacant Rooms List API POST request
 *
 *  @author Nur Hazbiy Shaffan
 *  @version 1.0.0
 *  @since May 24 2018
 */
public class MenuRequest extends StringRequest {
    private static final String Regis_URL = "http://10.0.2.2:8080/vacantrooms";

    /**
     * Constructor of LoginRequest Class
     *
     * @param listener response success listener
     * @param requestErrorListener response error listener
     */
    public MenuRequest(Response.Listener<String> listener, RequestErrorListener requestErrorListener) {
        super(Method.GET, Regis_URL, listener,requestErrorListener );
    }
}


package com.bbt.usbportnoy.service;

import com.bbt.usbportnoy.web.endpoint.models.Call;

/**
 * Created by jason on 1/3/17.
 */
public interface CallService {
    Call call(String source, String destination);
    Call get(Long id);
    Call update(Call call);
}

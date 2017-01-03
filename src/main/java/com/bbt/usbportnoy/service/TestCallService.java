package com.bbt.usbportnoy.service;

import com.bbt.usbportnoy.web.endpoint.models.Call;
import com.bbt.usbportnoy.web.endpoint.models.Recording;
import org.springframework.stereotype.Component;

/**
 * Created by jason on 1/3/17.
 */
@Component
public class TestCallService implements CallService {
    @Override
    public Call call(String source, String destination) {
        Call call = new Call();
        call.setStatus("Connected");
        call.setSource(source);
        call.setDestination(destination);
        call.setId((long) 42);
        call.setRecording(null);
        return call;
    }

    @Override
    public Call get(Long id) {
        Call call = new Call();
        call.setId(id);
        call.setStatus("Complete");
        call.setSource("+11234567890");
        call.setDestination("+11234567890");
        call.setRecording(new Recording("http://www.stephaniequinn.com/Music/Commercial%20DEMO%20-%2001.mp3", (long) (60 * 2.51)));
        return call;
    }

    @Override
    public Call update(Call call) {
        return call;
    }
}

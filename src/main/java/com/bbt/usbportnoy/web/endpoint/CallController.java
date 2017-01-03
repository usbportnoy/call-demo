package com.bbt.usbportnoy.web.endpoint;

import com.bbt.usbportnoy.service.CallService;
import com.bbt.usbportnoy.web.endpoint.models.Call;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.condition.ConsumesRequestCondition;

/**
 * Created by jason on 1/3/17.
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CallController {
    @Autowired
    CallService callService;

    @RequestMapping(value = "/call/{id}", method = RequestMethod.GET)
    public Call get(@PathVariable Long id){
        return callService.get(id);
    }

    @RequestMapping(value = "/call", method = RequestMethod.POST, consumes = "application/json")
    public Call post(@RequestBody Call call){
        return callService.call(call.getSource(), call.getDestination());
    }
}

package com.co.alianza.controller;

import com.co.alianza.dto.ClienteDTO;
import com.co.alianza.dto.PayLoad;
import com.co.alianza.env.EndPoint;
import com.co.alianza.model.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = EndPoint.V_API)
public class ClienteController {

    @Autowired
    private IClienteService service;


    @GetMapping(EndPoint.CLIENT_ALL)
    public PayLoad findAll()
    {
        return service.findAll();
    }

    @PostMapping(EndPoint.CLIENT_DElELETE)
    public PayLoad userDell (@PathVariable("id") String id)
    {
        return service.deleteById(id);

    }
    @PostMapping(EndPoint.CLIENT_FINDBYID)
    public PayLoad findById (@PathVariable("id") String id)
    {
        return service.findById(id);

    }

    @PostMapping(EndPoint.CLIENT_UPDATE)
    public PayLoad update (@RequestBody ClienteDTO dto)
    {
        return service.update(dto);

    }

    @PostMapping(EndPoint.CLIENT_SAVE)
    public PayLoad save (@RequestBody ClienteDTO dto)
    {
        return service.save(dto);

    }

}

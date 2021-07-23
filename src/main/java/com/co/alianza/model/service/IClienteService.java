package com.co.alianza.model.service;

import com.co.alianza.dto.ClienteDTO;
import com.co.alianza.dto.PayLoad;

public interface IClienteService {

    PayLoad save(ClienteDTO dto);
    PayLoad update(ClienteDTO dto);
    PayLoad findAll();
    PayLoad findById(String sharedkey);
    PayLoad deleteById(String sharedkey);
}

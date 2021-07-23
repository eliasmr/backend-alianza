package com.co.alianza.model.service.impl;

import com.co.alianza.dto.ClienteDTO;
import com.co.alianza.dto.PayLoad;
import com.co.alianza.model.helpers.ClienteHelpers;
import com.co.alianza.model.repository.ClienteRepository;
import com.co.alianza.model.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

@Service
public class ClienteImpl implements IClienteService {

    Logger logger = Logger.getLogger("ClienteImpl");
    @Autowired
    @Qualifier("clienteRepository")
    private ClienteRepository repository;

    AtomicReference<PayLoad> response= new AtomicReference<>();
    @Override
    public PayLoad save(ClienteDTO dto) {
        logger.info("Guarda del Cliente::ClienteImpl::save::26 -> "+ dto.toString());
        try {
            repository.save(ClienteHelpers.clientToDto(dto));
            response.set(new PayLoad(HttpStatus.OK, "OK", repository.findAll(), "Guardo con exito"));
        }catch (Exception ex){
            response.set(new PayLoad(HttpStatus.CONFLICT, "Error", ex.getMessage(), "Error al Consultar los Clientes"));
        }

        return response.get();
    }

    @Override
    public PayLoad update(ClienteDTO dto) {
        logger.info("update del Cliente::ClienteImpl::update::39 -> "+dto.toString());
        try {
            repository.save(ClienteHelpers.clientToDto(dto));
            response.set(new PayLoad(HttpStatus.OK, "OK", repository.findAll(), "Se actualiza Cliente con exito"));
        }catch (Exception ex){
            response.set(new PayLoad(HttpStatus.CONFLICT, "Error", ex.getMessage(), "Error al Consultar los Clientes"));
        }

        return response.get();
    }

    @Override
    public PayLoad findAll() {
        logger.info("findAll del Cliente::ClienteImpl::findAll::52");
        try {
            response.set(new PayLoad(HttpStatus.OK, "OK", repository.findAll(), "success"));
        }catch (Exception ex){
            response.set(new PayLoad(HttpStatus.CONFLICT, "Error", ex.getMessage(), "Error al Consultar los Clientes"));
        }

        return response.get();
    }

    @Override
    public PayLoad findById(String sharedkey) {
        logger.info("findById del Cliente::ClienteImpl::findById::64 -> "+ sharedkey);
        try {
            response.set(new PayLoad(HttpStatus.OK, "OK", repository.findById(sharedkey), "success"));
        }catch (Exception ex){
            response.set(new PayLoad(HttpStatus.CONFLICT, "Error", ex.getMessage(), "Error al Consultar los Clientes"));
        }

        return response.get();
    }

    @Override
    public PayLoad deleteById(String sharedkey) {
        logger.info("deleteById del Cliente::ClienteImpl::deleteById::75 -> "+sharedkey);
        try {
            repository.deleteById(sharedkey);
            response.set(new PayLoad(HttpStatus.OK, "OK", repository.findAll(), "success"));
        }catch (Exception ex){
            response.set(new PayLoad(HttpStatus.CONFLICT, "Error", ex.getMessage(), "Error al Consultar los Clientes"));
        }

        return response.get();
    }
}

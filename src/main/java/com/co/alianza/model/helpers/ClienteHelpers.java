package com.co.alianza.model.helpers;

import com.co.alianza.dto.ClienteDTO;
import com.co.alianza.model.entity.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteHelpers {

 public static Cliente clientToDto(ClienteDTO dto){
     return Cliente.builder()
             .sharedkey(dto.getSharedkey())
             .businessID(dto.getBusinessID())
             .email(dto.getEmail())
             .phone(dto.getPhone())
             .dataAdd(dto.getDataAdd())
             .build();
 }

 public static  ClienteDTO dtoToEntity(Cliente cliente){
     return  ClienteDTO.builder()
             .sharedkey(cliente.getSharedkey())
             .businessID(cliente.getBusinessID())
             .email(cliente.getEmail())
             .phone(cliente.getPhone())
             .dataAdd(cliente.getDataAdd())
             .build();
 }
 public static List<ClienteDTO> listDtoToClient(List<Cliente> clientes){
    List<ClienteDTO> list = new ArrayList<>();
    clientes.forEach(client -> {
        list.add(dtoToEntity(client));
    });
    return list;
 }
}

package com.co.alianza.dto;

import lombok.*;

import java.util.Date;

@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@Builder
public class ClienteDTO {

    private String sharedkey;
    private String businessID;
    private String email;
    private String phone;
    private Date dataAdd;
}

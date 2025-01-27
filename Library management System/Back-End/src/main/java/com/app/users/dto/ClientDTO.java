package com.app.users.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {
        private String cin;
        private String name;
        private String fname;


    public String getName() {
        return null;
    }

    public String getFname() {
        return null;
    }
}

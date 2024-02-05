package com.prottoy.springDataJpa.userDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String username;
    private Long id;
    private String email;


}

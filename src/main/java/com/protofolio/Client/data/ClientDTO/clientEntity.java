package com.protofolio.Client.data.ClientDTO;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@Entity
@Table(name = "client_detail")
public class clientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "Name will not be empty or blank..")
    @Column(name = "name")
    private String name;

    @Email(message = "Enter valid email..")
    @NotBlank(message = "Email not be blank..")
    @Column(name = "email")
    private String email;

    @Min(value = 10,message = "Minimum 10 words")
    @NotBlank(message = "Message will not be blank..")
    @Column(name = "message")
    private String message;

    @Column(name = "mob_no")
    @Size(min = 10,max = 12)
    private Long mob;
}

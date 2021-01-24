package com.example.ECJ.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "sender")
public class Sender {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long senderId;
    private String senderShortName;
    private String senderFullName;
    private String senderAddress;
    private String senderCode;
    private int senderActive;
}

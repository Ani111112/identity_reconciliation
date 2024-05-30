package com.identityreconciliation.Identity.Reconciliation.model;

import com.identityreconciliation.Identity.Reconciliation.Enum.ContactType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phoneNumber;
    private String email;
    private Long linkedId;
    @Enumerated(EnumType.STRING)
    private ContactType linkPrecedence;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
}

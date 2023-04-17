package com.example.claims_crud.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "CLAIM")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class ClaimEntity {

    @Id
    @NotNull
    @Column(name = "ID")
    private int id;

    @NotNull
    @Column(name = "CLAIM_NUMBER")
    private String claimNumber;

    @NotNull
    @Column(name = "CLAIM_STATUS")
    private String claimStatus;

    @Column(name = "CREATED_TS")
//    @CreationTimestamp
    private String createdTS;

    @NotNull
    @Column(name = "CREATED_BY_ID")
    private String createdId;

    @NotNull
    @Column(name = "SOFT_DELETED")
    private String softDeleted;
}

package com.orkva.grassland.shepherd.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.orkva.grassland.shepherd.domain.AbstractDomain;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractEntity extends AbstractDomain implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreatedDate
    private Long created;
    @CreatedBy
    private String createdBy;
    @LastModifiedDate
    private Long updated;
    @LastModifiedBy
    private String updatedBy;

    @Override
    @JsonIgnore
    public boolean isNew() {
        return id == null;
    }
}

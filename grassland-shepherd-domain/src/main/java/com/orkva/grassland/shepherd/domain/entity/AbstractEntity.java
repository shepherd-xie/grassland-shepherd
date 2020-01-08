package com.orkva.grassland.shepherd.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.orkva.grassland.shepherd.domain.AbstractDomain;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.Instant;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractEntity extends AbstractDomain implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @CreatedDate
    protected Long created;
    @CreatedBy
    protected String createdBy;
    @LastModifiedDate
    protected Long updated;
    @LastModifiedBy
    protected String updatedBy;

    @Override
    @JsonIgnore
    public boolean isNew() {
        return id == null;
    }
}

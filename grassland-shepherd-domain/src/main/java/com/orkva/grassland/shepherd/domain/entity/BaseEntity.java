package com.orkva.grassland.shepherd.domain.entity;

import com.orkva.grassland.shepherd.domain.BaseDomain;
import org.springframework.data.domain.Persistable;

import java.io.Serializable;

public interface BaseEntity extends BaseDomain, Serializable, Persistable<Long> {

}

package com.orkva.grassland.shepherd.domain.entity.sys;

import com.orkva.grassland.shepherd.domain.entity.AbstractEntity;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Builder
@Entity
@Table(name = "tb_sys_menu")
public class Menu extends AbstractEntity {
    @Column
    private String title;
    @Column
    private String link;
    @Column
    private Long parentId;
    @OneToMany(mappedBy = "parentId")
    private List<Menu> subMenu;
}

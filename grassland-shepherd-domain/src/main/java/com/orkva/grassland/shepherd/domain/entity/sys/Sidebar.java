package com.orkva.grassland.shepherd.domain.entity.sys;

import com.orkva.grassland.shepherd.domain.entity.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "tb_sys_menu")
public class Sidebar extends AbstractEntity {
    @Column
    private String title;
    @Column
    private String link;
    @Column
    private Long parentId;
    @Column
    private String icon;
    @Column
    private Boolean active;
    @OneToMany(mappedBy = "parentId")
    private List<Sidebar> subSidebar;
}

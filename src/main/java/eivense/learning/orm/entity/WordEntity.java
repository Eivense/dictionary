package eivense.learning.orm.entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;

/**
 * Word实体
 *
 * @author mouyy
 * @date 2022/9/24 
 */
@Entity
@Cacheable
public class WordEntity extends PanacheEntity {


}

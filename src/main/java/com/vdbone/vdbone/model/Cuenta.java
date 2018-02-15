package com.vdbone.vdbone.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta")
@Access(AccessType.FIELD)
public class Cuenta extends ParentEntity {

}

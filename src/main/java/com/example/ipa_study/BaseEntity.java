package com.example.ipa_study;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class BaseEntity {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
@Column @Temporal(TemporalType.TIMESTAMP) Date createdAt;
}
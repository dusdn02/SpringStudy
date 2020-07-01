package com.example.ipa_study;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import org.apache.tomcat.jni.Address;


@Entity
public class MyEntity2 extends BaseEntity {
@Column Integer MyOwnColumn;
@Embedded Address address;
}


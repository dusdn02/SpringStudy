package com.example.ipa_study;

import java.util.Date;

import javax.persistence.*;


@Entity
public class MyEntity {
	enum MyEnum {
		HELLO, WORLD
	}

	enum MyAnotherEnum {
		VALUE1, VALUE2
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true, nullable = false)
	private String uniqueStringColumn;
	
	@Column(name = "my_int_column")
	private Integer intColumn;
	@Column
	private Double doubleColumn;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateColumn;
	@Enumerated(EnumType.STRING)
	private MyEnum enum1;
	
	@Enumerated(EnumType.ORDINAL)
	private MyAnotherEnum enum2;
	@Lob
	private String lobString;
	@Lob
	private byte[] lobBytes;
	@Transient
	private String transientValue;
	
}
package com.ex.entity;
import javax.persistence.*;

@Entity
@SequenceGenerator(name = "MEMBER_ID_SEQ_GEN", sequenceName = "MEMBER_ID_SEQ")
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_ID_SEQ_GEN")
  private Long id;

  private String name;

  private String email;

  private String password;
}
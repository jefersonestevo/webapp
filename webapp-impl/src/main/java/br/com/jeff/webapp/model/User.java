package br.com.jeff.webapp.model;

import javax.persistence.*;

@Entity
public class User implements ModelBean<Long> {

    @Id
    @GeneratedValue(generator = "SEQ_USER", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SEQ_USER", initialValue = 1000, sequenceName = "SEQ_USER")
    private Long id;

    private String fullName;
    private String nickname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}

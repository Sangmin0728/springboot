package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
//import java.sql.Date;


@Data
@AllArgsConstructor
//@JsonIgnoreProperties(value={"password","ssn"})
@NoArgsConstructor
//@JsonFilter("UserInfo")
@ApiModel(description = "사용자 상세 정보를 위한 객체")
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Size(min=2, message = "Name은 두글자 이상 입력해주세요.")
    @ApiModelProperty(notes = "사용자 이름을 입력해주세요.")
    private String name;

    @Past
    //@JsonFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(notes = "사용자의 등록일 설정해주세요.")
    private Date joinDate;

    @ApiModelProperty(notes = "사용자의 패스워드를 설정해주세요.")
    private String password;
    @ApiModelProperty(notes = "사용자의 주민등록번호를 설정해주세요.")
    private String ssn; // 주민번호

//    @OneToMany(mappedBy = "user")
//    private List<Post> posts;
//
//    public User(Integer id, String name, Date joinDate, String password, String ssn) {
//        this.id = id;
//        this.name = name;
//        this.joinDate = joinDate;
//        this.password = password;
//        this.ssn = ssn;
//    }
}

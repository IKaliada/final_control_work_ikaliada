package com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.model;

import com.sun.istack.internal.NotNull;

import javax.validation.constraints.Pattern;

public class BusinessCardDTO {
    private Long id;
    @NotNull
    private String title;
    private String fullname;
    @Pattern(regexp = "\"^((\\\\+3|7|5)+([0-9]){10})$\"", message = "{telephone.not.correct}")
    private String workingTelephone;
    private UserDTO userDTO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getWorkingTelephone() {
        return workingTelephone;
    }

    public void setWorkingTelephone(String workingTelephone) {
        this.workingTelephone = workingTelephone;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}

package com.example.academy.springboot.domain.posts;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {

    @CreatedDate    //  Entity 가 생성될때 시간 자동저장
    private LocalDateTime createdDate;

    @LastModifiedDate   //  Entity 의 내용이 변경될 때 시간 자동저장
    private LocalDateTime modifiedDate;

}

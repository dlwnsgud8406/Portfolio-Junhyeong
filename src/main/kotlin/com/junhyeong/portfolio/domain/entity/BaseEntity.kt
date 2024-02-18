package com.junhyeong.portfolio.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@MappedSuperclass // 이 어노테이션을 사용해야 상속 받을 수 있음.
abstract class BaseEntity {
    @CreatedDate
    @Column(nullable = false, updatable = false) // null이 있을 수 없고, update 할 수 없음
    var createdDateTime: LocalDateTime = LocalDateTime.now()

    @LastModifiedDate
    @Column(nullable = false, updatable = true) // data 수정이 있을 때마다 update time이 바껴야하므로 true
    var updatedDateTime: LocalDateTime = LocalDateTime.now()
}

package com.junhyeong.portfolio.domain.repository

import com.junhyeong.portfolio.domain.entity.Achievement
import com.junhyeong.portfolio.domain.entity.Experience
import com.junhyeong.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface HttpInterfaceRepository: JpaRepository<HttpInterface, Long> {

    fun countAllByCreatedDateTimeBetween(start: LocalDateTime, end: LocalDateTime): Long
}

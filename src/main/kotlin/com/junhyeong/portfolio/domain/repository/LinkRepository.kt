package com.junhyeong.portfolio.domain.repository

import com.junhyeong.portfolio.domain.entity.Achievement
import com.junhyeong.portfolio.domain.entity.Experience
import com.junhyeong.portfolio.domain.entity.Introduction
import com.junhyeong.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository: JpaRepository<Link, Long> {
    // select * from link where is_active = :isActive
    fun findAllByIsActive(isActive: Boolean) : List<Link>

}

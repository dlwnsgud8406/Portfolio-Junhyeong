package com.junhyeong.portfolio.domain.repository

import com.junhyeong.portfolio.domain.entity.Achievement
import com.junhyeong.portfolio.domain.entity.Experience
import com.junhyeong.portfolio.domain.entity.Introduction
import com.junhyeong.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ProjectRepository: JpaRepository<Project, Long> {
    // select * from project where is_active = :isActive
    fun findAllByIsActive(isActive: Boolean) : List<Project>

    // 그대로 쓰면 성능이 안좋아서 override를 통한 customize
    override fun findById(id: Long): Optional<Project>



}

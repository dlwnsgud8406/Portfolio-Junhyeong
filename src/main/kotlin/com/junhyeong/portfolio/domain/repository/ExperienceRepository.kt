package com.junhyeong.portfolio.domain.repository

import com.junhyeong.portfolio.domain.entity.Achievement
import com.junhyeong.portfolio.domain.entity.Experience
import com.junhyeong.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.Optional

interface ExperienceRepository: JpaRepository<Experience, Long> {

    // select * from Experience where is_active = :isActive
    @Query("select e from Experience e left join fetch e.details where e.isActive = :isActive")
    fun findAllByIsActive(isActive: Boolean) : List<Experience>

    @Query("select e from Experience  e left join fetch e.details where e.id = :id")
    override fun findById(id: Long) :Optional<Experience>
}

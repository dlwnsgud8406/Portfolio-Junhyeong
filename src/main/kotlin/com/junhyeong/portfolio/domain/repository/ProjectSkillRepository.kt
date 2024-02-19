package com.junhyeong.portfolio.domain.repository

import com.junhyeong.portfolio.domain.entity.Achievement
import com.junhyeong.portfolio.domain.entity.Experience
import com.junhyeong.portfolio.domain.entity.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ProjectSkillRepository: JpaRepository<ProjectSkill, Long> {

    // select * from project_skill where project_id = :projectId and skill_id = = :skillId
    fun findByProjectIdAndSkillId(projectId: Long, skillId: Long): Optional<ProjectSkill>

}
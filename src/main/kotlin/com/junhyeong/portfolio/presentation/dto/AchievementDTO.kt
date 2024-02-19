package com.junhyeong.portfolio.presentation.dto

// kotlin 은 data class가 DTO로 하기 정말 유용하다. toString으로 하면 key-value로 매핑이되어 override할필여 x
data class AchievementDTO(
    val title: String,
    val description: String,
    val host: String,
    val achievedDate: String?
)


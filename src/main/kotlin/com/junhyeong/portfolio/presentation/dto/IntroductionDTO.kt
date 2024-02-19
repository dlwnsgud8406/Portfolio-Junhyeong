package com.junhyeong.portfolio.presentation.dto

import com.junhyeong.portfolio.domain.entity.Introduction

data class IntroductionDTO(
    val content: String,
){
    constructor(introduction: Introduction) : this(
        content = introduction.content
    )
}

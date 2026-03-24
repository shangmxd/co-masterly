package com.example.comasterly.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface AppKey: NavKey

@Serializable
data object CreateSkillBtnScreen: AppKey

@Serializable
data object SkillInfoScreen: AppKey

@Serializable
data object AddDailySkillHourScreen: AppKey
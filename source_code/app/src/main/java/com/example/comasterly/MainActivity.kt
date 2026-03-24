package com.example.comasterly

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.comasterly.navigation.AddDailySkillHourScreen
import com.example.comasterly.navigation.CreateSkillBtnScreen
import com.example.comasterly.navigation.SkillInfoScreen
import com.example.comasterly.ui.screens.AddDailyHourScreen
import com.example.comasterly.ui.screens.AddSkillInfoScreen
import com.example.comasterly.ui.screens.CreateSkillButton
import com.example.comasterly.ui.theme.ComasterlyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComasterlyTheme {
                val backStack = rememberNavBackStack(CreateSkillBtnScreen)
                NavDisplay(
                    backStack = backStack,
                    onBack = {backStack.removeLastOrNull()},
                    entryProvider = entryProvider {
                        entry<CreateSkillBtnScreen> {
                            CreateSkillButton {
                                backStack.add(SkillInfoScreen)
                            }
                        }
                        entry<SkillInfoScreen> {
                            AddSkillInfoScreen {
                                backStack.add(AddDailySkillHourScreen)
                            }
                        }
                        entry<AddDailySkillHourScreen> {
                            AddDailyHourScreen()
                        }
                    }
                )
            }
        }
    }
}
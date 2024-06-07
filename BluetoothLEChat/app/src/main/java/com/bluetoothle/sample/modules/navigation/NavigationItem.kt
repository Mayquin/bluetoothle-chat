package com.bluetoothle.sample.modules.navigation

sealed class NavigationItem(val route: String){
    object Home: NavigationItem(Screen.HOME.name)
}

enum class Screen {
    HOME
}


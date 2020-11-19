package com.cookpad.astemplates.recipes.screen

fun viewEvent(packageName: String, screenName: String) : String {
    return """
        package ${packageName}.${screenName.toLowerCase()}.data

        sealed class ${screenName}ViewEvent {
        }
    """.trimIndent()
}
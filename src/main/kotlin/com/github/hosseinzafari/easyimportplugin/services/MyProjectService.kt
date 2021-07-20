package com.github.hosseinzafari.easyimportplugin.services

import com.github.hosseinzafari.easyimportplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

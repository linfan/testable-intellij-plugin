package com.github.linfan.testableintellijplugin.services

import com.github.linfan.testableintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

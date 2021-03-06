application {
    title = '${project_name}'
    startupGroups = ['${project_property_name}']
    autoShutdown = true
}
mvcGroups {
    // MVC Group for "${project_property_name}"
    '${project_property_name}' {
        model      = '${project_package}.${project_capitalized_name}Model'
        view       = '${project_package}.${project_capitalized_name}View'
        controller = '${project_package}.${project_capitalized_name}Controller'
    }
}
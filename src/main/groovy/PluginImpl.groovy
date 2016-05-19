package PackageName

import org.gradle.api.Plugin
import org.gradle.api.Project
import com.android.build.gradle.AppPlugin

public class PluginImpl implements Plugin<Project> {
    void apply(Project project) {
        project.task('testTask') << {
            println "Hello gradle plugin"
        }
    }
}

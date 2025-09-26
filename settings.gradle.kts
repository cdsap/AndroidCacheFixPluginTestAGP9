pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("com.gradle.develocity") version "4.1.1"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "2.2"
    id("com.fueledbycaffeine.spotlight") version "1.3.3"
    id("org.gradle.toolchains.foojay-resolver") version "1.0.0"
}
rootProject.name = "AndroidCacheFixPluginAGP9"
develocity {
    server = "https://ge.solutions-team.gradle.com/"
    allowUntrustedServer = true
    buildScan {
        uploadInBackground.set(false)
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
} 
include (":core:push")
include (":core:contact")
include (":core:login")
include (":core:identity")
include (":core:checkout")
include (":core:cart")
include (":core:user")
include (":core:profile")
include (":core:feed")
include (":core:comment")
include (":feature:post")
include (":feature:search")
include (":feature:location")
include (":feature:network")
include (":feature:sync")
include (":feature:share")
include (":feature:group")
include (":feature:message")
include (":feature:notification")
include (":feature:setting")
include (":domain:account")
include (":domain:session")
include (":domain:analytics")
include (":domain:report")
include (":domain:log")
include (":domain:status")
include (":domain:metric")
include (":domain:task")
include (":domain:calendar")
include (":domain:event")
include (":repository:alarm")
include (":repository:timer")
include (":repository:file")
include (":repository:document")
include (":repository:note")
include (":repository:todo")
include (":repository:list")
include (":repository:map")
include (":repository:weather")
include (":repository:forecast")
include (":model:news")
include (":model:article")
include (":model:podcast")
include (":model:video")
include (":model:photo")
include (":model:gallery")
include (":model:media")
include (":model:audio")
include (":model:playlist")
include (":model:push-contact")
include (":app:app")
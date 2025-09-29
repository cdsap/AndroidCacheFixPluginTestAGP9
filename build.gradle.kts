plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.ksp) apply false
    alias(libs.plugins.hilt) apply false
    id("com.autonomousapps.dependency-analysis") version "2.19.0" apply true
    id("org.gradle.android.cache-fix") version "3.0.1" apply false
}

subprojects {
   plugins.withType<com.android.build.gradle.api.AndroidBasePlugin>() {
       apply(plugin = "org.gradle.android.cache-fix")
   }
}
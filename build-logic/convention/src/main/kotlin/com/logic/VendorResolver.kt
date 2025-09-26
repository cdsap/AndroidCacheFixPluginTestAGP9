package com.logic
import org.gradle.jvm.toolchain.JvmVendorSpec
import org.gradle.api.Project

class VendorResolver {
fun detectCurrentVendor(): JvmVendorSpec {
    val v = System.getProperty("java.vendor").lowercase()

    return when {
        // Eclipse Temurin / Adoptium
        "adoptium" in v || "temurin" in v || "eclipse" in v -> JvmVendorSpec.ADOPTIUM
        // Azul Zulu
        "azul" in v || "zulu" in v -> JvmVendorSpec.AZUL
        // BellSoft Liberica
        "bellsoft" in v || "liberica" in v -> JvmVendorSpec.BELLSOFT
        // Amazon Corretto
        "amazon" in v || "corretto" in v -> JvmVendorSpec.AMAZON
        // Oracle
        "oracle" in v -> JvmVendorSpec.ORACLE
        // Microsoft
        "microsoft" in v -> JvmVendorSpec.MICROSOFT
        // SAP
        "sap" in v -> JvmVendorSpec.SAP
        // IBM / Semeru
        "ibm" in v || "semeru" in v -> JvmVendorSpec.IBM
        // GraalVM
        "graal" in v -> JvmVendorSpec.GRAAL_VM
        // Fallback: match the literal vendor string
        else -> JvmVendorSpec.matching(System.getProperty("java.vendor"))
    }
}
}
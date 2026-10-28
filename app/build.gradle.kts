plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "in.govtexampathshala.pahalwanmilk"
    compileSdk = 35

    defaultConfig {
        applicationId = "in.govtexampathshala.pahalwanmilk"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}

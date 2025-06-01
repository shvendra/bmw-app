plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.app.myworker"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.app.myworker"
        minSdk = 21
        targetSdk = 34
        versionCode = 7
        versionName = "6.7"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // ✅ Facebook Android SDK
    implementation("com.facebook.android:facebook-android-sdk:latest.release") // ✅ Facebook SDK

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("com.google.devtools.ksp")
    id("androidx.room")



}

android {
    namespace = "com.example.firstlessonapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.firstlessonapp"
        minSdk = 28
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    room {
        schemaDirectory("$projectDir/schemas")
    }
}
val roomVersion = "2.6.1"

dependencies {
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room)
    implementation(libs.firebase.firestore.ktx)
    ksp(libs.androidx.room.compiler.v250)

    implementation (libs.room.ktx.v251)
    implementation (libs.androidx.runtime.livedata)

    implementation (libs.androidx.lifecycle.livedata.ktx)
    implementation (libs.androidx.lifecycle.viewmodel.ktx)

    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.firebase.crashlytics.buildtools)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation(kotlin("reflect"))
}


//plugins {
//    id 'com.android.application'
//    id 'org.jetbrains.kotlin.android'
//    id 'kotlin-kapt' // Սրա առկայությունը պարտադիր է Room-ի համար
//}
//
//android {
//    compileSdk 34
//
//    defaultConfig {
//        applicationId "com.example.yourapp"
//        minSdk 21
//        targetSdk 34
//        versionCode 1
//        versionName "1.0"
//
//        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
//    }
//
//    buildFeatures {
//        compose true
//    }
//
//    composeOptions {
//        kotlinCompilerExtensionVersion "1.5.0"
//    }
//
//    kotlinOptions {
//        jvmTarget = "1.8"
//    }
//}
//
//dependencies {
//    def room_version = "2.6.0"
//
//    // Room
//    implementation "androidx.room:room-runtime:$room_version"
//    kapt "androidx.room:room-compiler:$room_version"  // ✅ ԿԱՐԵՎՈՐ է
//
//    // Room with Kotlin Coroutines
//    implementation "androidx.room:room-ktx:$room_version"  // ✅ Coroutine-ների աջակցություն
//
//    // Jetpack Compose
//    implementation "androidx.compose.ui:ui:1.5.0"
//    implementation "androidx.compose.material:material:1.5.0"
//    implementation "androidx.compose.ui:ui-tooling-preview:1.5.0"
//    debugImplementation "androidx.compose.ui:ui-tooling:1.5.0"
//
//    // Lifecycle
//    implementation "androidx.lifecycle:lifecycle-runtime-ktx:2.6.1"
//    implementation "androidx.activity:activity-compose:1.7.2"
//
//    // Coroutine
//    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3"
//    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3"
//
//    // Testing (optional)
//    testImplementation "junit:junit:4.13.2"
//    androidTestImplementation "androidx.test.ext:junit:1.1.5"
//    androidTestImplementation "androidx.test.espresso:espresso-core:3.5.1"
//}
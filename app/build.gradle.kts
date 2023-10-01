plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
//    id("com.android.library")
}

android {
    namespace = "com.example.hannarapiproject"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.jio.healthSampleApp.module"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }
//    repositories {
//        flatDir {
//            dirs 'libs'
//        } }


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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

}

dependencies {
//    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar", "*.aar"))))

//    implementation fileTree (dir: "libs", include: ["*.aar"])
//    implementation fileTree ( dir: "libs")
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.0")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation(files("/Users/vishal2.kumawat/StudioProjects/HannarApiProject/app/libs/multicriteriasdk-release.aar"))
    implementation(files("/Users/vishal2.kumawat/StudioProjects/HannarApiProject/app/libs/JioHealth_ECG_Release_V1.0.aar"))
    implementation(files("/Users/vishal2.kumawat/StudioProjects/HannarApiProject/app/libs/JioHealth_SDK_V2.0.0.aar"))
    implementation(files("/Users/vishal2.kumawat/StudioProjects/HannarApiProject/app/libs/ycbtsdk-release.3.1.0.aar"))
    implementation ("com.neovisionaries:nv-bluetooth:1.8")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

//    implementation (name: 'ycbtsdk-release.3.1.0', ext: 'aar')
//    implementation("com.flyco.dialog:FlycoDialog_Lib:1.3.2@aar")
//    implementation("com.squareup.retrofit2:retrofit:2.7.2")
//    implementation("com.squareup.retrofit2:converter-gson:2.7.2")
//    implementation("com.fasterxml.jackson.core:jackson-databind:2.14.0")

}
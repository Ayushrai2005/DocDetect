plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "ggv.ayush.docdetect"
    compileSdk = 34

    defaultConfig {
        applicationId = "ggv.ayush.docdetect"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true

    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    val lifecycle_version = "2.6.1"
    val camerax_version = "1.3.0-beta02"
    val accompanist_version = "0.31.6-rc"
    lintChecks("com.slack.lint.compose:compose-lint-checks:1.2.0")

    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation ("androidx.compose:compose-bom:2023.06.01")
    implementation ("androidx.compose.ui:ui")
    implementation ("androidx.compose.ui:ui-graphics")
    implementation ("androidx.compose.ui:ui-tooling-preview")
    implementation(libs.androidx.material3)
    implementation ("androidx.compose.material:material-icons-extended")
    implementation ("androidx.compose.material:material:1.4.3")
    implementation ("androidx.cardview:cardview:1.0.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")

    debugImplementation ("androidx.compose.ui:ui-tooling")
    debugImplementation ("androidx.compose.ui:ui-test-manifest")

    ///// LIFECYCLE /////
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycle_version")
    implementation ("androidx.lifecycle:lifecycle-runtime-compose:$lifecycle_version")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version")

    //// CAMERA STUFF ////
    implementation("androidx.camera:camera-camera2:$camerax_version")
    implementation ("androidx.camera:camera-lifecycle:$camerax_version")
    implementation ("androidx.camera:camera-view:$camerax_version")
    implementation ("androidx.camera:camera-extensions:$camerax_version")

    //// ML-KIT ////
    implementation("com.google.mlkit:text-recognition:16.0.0")

    //// ACCOMPANIST ////
    implementation("com.google.accompanist:accompanist-permissions:$accompanist_version")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("androidx.compose:compose-bom:2022.10.00")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}
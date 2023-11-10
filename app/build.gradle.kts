plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.gms.google-services")
}
android {
    namespace = "com.unitech.zekshoppingmall"
    compileSdk = 34

    buildFeatures {
        viewBinding = true
    }

    defaultConfig {
        applicationId = "com.unitech.zekshoppingmall"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {



    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
//    implementation("com.google.gms:google-services:4.4.0")
//    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.5")

    implementation ("androidx.room:room-runtime:2.6.0")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    kapt ("androidx.room:room-compiler:2.6.0")
    implementation ("androidx.room:room-ktx:2.6.0")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
//

    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.retrofit2:adapter-rxjava2:2.9.0")

    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.5")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.5")
//
//
    implementation ("io.reactivex.rxjava2:rxjava:2.2.6")
    implementation ("io.reactivex.rxjava2:rxandroid:2.1.1")
//
    implementation ("com.github.bumptech.glide:glide:4.11.0")
//
    implementation ("androidx.preference:preference-ktx:1.2.1")
//
    implementation ("com.google.firebase:firebase-analytics")
    implementation(platform("com.google.firebase:firebase-bom:32.5.0"))
    implementation ("com.google.firebase:firebase-auth")
    implementation ("com.google.firebase:firebase-database")
    implementation ("com.google.firebase:firebase-storage")
    implementation ("com.google.firebase:firebase-messaging")
    implementation ("de.hdodenhof:circleimageview:3.1.0")
    kapt("com.github.bumptech.glide:glide:4.11.0")
    kapt("com.github.bumptech.glide:compiler:4.11.0")
    implementation ("com.github.pgreze:android-reactions:1.3")
    implementation ("com.github.3llomi:CircularStatusView:V1.0.3")


//
    implementation ("pl.droidsonroids.gif:android-gif-drawable:1.2.17")
}
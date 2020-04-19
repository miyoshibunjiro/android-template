package dependencies

object Dep {

    object GradlePlugin {

        object Android {
            private const val version = "3.6.2"
            const val android = "com.android.tools.build:gradle:$version"
            const val safeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${AndroidX.Navigation.version}"
        }

        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
        const val kotlinSerialization = "org.jetbrains.kotlin:kotlin-serialization:${Kotlin.version}"

        const val releaseHub = "com.releaseshub:releases-hub-gradle-plugin:1.4.2"
    }

    object Test {
        const val junit = "junit:junit:4.13"
        const val androidJunit4Ktx = "androidx.test.ext:junit-ktx:1.1.1"
        const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
        const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Kotlin.Coroutines.version}"
        const val kotlinTestAssertions = "io.kotlintest:kotlintest-assertions:3.1.10"
        const val testingKtx = "androidx.navigation:navigation-testing:2.3.0-alpha03"
    }

    object AndroidX {

        const val coreKtx = "androidx.core:core-ktx:1.2.0"
        const val appCompat = "androidx.appcompat:appcompat:1.1.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
        const val emoji = "androidx.emoji:emoji-appcompat:1.0.0"
        const val design = "com.google.android.material:material:1.2.0-alpha06"
        const val fragmentKtx = "androidx.fragment:fragment-ktx:1.2.4"

        object LiveData {
            private const val version = "2.2.0"
            const val liveDataCoreKtx = "androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0"
            const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
        }

        object Navigation {
            const val version = "2.3.0-alpha05"
            const val runtimeKtx = "androidx.navigation:navigation-runtime-ktx:$version"
            const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
            const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
        }
    }

    object Kotlin {
        const val version = "1.3.72"

        const val stdlibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common:$version"
        const val stdlibJvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"

        object Coroutines {
            const val version = "1.3.5"
            const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
            const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        }

        object Serialization {
            private const val version = "0.20.0"

            const val serializationAndroid = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:$version"
        }
    }

    object Ktor {
        private const val version = "1.3.1"
        const val clientCore = "io.ktor:ktor-client-core:$version"
        const val clientAndroid = "io.ktor:ktor-client-okhttp:$version"
        const val json = "io.ktor:ktor-client-json-jvm:$version"
        const val serialization = "io.ktor:ktor-client-serialization-jvm:$version"
    }

    object OkHttp {
        private const val version = "4.5.0"
        const val client = "com.squareup.okhttp3:okhttp:$version"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
    }

    object Groupie {
        private const val version = "2.8.0"
        const val groupie = "com.xwray:groupie:$version"
        const val databinding = "com.xwray:groupie-databinding:$version"
    }

    object Coil {
        private const val version = "0.9.5"
        const val coil = "io.coil-kt:coil:$version"
    }

    object Klock {
        private const val version = "1.9.1"
        const val common = "com.soywiz.korlibs.klock:klock:$version"
    }

    object MockK {
        const val jvm = "io.mockk:mockk:1.9.3"
    }

    object Timber {
        const val android = "com.jakewharton.timber:timber-android:5.0.0-SNAPSHOT"
    }

    object Insetter {
        const val insetter = "dev.chrisbanes:insetter-ktx:0.2.1"
    }

}

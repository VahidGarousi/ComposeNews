plugins {
    id("composenews.android.library")
    id("composenews.android.hilt")
}

android {
    namespace = "ir.composenews.sync"
}

dependencies {
    api(projects.domain.market)
    libs.apply {
        implementation(hilt.work)
        implementation(startup.runtime)
        implementation(work.runtime.ktx)
    }
}

package com.nc.domain_release.system


enum class BuildFlavor {
    Prod, Stg, Qa, Dev;

    companion object {
        fun fromString(flavorStr: String): BuildFlavor = when (flavorStr) {
            "dev" -> Dev
            "prod" -> Prod
            "stg" -> Stg
            "qa" -> Qa
            else -> Dev
        }
    }
}
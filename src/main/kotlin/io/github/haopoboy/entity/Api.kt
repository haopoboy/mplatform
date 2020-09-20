package io.github.haopoboy.entity

class Api(
        var id: String,
        var name: String,
        var get: Get? = null
) {

    companion object {
        fun getFor(name: String) = Api("0", name, Get())
    }

    class Get(var summary: String? = null, var parameters: List<Parameter> = listOf())
    class Parameter(var name: String, var description: String? = null)
}
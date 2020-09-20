package io.github.haopoboy.controller

import io.github.haopoboy.entity.Api
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Enable multiple root paths for flexible development.
 */
@RestController
@RequestMapping("/", "/api")
class ApiController {

    @GetMapping("{name}")
    fun get(@PathVariable name: String, @PageableDefault pageable: Pageable): Any {
        return PageImpl(listOf(Api.getFor(name)))
    }

    @GetMapping("{name}/{id}")
    fun getById(@PathVariable name: String, @PathVariable id: String, @PageableDefault pageable: Pageable): Any {
        return Api(id, name, Api.Get())
    }

    @GetMapping("/openapi.json")
    fun openApiV3(): Any {
        return mapOf<String, Any>()
    }

}

package com.oguz.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.scheduling.annotation.EnableAsync

@Configuration
@ComponentScan("com.oguz.kotlin")
@SpringBootApplication
@EnableAutoConfiguration
@EnableElasticsearchRepositories(basePackages = arrayOf("com.oguz.kotlin.repositories"))
@EnableJpaRepositories(basePackages = arrayOf("com.oguz.kotlin.repositories"))
@EnableAsync
open class DemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}

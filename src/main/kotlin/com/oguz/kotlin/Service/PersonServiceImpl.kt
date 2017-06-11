package com.oguz.kotlin.Service

import com.oguz.kotlin.Model.Person
import com.oguz.kotlin.Repositories.PersonRepository
import org.springframework.stereotype.Service

/**
 * Created by oguzhankaracullu on 11/06/2017.
 */
@Service
class PersonServiceImpl(val personRepository: PersonRepository) : PersonService {
    override fun findByName(name: String): MutableIterable<Person>? {
        return personRepository.findByName(name)
    }

    override fun getAllPeople(): MutableIterable<Person>? = personRepository.findAll()

    override fun getCount(): Long = personRepository.count()

    override fun createPerson(person: Person): Person? = personRepository.save(person)

    override fun editPerson(person: Person): Person? = personRepository.save(person)

    override fun createBulkPerson(personlist: List<Person>): MutableIterable<Person>? {
        return personRepository.save(personlist)
    }

    override fun findByUsername(username: String): Person? = personRepository.findByUsername(username)

}
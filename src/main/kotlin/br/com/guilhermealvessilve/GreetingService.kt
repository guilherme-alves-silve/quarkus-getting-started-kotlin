package br.com.guilhermealvessilve

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {

    fun hello(name: String) = Greeting(name)
}
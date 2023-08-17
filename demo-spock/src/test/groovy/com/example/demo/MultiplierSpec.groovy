package com.example.demo

import spock.lang.Specification

class MultiplierSpec extends Specification {

    def "Multiply two numbers and return the result"() {
        when: "a new Multiplier class is created"
        def multi = new Multiplier();

        then: "3 times 7 is 21"
        multi.multiply(3, 7) == 21

        and: "if a is 4 (2 plus 3) times 5 is 25"
        multi.multiply(4, 5) == 25
    }

    def "Combine both multiplication and addition"() {

        when: "a new Multiplier and Adder classes are created"
        def adder = new Adder();
        def multi = new Multiplier()

        then: "3 times (2 plus 3) is 15"
        multi.multiply(3, adder.add(2, 3)) == 15

        and: "(2 plus 3) times 3 is also 15"
        multi.multiply(adder.add(2, 3),3) == 15

        and: "if a is 4 (2 plus 3) times a is 25"
        multi.multiply(4, adder.add(2, 3)) == 25
    }

}

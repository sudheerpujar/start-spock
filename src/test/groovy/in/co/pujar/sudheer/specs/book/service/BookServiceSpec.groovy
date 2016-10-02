package in.co.pujar.sudheer.specs.book.service

import groovy.util.logging.Slf4j
import spock.lang.Specification


/**
 * Created by sudhe on 07-07-2016.
 */
@Slf4j
class BookServiceSpec extends Specification {
    def setupSpec(){
        log.debug("setupSpec() - Runs once per Specification");
    }

    def setup(){
        log.debug("setup() Runs before every feature method");
    }

    def cleanup(){
        log.debug ("Cleanup method - Runs  after every feature method.");

    }
    def cleanupSpec(){
        log.debug ("cleanupSpec() - Runs only once per specification");
    }
    def "retrieved book object is not null"(){
        log.debug ("Feature method 1 - retrieved book object is not null- start");
        expect : a!=b
        where : a <<[1,2]
                b <<[2,1]
    }

}



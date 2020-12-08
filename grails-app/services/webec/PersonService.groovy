package webec

import grails.gorm.transactions.Transactional

@Transactional
class PersonService {

    def get(Serializable id){
        Person.get(id)
    }

}

package webec

import grails.gorm.transactions.Transactional

@Transactional
class LocationService {

    def get(Serializable id){
        Location.get(id)
    }

}

package webec

import grails.gorm.transactions.Transactional

@Transactional
class MeetupService {

    void delete(Serializable id) {
        Meetup.get(id).delete()
    }
}

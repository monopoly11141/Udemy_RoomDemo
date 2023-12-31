package com.example.udemy_roomdemo.db

class SubscriberRepository(private val subscriberDAO : SubscriberDAO) {

    val allSubscribers = subscriberDAO.getAllSubscribers()

    suspend fun insert(subscriber : Subscriber) {
        subscriberDAO.insertSubscriber(subscriber)
    }

    suspend fun update(subscriber : Subscriber) {
        subscriberDAO.updateSubscriber(subscriber)
    }

    suspend fun delete(subscriber : Subscriber) {
        subscriberDAO.deleteSubscriber(subscriber)
    }

    suspend fun deleteAll() {
        subscriberDAO.deleteAllSubscribers()
    }

}
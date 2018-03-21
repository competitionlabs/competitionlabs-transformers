/***
  *  Copyright (C) Competition Labs Ltd - All Rights Reserved
  *  Unauthorized copying of this file, via any medium is strictly prohibited
  *  Proprietary and confidential
  *  Written by Competition Labs Ltd, 2017
  */
package com.competitionlabs.transformers

trait CLMQTransformer {
	
	/**
	  * This method gets executed when a message is received on the message queue
	  * @param message The message
	  * @param routingKey The routing key for the incoming message from the Envelope of AMQP client
	  * @param exchangeName The exchange name for the incoming message from the Envelope of AMQP client
	  * @param competitionLabsApi The CompetitionLabs API
	  */
	def rabbit(message: Array[Byte], routingKey: String, exchangeName: String, competitionLabsApi: CompetitionLabsApi): Unit = {}

	/**
	  * This method gets executed when a message is received on the message queue
	  * @param message The value for the incoming message from the Kafka broker
	  * @param key The key for the incoming message from the Kafka broker
	  * @param competitionLabsApi The CompetitionLabs API
	  */
	def kafka(key: Array[Byte], message: Array[Byte], competitionLabsApi: CompetitionLabsApi): Unit = {}
}

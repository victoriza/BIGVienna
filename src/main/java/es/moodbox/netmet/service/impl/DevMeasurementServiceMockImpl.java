package es.moodbox.netmet.service.impl;

import es.moodbox.netmet.service.DevMeasurementService;

public class DevMeasurementServiceMockImpl implements DevMeasurementService{

	private final static int MAX = 100;
	private final static int MIN = 0;

	/**
	 * Does the measurement of a given device 
	 *
	 * @param deviceId the devices Id to do the measurement
	 * @throws InterruptedException if the method is not able to finish
	 * the measurement
	 *
	 * @author Víctor Suárez
	 */
	public double obtainMeasurement(int deviceId)throws InterruptedException {
		long sleep = Math.round(Math.random() * ( MAX - MIN ));
		Thread.sleep(sleep);

		return Math.round(Math.random() * ( MIN - MAX ));
	}

}
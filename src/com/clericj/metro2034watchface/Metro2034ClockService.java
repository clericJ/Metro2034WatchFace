package com.clericj.metro2034watchface;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

//—ервис добавлен, так-как без него со временем широковещательные сообщени€
//переставали приходить и циферблат "зависал"

public class Metro2034ClockService extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		return null;
	}
	public void onCreate() {
		super.onCreate();
		System.out.println("service created");
	}

	public int onStartCommand(Intent intent, int flags, int startId) {
		System.out.println("service started");
		return super.onStartCommand(intent, flags, startId);
	}

}
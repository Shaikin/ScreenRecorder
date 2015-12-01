package com.proj.screenrecorder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import atu.testrecorder.ATUTestRecorder;


public class ScreenRecorder_ATU {
	static ATUTestRecorder recorder;
	

	public static void startRecorder() throws Exception{
		DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		  Date date = new Date();
		  //Created object of ATUTestRecorder
		  //Provide path to store videos and file name format.
		recorder = new ATUTestRecorder("C:\\SelVideos\\","TestVideo-"+dateFormat.format(date),false);
		
		//To start video recording.
		  recorder.start(); 
	}
	
	
	
	public static void stopRecorder() throws Exception{
		recorder.stop();
	}

}

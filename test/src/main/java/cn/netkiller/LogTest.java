package cn.netkiller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;



public class LogTest {

	private static final Logger logger = LoggerFactory.getLogger(LogTest.class);

	public LogTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marker notifyAdmin = MarkerFactory.getMarker("NOTIFY_ADMIN");
		logger.info("AAAAAAAAA");
		logger.info(notifyAdmin, "BBBBBBBBB");
		logger.error(notifyAdmin, "This is a serious an error requiring the admin's attention", new Exception("Just testing"));

	}

}

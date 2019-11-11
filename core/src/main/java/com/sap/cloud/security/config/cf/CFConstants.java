package com.sap.cloud.security.config.cf;

public class CFConstants {

	public static class XSUAA {
		public static final String CREDENTIALS = "credentials";
		public static final String CLIENT_ID = "clientid";
		public static final String CLIENT_SECRET = "clientsecret";
		public static final String APP_ID = "xsappname";
	}

	public static final String URL = "url";
	public static final String UAA_DOMAIN = "uaadomain"; // XSUAA und IAS
	public static final String SERVICE_PLAN = "plan";

	public enum ServiceName {
		XSUAA("xsuaa"), IAS("iasb");

		private final String jsonKey;

		ServiceName(String jsonKey) {
			this.jsonKey = jsonKey;
		}

		String getJsonKey() {
			return jsonKey;
		}
	}

	enum Plan {
		BROKER, APPLICATION;

		public static Plan from(String planAsString) {
			return Plan.valueOf(planAsString.toUpperCase());
		}
	}
}

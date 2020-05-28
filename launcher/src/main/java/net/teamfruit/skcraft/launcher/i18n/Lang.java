package net.teamfruit.skcraft.launcher.i18n;

public enum Lang {
	ENGLISH("English", "en_us", "MORIMORI0317, Google Translation"), JAPANESE("Japanese", "ja_jp",
			"Kamesuta, MG8853, MORIMORI0317");

	private String name;
	private String id;
	private String translataor;

	private Lang(String name, String id, String translator) {
		this.name = name;
		this.id = id;
		this.translataor = translator;
	}

	public String getName() {
		return this.name;
	}

	public String getId() {
		return this.id;
	}

	public String getTranslataor() {
		return this.translataor;
	}

	public static Lang getFromName(String name) {
		for (Lang la : values()) {
			if (la.getName().equals(name)) {
				return la;
			}
		}
		return ENGLISH;
	}
}

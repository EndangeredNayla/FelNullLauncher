package net.teamfruit.skcraft.launcher.i18n;

import java.util.Locale;
import java.util.logging.Level;

import com.skcraft.launcher.Launcher;
import com.skcraft.launcher.util.SharedLocale;

import lombok.extern.java.Log;

@Log
public class I18n {

	public static void changeLang(Lang la, Launcher launcher) {
		log.log(Level.INFO, "Change Language");
		launcher.getConfig().setLang(la.getName());
	}

	public static void load(Launcher launcher) {
		Lang lang = Lang.getFromName(launcher.getConfig().getLang());
		SharedLocale.loadBundle("com.skcraft.launcher.lang.Launcher_" + lang.getId(), Locale.getDefault());
	}

}

package com.athensoft.info.lang;

import java.util.HashMap;
import java.util.Map;

public class LanguageMap {
	static Map<Integer,String> languageMap  = new HashMap<Integer,String>();
	static{
		languageMap.put(4,"Chinese (Simplified)");
		languageMap.put(1025,"Arabic");
		languageMap.put(1026,"Bulgarian");
		languageMap.put(1027,"Catalan");
		languageMap.put(1028,"Chinese");
		languageMap.put(1029,"Czech");
		languageMap.put(1030,"Danish");
		languageMap.put(1031,"German");
		languageMap.put(1032,"Greek");
		languageMap.put(1033,"English");
		languageMap.put(1035,"Finnish");
		languageMap.put(1036,"French");
		languageMap.put(1037,"Hebrew");
		languageMap.put(1038,"Hungarian");
		languageMap.put(1039,"Icelandic");
		languageMap.put(1040,"Italian");
		languageMap.put(1041,"Japanese");
		languageMap.put(1042,"Korean");
		languageMap.put(1043,"Dutch");
		languageMap.put(1044,"Norwegian");
		languageMap.put(1045,"Polish");
		languageMap.put(1046,"Portuguese");
		languageMap.put(1048,"Romanian");
		languageMap.put(1049,"Russian");
		languageMap.put(1050,"Croatian");
		languageMap.put(1051,"Slovak");
		languageMap.put(1052,"Albanian");
		languageMap.put(1053,"Swedish");
		languageMap.put(1054,"Thai");
		languageMap.put(1055,"Turkish");
		languageMap.put(1056,"Urdu");
		languageMap.put(1057,"Indonesian");
		languageMap.put(1058,"Ukrainian");
		languageMap.put(1059,"Belarusian");
		languageMap.put(1060,"Slovenian");
		languageMap.put(1061,"Estonian");
		languageMap.put(1062,"Latvian");
		languageMap.put(1063,"Lithuanian");
		languageMap.put(1065,"Farsi");
		languageMap.put(1066,"Vietnamese");
		languageMap.put(1067,"Armenian");
		languageMap.put(1068,"Azeri");
		languageMap.put(1069,"Basque");
		languageMap.put(1071,"Macedonian");
		languageMap.put(1078,"Afrikaans");
		languageMap.put(1079,"Georgian");
		languageMap.put(1080,"Faroese");
		languageMap.put(1081,"Hindi");
		languageMap.put(1086,"Malay");
		languageMap.put(1087,"Kazakh");
		languageMap.put(1088,"Kyrgyz");
		languageMap.put(1089,"Swahili");
		languageMap.put(1091,"Uzbek");
		languageMap.put(1092,"Tatar");
		languageMap.put(1094,"Punjabi");
		languageMap.put(1095,"Gujarati");
		languageMap.put(1097,"Tamil");
		languageMap.put(1098,"Telugu");
		languageMap.put(1099,"Kannada");
		languageMap.put(1102,"Marathi");
		languageMap.put(1103,"Sanskrit");
		languageMap.put(1104,"Mongolian");
		languageMap.put(1110,"Galician");
		languageMap.put(1111,"Konkani");
		languageMap.put(1114,"Syriac");
		languageMap.put(1125,"Dhivehi");
		languageMap.put(2049,"Arabic");
		languageMap.put(2052,"Chinese");
		languageMap.put(2055,"German");
		languageMap.put(2057,"English");
		languageMap.put(2058,"Spanish");
		languageMap.put(2060,"French");
		languageMap.put(2064,"Italian");
		languageMap.put(2067,"Dutch");
		languageMap.put(2068,"Norwegian");
		languageMap.put(2070,"Portuguese");
		languageMap.put(2074,"Serbian");
		languageMap.put(2077,"Swedish");
		languageMap.put(2092,"Azeri");
		languageMap.put(2110,"Malay");
		languageMap.put(2115,"Uzbek");
		languageMap.put(3073,"Arabic");
		languageMap.put(3076,"Chinese");
		languageMap.put(3079,"German");
		languageMap.put(3081,"English");
		languageMap.put(3082,"Spanish");
		languageMap.put(3084,"French");
		languageMap.put(3098,"Serbian");
		languageMap.put(4097,"Arabic");
		languageMap.put(4100,"Chinese");
		languageMap.put(4103,"German");
		languageMap.put(4105,"English");
		languageMap.put(4106,"Spanish");
		languageMap.put(4108,"French");
		languageMap.put(5121,"Arabic");
		languageMap.put(5124,"Chinese");
		languageMap.put(5127,"German");
		languageMap.put(5129,"English");
		languageMap.put(5130,"Spanish");
		languageMap.put(5132,"French");
		languageMap.put(6145,"Arabic");
		languageMap.put(6153,"English");
		languageMap.put(6154,"Spanish");
		languageMap.put(6156,"French");
		languageMap.put(7169,"Arabic");
		languageMap.put(7177,"English");
		languageMap.put(7178,"Spanish");
		languageMap.put(8193,"Arabic");
		languageMap.put(8201,"English");
		languageMap.put(8202,"Spanish");
		languageMap.put(9217,"Arabic");
		languageMap.put(9225,"English");
		languageMap.put(9226,"Spanish");
		languageMap.put(10241,"Arabic");
		languageMap.put(10249,"English");
		languageMap.put(10250,"Spanish");
		languageMap.put(11265,"Arabic");
		languageMap.put(11273,"English");
		languageMap.put(11274,"Spanish");
		languageMap.put(12289,"Arabic");
		languageMap.put(12297,"English");
		languageMap.put(12298,"Spanish");
		languageMap.put(13313,"Arabic");
		languageMap.put(13321,"English");
		languageMap.put(13322,"Spanish");
		languageMap.put(14337,"Arabic");
		languageMap.put(14346,"Spanish");
		languageMap.put(15361,"Arabic");
		languageMap.put(15370,"Spanish");
		languageMap.put(16385,"Arabic");
		languageMap.put(16394,"Spanish");
		languageMap.put(17418,"Spanish");
		languageMap.put(18442,"Spanish");
		languageMap.put(19466,"Spanish");
		languageMap.put(20490,"Spanish");
		languageMap.put(31748,"Chinese (Traditional)");
	}
	
	public LanguageMap(){
		
	}
	
	public static String getLangName(Integer langNo){
		return languageMap.get(langNo);
	}
	
	public static void main(String[] args){
		System.out.println(LanguageMap.getLangName(2052));
		System.out.println(LanguageMap.getLangName(1033));
		System.out.println(LanguageMap.getLangName(3084));
		System.out.println(LanguageMap.getLangName(31748));
		
	}
}
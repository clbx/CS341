package com.clbx.designpattern;

public class Kingdom {
	private final String name;
	private final King king;
	private Land land;
	private Army army;
	private final Culture culture;
	private final Race race;
	
	
	Kingdom(KingdomBuilder builder){
		this.name = builder.name;
		this.king = builder.king;
		this.land = builder.land;
		this.army = builder.army;
		this.culture = builder.culture;
		this.race = builder.race;
	}
	
	
	public class KingdomBuilder{
		
		private final String name;
		private King king;
		private Land land;
		private Army army;
		private Culture culture;
		private Race race;
		
		public KingdomBuilder(String name) {
			this.name = name;
		}
		
		public KingdomBuilder appointKing(King king) {
			this.king = king;
			return this;
		}
		
		public KingdomBuilder claimLand(Land land) {
			this.land = land;
			return this;
		}
		
		public KingdomBuilder raiseArmy(Army army) {
			this.army = army;
			return this;
		}
		
		public KingdomBuilder createCulture(Culture culture) {
			this.culture = culture;
			return this;
		}
		
		public KingdomBuilder giveRace(Race race) {
			this.race = race;
			return this;
		}
		
	}
	
	
	

}


